
package ru._1c.ssl.exchange_2_0_1_6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ru._1c.v8._8_1.data.core.Structure;


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
 *         &lt;element name="AdditionalSettings" type="{http://v8.1c.ru/8.1/data/core}Structure"/>
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
    "additionalSettings"
})
@XmlRootElement(name = "UpdateExchange")
public class UpdateExchange {

    @XmlElement(name = "ExchangePlanName", required = true)
    protected String exchangePlanName;
    @XmlElement(name = "NodeCode", required = true)
    protected String nodeCode;
    @XmlElement(name = "AdditionalSettings", required = true)
    protected Structure additionalSettings;

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
     * Gets the value of the additionalSettings property.
     * 
     * @return
     *     possible object is
     *     {@link Structure }
     *     
     */
    public Structure getAdditionalSettings() {
        return additionalSettings;
    }

    /**
     * Sets the value of the additionalSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Structure }
     *     
     */
    public void setAdditionalSettings(Structure value) {
        this.additionalSettings = value;
    }

}
