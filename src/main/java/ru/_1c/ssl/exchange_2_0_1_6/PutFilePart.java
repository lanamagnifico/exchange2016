
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
 *         &lt;element name="TransferId" type="{http://v8.1c.ru/8.1/data/core}UUID"/>
 *         &lt;element name="PartNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PartData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
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
    "transferId",
    "partNumber",
    "partData"
})
@XmlRootElement(name = "PutFilePart")
public class PutFilePart {

    @XmlElement(name = "TransferId", required = true)
    protected String transferId;
    @XmlElement(name = "PartNumber", required = true, type = Integer.class, nillable = true)
    protected Integer partNumber;
    @XmlElement(name = "PartData", required = true)
    protected byte[] partData;

    /**
     * Gets the value of the transferId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferId() {
        return transferId;
    }

    /**
     * Sets the value of the transferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferId(String value) {
        this.transferId = value;
    }

    /**
     * Gets the value of the partNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPartNumber() {
        return partNumber;
    }

    /**
     * Sets the value of the partNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPartNumber(Integer value) {
        this.partNumber = value;
    }

    /**
     * Gets the value of the partData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPartData() {
        return partData;
    }

    /**
     * Sets the value of the partData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPartData(byte[] value) {
        this.partData = value;
    }

}
