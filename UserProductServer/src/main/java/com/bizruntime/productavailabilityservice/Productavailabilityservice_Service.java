package com.bizruntime.productavailabilityservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.3
 * 2017-03-06T10:31:46.967+05:30
 * Generated source version: 2.6.3
 * 
 */
@WebServiceClient(name = "productavailabilityservice", 
                  wsdlLocation = "file:/D:/JOB/UserProductServer/src/main/webapp/wsdl/productavailabilityservice.wsdl",
                  targetNamespace = "http://productavailabilityservice.bizruntime.com/") 
public class Productavailabilityservice_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://productavailabilityservice.bizruntime.com/", "productavailabilityservice");
    public final static QName ProductavailabilityserviceSOAPPort = new QName("http://productavailabilityservice.bizruntime.com/", "productavailabilityserviceSOAPPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/JOB/UserProductServer/src/main/webapp/wsdl/productavailabilityservice.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Productavailabilityservice_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/JOB/UserProductServer/src/main/webapp/wsdl/productavailabilityservice.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Productavailabilityservice_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Productavailabilityservice_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Productavailabilityservice_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Productavailabilityservice_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Productavailabilityservice_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Productavailabilityservice_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns Productavailabilityservice
     */
    @WebEndpoint(name = "productavailabilityserviceSOAPPort")
    public Productavailabilityservice getProductavailabilityserviceSOAPPort() {
        return super.getPort(ProductavailabilityserviceSOAPPort, Productavailabilityservice.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Productavailabilityservice
     */
    @WebEndpoint(name = "productavailabilityserviceSOAPPort")
    public Productavailabilityservice getProductavailabilityserviceSOAPPort(WebServiceFeature... features) {
        return super.getPort(ProductavailabilityserviceSOAPPort, Productavailabilityservice.class, features);
    }

}
