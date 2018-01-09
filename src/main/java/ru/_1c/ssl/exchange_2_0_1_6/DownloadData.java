
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
 *         &lt;element name="FileID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContinuousOperation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Operation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContinuousOperationAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "fileID",
    "continuousOperation",
    "operation",
    "continuousOperationAllowed"
})
@XmlRootElement(name = "DownloadData")
public class DownloadData {

    @XmlElement(name = "ExchangePlanName", required = true)
    protected String exchangePlanName;
    @XmlElement(name = "NodeCode", required = true)
    protected String nodeCode;
    @XmlElement(name = "FileID", required = true)
    protected String fileID;
    @XmlElement(name = "ContinuousOperation", required = true, type = Boolean.class, nillable = true)
    protected Boolean continuousOperation;
    @XmlElement(name = "Operation", required = true, nillable = true)
    protected String operation;
    @XmlElement(name = "ContinuousOperationAllowed")
    protected boolean continuousOperationAllowed;

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
     * Gets the value of the fileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileID() {
        return fileID;
    }

    /**
     * Sets the value of the fileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileID(String value) {
        this.fileID = value;
    }

    /**
     * Gets the value of the continuousOperation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContinuousOperation() {
        return continuousOperation;
    }

    /**
     * Sets the value of the continuousOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContinuousOperation(Boolean value) {
        this.continuousOperation = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    /**
     * Gets the value of the continuousOperationAllowed property.
     * 
     */
    public boolean isContinuousOperationAllowed() {
        return continuousOperationAllowed;
    }

    /**
     * Sets the value of the continuousOperationAllowed property.
     * 
     */
    public void setContinuousOperationAllowed(boolean value) {
        this.continuousOperationAllowed = value;
    }

}
