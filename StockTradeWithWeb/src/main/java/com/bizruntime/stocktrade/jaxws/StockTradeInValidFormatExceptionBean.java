
package com.bizruntime.stocktrade.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.6.3
 * Fri Mar 03 20:29:03 IST 2017
 * Generated source version: 2.6.3
 */

@XmlRootElement(name = "StockTradeInValidFormatException", namespace = "http://stocktrade.bizruntime.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockTradeInValidFormatException", namespace = "http://stocktrade.bizruntime.com/")

public class StockTradeInValidFormatExceptionBean {

    private java.lang.String message;

    public java.lang.String getMessage() {
        return this.message;
    }

    public void setMessage(java.lang.String newMessage)  {
        this.message = newMessage;
    }

}

