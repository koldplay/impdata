
package com.bizruntime.stocktrade;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for stockTrdae complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stockTrdae">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adj_Close" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="close" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="high" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="low" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="open" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="security" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stockTrdae", propOrder = {
    "adjClose",
    "close",
    "date",
    "high",
    "low",
    "open",
    "security",
    "volume"
})
public class StockTrdae {

    @XmlElement(name = "adj_Close")
    protected Double adjClose;
    protected Double close;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    protected Double high;
    protected Double low;
    protected Double open;
    protected String security;
    protected Double volume;

    /**
     * Gets the value of the adjClose property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdjClose() {
        return adjClose;
    }

    /**
     * Sets the value of the adjClose property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdjClose(Double value) {
        this.adjClose = value;
    }

    /**
     * Gets the value of the close property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getClose() {
        return close;
    }

    /**
     * Sets the value of the close property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setClose(Double value) {
        this.close = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the high property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHigh() {
        return high;
    }

    /**
     * Sets the value of the high property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHigh(Double value) {
        this.high = value;
    }

    /**
     * Gets the value of the low property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLow() {
        return low;
    }

    /**
     * Sets the value of the low property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLow(Double value) {
        this.low = value;
    }

    /**
     * Gets the value of the open property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOpen() {
        return open;
    }

    /**
     * Sets the value of the open property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOpen(Double value) {
        this.open = value;
    }

    /**
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurity(String value) {
        this.security = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVolume(Double value) {
        this.volume = value;
    }

}
