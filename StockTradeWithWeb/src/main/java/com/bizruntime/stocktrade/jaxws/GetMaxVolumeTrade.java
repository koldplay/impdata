
package com.bizruntime.stocktrade.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.6.3
 * Fri Mar 03 13:03:56 IST 2017
 * Generated source version: 2.6.3
 */

@XmlRootElement(name = "getMaxVolumeTrade", namespace = "http://stocktrade.bizruntime.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMaxVolumeTrade", namespace = "http://stocktrade.bizruntime.com/")

public class GetMaxVolumeTrade {

    @XmlElement(name = "arg0")
    private java.util.List<com.bizruntime.stocktrade.StockTrdae> arg0;

    public java.util.List<com.bizruntime.stocktrade.StockTrdae> getArg0() {
        return this.arg0;
    }

    public void setArg0(java.util.List<com.bizruntime.stocktrade.StockTrdae> newArg0)  {
        this.arg0 = newArg0;
    }

}

