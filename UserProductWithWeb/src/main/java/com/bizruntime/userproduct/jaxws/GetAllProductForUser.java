
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

@XmlRootElement(name = "getAllProductForUser", namespace = "http://userproduct.bizruntime.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllProductForUser", namespace = "http://userproduct.bizruntime.com/")

public class GetAllProductForUser {

    @XmlElement(name = "arg0")
    private java.lang.String arg0;

    public java.lang.String getArg0() {
        return this.arg0;
    }

    public void setArg0(java.lang.String newArg0)  {
        this.arg0 = newArg0;
    }

}

