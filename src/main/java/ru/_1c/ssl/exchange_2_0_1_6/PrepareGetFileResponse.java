
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
 *         &lt;element name="return" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TransferId" type="{http://v8.1c.ru/8.1/data/core}UUID"/>
 *         &lt;element name="PartQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "_return",
    "transferId",
    "partQuantity"
})
@XmlRootElement(name = "PrepareGetFileResponse")
public class PrepareGetFileResponse {

    @XmlElement(name = "return", required = true, nillable = true)
    protected String _return;
    @XmlElement(name = "TransferId", required = true)
    protected String transferId;
    @XmlElement(name = "PartQuantity")
    protected int partQuantity;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturn(String value) {
        this._return = value;
    }

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
     * Gets the value of the partQuantity property.
     * 
     */
    public int getPartQuantity() {
        return partQuantity;
    }

    /**
     * Sets the value of the partQuantity property.
     * 
     */
    public void setPartQuantity(int value) {
        this.partQuantity = value;
    }

}
