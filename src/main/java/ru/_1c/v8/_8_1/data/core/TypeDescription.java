
package ru._1c.v8._8_1.data.core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for TypeDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TypeDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TypeSet" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TypeId" type="{http://v8.1c.ru/8.1/data/core}UUID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NumberQualifiers" type="{http://v8.1c.ru/8.1/data/core}NumberQualifiers" minOccurs="0"/>
 *         &lt;element name="StringQualifiers" type="{http://v8.1c.ru/8.1/data/core}StringQualifiers" minOccurs="0"/>
 *         &lt;element name="DateQualifiers" type="{http://v8.1c.ru/8.1/data/core}DateQualifiers" minOccurs="0"/>
 *         &lt;element name="BinaryDataQualifiers" type="{http://v8.1c.ru/8.1/data/core}BinaryDataQualifiers" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeDescription", propOrder = {
    "type",
    "typeSet",
    "typeId",
    "numberQualifiers",
    "stringQualifiers",
    "dateQualifiers",
    "binaryDataQualifiers"
})
public class TypeDescription {

    @XmlElement(name = "Type")
    protected List<QName> type;
    @XmlElement(name = "TypeSet")
    protected List<QName> typeSet;
    @XmlElement(name = "TypeId")
    protected List<String> typeId;
    @XmlElement(name = "NumberQualifiers")
    protected NumberQualifiers numberQualifiers;
    @XmlElement(name = "StringQualifiers")
    protected StringQualifiers stringQualifiers;
    @XmlElement(name = "DateQualifiers")
    protected DateQualifiers dateQualifiers;
    @XmlElement(name = "BinaryDataQualifiers")
    protected BinaryDataQualifiers binaryDataQualifiers;

    /**
     * Gets the value of the type property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     * 
     * 
     */
    public List<QName> getType() {
        if (type == null) {
            type = new ArrayList<QName>();
        }
        return this.type;
    }

    /**
     * Gets the value of the typeSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     * 
     * 
     */
    public List<QName> getTypeSet() {
        if (typeSet == null) {
            typeSet = new ArrayList<QName>();
        }
        return this.typeSet;
    }

    /**
     * Gets the value of the typeId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTypeId() {
        if (typeId == null) {
            typeId = new ArrayList<String>();
        }
        return this.typeId;
    }

    /**
     * Gets the value of the numberQualifiers property.
     * 
     * @return
     *     possible object is
     *     {@link NumberQualifiers }
     *     
     */
    public NumberQualifiers getNumberQualifiers() {
        return numberQualifiers;
    }

    /**
     * Sets the value of the numberQualifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberQualifiers }
     *     
     */
    public void setNumberQualifiers(NumberQualifiers value) {
        this.numberQualifiers = value;
    }

    /**
     * Gets the value of the stringQualifiers property.
     * 
     * @return
     *     possible object is
     *     {@link StringQualifiers }
     *     
     */
    public StringQualifiers getStringQualifiers() {
        return stringQualifiers;
    }

    /**
     * Sets the value of the stringQualifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringQualifiers }
     *     
     */
    public void setStringQualifiers(StringQualifiers value) {
        this.stringQualifiers = value;
    }

    /**
     * Gets the value of the dateQualifiers property.
     * 
     * @return
     *     possible object is
     *     {@link DateQualifiers }
     *     
     */
    public DateQualifiers getDateQualifiers() {
        return dateQualifiers;
    }

    /**
     * Sets the value of the dateQualifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateQualifiers }
     *     
     */
    public void setDateQualifiers(DateQualifiers value) {
        this.dateQualifiers = value;
    }

    /**
     * Gets the value of the binaryDataQualifiers property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryDataQualifiers }
     *     
     */
    public BinaryDataQualifiers getBinaryDataQualifiers() {
        return binaryDataQualifiers;
    }

    /**
     * Sets the value of the binaryDataQualifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryDataQualifiers }
     *     
     */
    public void setBinaryDataQualifiers(BinaryDataQualifiers value) {
        this.binaryDataQualifiers = value;
    }

}
