package ru._1c;

import javax.xml.ws.WebServiceException;
import ru._1c.ssl.exchange_2_0_1_6.Exchange2016;
import ru._1c.ssl.exchange_2_0_1_6.Exchange2016PortType;
import ru._1c.v8._8_1.data.core.Structure;
import ru._1c.v8._8_1.data.core.ValueTree;

import javax.xml.ws.Holder;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public class Client1cExchange2016 {

    public boolean testConnection(String serviceURL, String user, String password, String exchangePlanName, String peerCode) throws ExchangeException {
        Authenticator.setDefault(new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, password.toCharArray());
            }
        });
        URL url = null;

        try {
            url = new URL(serviceURL);
        } catch (MalformedURLException e) {
            throw new ExchangeException(e.getMessage(), e);
        }
        Exchange2016 ss;
        ss = new Exchange2016(url);
        Exchange2016PortType port = ss.getExchange2016Soap();
        port.ping();
        Holder<String> outString = new Holder<String>();
        boolean testConnection = port.testConnection(exchangePlanName, peerCode, outString);
        if (!testConnection) {
            throw new ExchangeException(outString.value);
        }
        return true;
    }

    public String getData(String serviceURL, String user, String password, String tableName) {
        Authenticator.setDefault(new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, password.toCharArray());
            }
        });

        URL url = null;

        try {
            url = new URL(serviceURL);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        Exchange2016 ss;
        ss = new Exchange2016(url);
        Exchange2016PortType port = ss.getExchange2016Soap();
        port.ping();
        // получение данных базы максимум 2000  строк

        Structure result = port.getIBData(tableName);
        return result.getProperty().get(1).getValue().toString();
    }

    public Map<String, String> getIBParams(String serviceURL, String user, String password, String peerCode, String exchangePlanName) throws ExchangeException {
        Authenticator.setDefault(new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, password.toCharArray());
            }
        });

        URL url = null;

        try {
            url = new URL(serviceURL);
        } catch (MalformedURLException e) {
            throw new ExchangeException(e.getMessage(), e);
        }

        Exchange2016 ss;
        ss = new Exchange2016(url);
        Exchange2016PortType port = ss.getExchange2016Soap();
        port.ping();

        Holder<String> outString = new Holder<String>();
        boolean testConnectionOk;
        try {
            testConnectionOk = port.testConnection(exchangePlanName, peerCode, outString);
        } catch (Exception e){
            throw new ExchangeException(e.getMessage(),e);
        }
        Map<String, String> result = new HashMap<>();
        if (testConnectionOk) {
            Holder<String> operationId = new Holder<>();
            try {
                Structure paramsIB = port.getIBParameters(exchangePlanName, peerCode, operationId);
                result.put("ПланОбменаСуществует", paramsIB.getProperty().get(0).getValue().toString());
                result.put("ПрефиксИнформационнойБазы", paramsIB.getProperty().get(1).getValue().toString());
                result.put("ПрефиксИнформационнойБазыПоУмолчанию", paramsIB.getProperty().get(2).getValue().toString());
                result.put("НаименованиеИнформационнойБазы", paramsIB.getProperty().get(3).getValue().toString());
                result.put("НаименованиеИнформационнойБазыПоУмолчанию", paramsIB.getProperty().get(4).getValue().toString());
                result.put("НастройкиПараметровУчетаЗаданы", paramsIB.getProperty().get(5).getValue().toString());
                result.put("КодЭтогоУзла", paramsIB.getProperty().get(6).getValue().toString());
            } catch (Exception e){
                throw new ExchangeException(e.getMessage(),e);
            }
        } else {
            throw new ExchangeException(outString.value);
        }
        return result;
    }

    public boolean getDataFromWebService_ExchangePlan(String serviceURL, String user, String password, String peerCode, String exchangePlanName, String outFile) throws ExchangeException{

        Authenticator.setDefault(new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, password.toCharArray());
            }
        });

        URL url = null;

        try {
            url = new URL(serviceURL);
        } catch (MalformedURLException e) {
            throw new ExchangeException(e.getMessage(),e);
        }

        Exchange2016 ss;
        ss = new Exchange2016(url);
        Exchange2016PortType port = ss.getExchange2016Soap();
        port.ping();

        Holder<String> outString = new Holder<String>();
        Boolean testConnectionOk = port.testConnection(exchangePlanName, peerCode, outString);

        if (testConnectionOk) {

            Holder<String> fileId = new Holder<>();
            Holder<Boolean> continuousOperation = new Holder<>();
            Holder<String> operationId = new Holder<>();
            boolean continuousOperationAllowed = false;
            port.uploadData(exchangePlanName, peerCode, fileId, continuousOperation, operationId, continuousOperationAllowed);
            if (operationId.value != null) {
                String operationResult = port.getContinuousOperationStatus(operationId.value, outString);
                if (!outString.value.isEmpty()) {
                    throw new ExchangeException("getContinuousOperationStatus error: " + outString.value);
                }
                while ("Active".equals(operationResult)) {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        //ignore
                    }
                    operationResult = port.getContinuousOperationStatus(operationId.value, outString);

                    if (!outString.value.isEmpty()) {
                        throw new ExchangeException("getContinuousOperationStatus error: " + outString.value);
                    }
                }
            }
            java.math.BigDecimal partSize = new java.math.BigDecimal(1024);
            Holder<String> transferId = new Holder<>();
            Holder<Integer> partCount = new Holder<>();
            port.prepareGetFile(fileId.value, partSize, transferId, partCount);

            for (int i = 1; i <= partCount.value; i++) {
                Holder<byte[]> data = new Holder<>();
                port.getFilePart(transferId.value, i, data);
                String fileName2Save = (partCount.value == 1) ? outFile + ".zip" : outFile + "." + String.format("%03d", i);
                try {
                    Files.write(Paths.get(fileName2Save), data.value, java.nio.file.StandardOpenOption.CREATE);
                } catch (IOException e) {
                    throw new ExchangeException("Cannot write to file " + fileName2Save + ", reason: " + outString.value,e);
                }
            }
        } else {
            throw new ExchangeException("Connection failed, reason: " + outString.value);
        }
        return true;
    }
}
