
package com.bizruntime.userproduct.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.6.3
 * Sat Mar 04 14:17:45 IST 2017
 * Generated source version: 2.6.3
 */

@XmlRootElement(name = "getAllProductForUserResponse", namespace = "http://userproduct.bizruntime.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllProductForUserResponse", namespace = "http://userproduct.bizruntime.com/")

public class GetAllProductForUserResponse {

    @XmlElement(name = "return")
    private java.util.List<com.bizruntime.userproduct.Product> _return;

    public java.util.List<com.bizruntime.userproduct.Product> getReturn() {
        return this._return;
    }

    public void setReturn(java.util.List<com.bizruntime.userproduct.Product> new_return)  {
        this._return = new_return;
    }

}
