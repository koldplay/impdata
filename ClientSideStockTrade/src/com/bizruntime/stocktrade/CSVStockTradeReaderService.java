package com.bizruntime.stocktrade;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.3
 * 2017-03-03T18:37:38.025+05:30
 * Generated source version: 2.6.3
 * 
 */
@WebServiceClient(name = "CSVStockTradeReaderService", 
                  wsdlLocation = "file:/D:/JOB/ClientSideStockTrade/csvstocktradereader.wsdl",
                  targetNamespace = "http://stocktrade.bizruntime.com/") 
public class CSVStockTradeReaderService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://stocktrade.bizruntime.com/", "CSVStockTradeReaderService");
    public final static QName CSVStockTradeReaderPort = new QName("http://stocktrade.bizruntime.com/", "CSVStockTradeReaderPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/JOB/ClientSideStockTrade/csvstocktradereader.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CSVStockTradeReaderService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/JOB/ClientSideStockTrade/csvstocktradereader.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CSVStockTradeReaderService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CSVStockTradeReaderService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CSVStockTradeReaderService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CSVStockTradeReaderService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CSVStockTradeReaderService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CSVStockTradeReaderService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns CSVStockTradeReader
     */
    @WebEndpoint(name = "CSVStockTradeReaderPort")
    public CSVStockTradeReader getCSVStockTradeReaderPort() {
        return super.getPort(CSVStockTradeReaderPort, CSVStockTradeReader.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CSVStockTradeReader
     */
    @WebEndpoint(name = "CSVStockTradeReaderPort")
    public CSVStockTradeReader getCSVStockTradeReaderPort(WebServiceFeature... features) {
        return super.getPort(CSVStockTradeReaderPort, CSVStockTradeReader.class, features);
    }

}
