/**
 * CallServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bizruntime.test;

public interface CallServiceService extends javax.xml.rpc.Service {
    public java.lang.String getCallServiceAddress();

    public com.bizruntime.test.CallService getCallService() throws javax.xml.rpc.ServiceException;

    public com.bizruntime.test.CallService getCallService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
