
package ru._1c.ssl.exchange_2_0_1_6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExchangePlanName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NodeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ResultMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "exchangePlanName",
    "nodeCode",
    "resultMessage"
})
@XmlRootElement(name = "GetIBParameters")
public class GetIBParameters {

    @XmlElement(name = "ExchangePlanName", required = true)
    protected String exchangePlanName;
    @XmlElement(name = "NodeCode", required = true, nillable = true)
    protected String nodeCode;
    @XmlElement(name = "ResultMessage", required = true, nillable = true)
    protected String resultMessage;

    /**
     * Gets the value of the exchangePlanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangePlanName() {
        return exchangePlanName;
    }

    /**
     * Sets the value of the exchangePlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangePlanName(String value) {
        this.exchangePlanName = value;
    }

    /**
     * Gets the value of the nodeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeCode() {
        return nodeCode;
    }

    /**
     * Sets the value of the nodeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeCode(String value) {
        this.nodeCode = value;
    }

    /**
     * Gets the value of the resultMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultMessage() {
        return resultMessage;
    }

    /**
     * Sets the value of the resultMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultMessage(String value) {
        this.resultMessage = value;
    }

}
