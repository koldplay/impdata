
package com.bizruntime.productavailabilityservice;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.3
 * 2017-03-04T16:33:28.358+05:30
 * Generated source version: 2.6.3
 * 
 */
public final class Productavailabilityservice_ProductavailabilityserviceSOAPPort_Client {

    private static final QName SERVICE_NAME = new QName("http://productavailabilityservice.bizruntime.com/", "productavailabilityservice");

    private Productavailabilityservice_ProductavailabilityserviceSOAPPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = Productavailabilityservice_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        Productavailabilityservice_Service ss = new Productavailabilityservice_Service(wsdlURL, SERVICE_NAME);
        Productavailabilityservice port = ss.getProductavailabilityserviceSOAPPort();  
        
        {
        System.out.println("Invoking getAllProductForUserForCategory...");
        java.lang.String _getAllProductForUserForCategory_arg0 = "_getAllProductForUserForCategory_arg01842456825";
        java.lang.String _getAllProductForUserForCategory_arg1 = "_getAllProductForUserForCategory_arg1400874907";
        java.util.List<com.bizruntime.productavailabilityservice.Product> _getAllProductForUserForCategory__return = port.getAllProductForUserForCategory(_getAllProductForUserForCategory_arg0, _getAllProductForUserForCategory_arg1);
        System.out.println("getAllProductForUserForCategory.result=" + _getAllProductForUserForCategory__return);


        }
        {
        System.out.println("Invoking getAllProductForUser...");
        java.lang.String _getAllProductForUser_arg0 = "_getAllProductForUser_arg0-1140267867";
        java.util.List<com.bizruntime.productavailabilityservice.Product> _getAllProductForUser__return = port.getAllProductForUser(_getAllProductForUser_arg0);
        System.out.println("getAllProductForUser.result=" + _getAllProductForUser__return);


        }

        System.exit(0);
    }

}
