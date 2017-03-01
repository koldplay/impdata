package com.bizruntime.test;

public class CallServiceProxy implements com.bizruntime.test.CallService {
  private String _endpoint = null;
  private com.bizruntime.test.CallService callService = null;
  
  public CallServiceProxy() {
    _initCallServiceProxy();
  }
  
  public CallServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCallServiceProxy();
  }
  
  private void _initCallServiceProxy() {
    try {
      callService = (new com.bizruntime.test.CallServiceServiceLocator()).getCallService();
      if (callService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)callService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)callService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (callService != null)
      ((javax.xml.rpc.Stub)callService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.bizruntime.test.CallService getCallService() {
    if (callService == null)
      _initCallServiceProxy();
    return callService;
  }
  
  public int add(int i, int j) throws java.rmi.RemoteException{
    if (callService == null)
      _initCallServiceProxy();
    return callService.add(i, j);
  }
  
  public int sub(int i, int j) throws java.rmi.RemoteException{
    if (callService == null)
      _initCallServiceProxy();
    return callService.sub(i, j);
  }
  
  
}