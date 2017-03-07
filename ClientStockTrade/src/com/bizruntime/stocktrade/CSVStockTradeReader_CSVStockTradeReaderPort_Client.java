
package com.bizruntime.stocktrade;

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
 * 2017-03-03T15:37:56.686+05:30
 * Generated source version: 2.6.3
 * 
 */
public final class CSVStockTradeReader_CSVStockTradeReaderPort_Client {

    private static final QName SERVICE_NAME = new QName("http://stocktrade.bizruntime.com/", "CSVStockTradeReaderService");

    private CSVStockTradeReader_CSVStockTradeReaderPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = CSVStockTradeReaderService.WSDL_LOCATION;
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
      
        CSVStockTradeReaderService ss = new CSVStockTradeReaderService(wsdlURL, SERVICE_NAME);
        CSVStockTradeReader port = ss.getCSVStockTradeReaderPort();  
        
        {
        System.out.println("Invoking getDailyTradingDifferential...");
        java.util.List<com.bizruntime.stocktrade.StockTrdae> _getDailyTradingDifferential_arg0 = new java.util.ArrayList<com.bizruntime.stocktrade.StockTrdae>();
        com.bizruntime.stocktrade.StockTrdae _getDailyTradingDifferential_arg0Val1 = new com.bizruntime.stocktrade.StockTrdae();
        _getDailyTradingDifferential_arg0Val1.setAdj_Close(Double.valueOf(0.8748180969407862));
        _getDailyTradingDifferential_arg0Val1.setClose(Double.valueOf(0.23348077605676498));
        _getDailyTradingDifferential_arg0Val1.setDate(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-03-03T15:37:56.808+05:30"));
        _getDailyTradingDifferential_arg0Val1.setHigh(Double.valueOf(0.3310265881157024));
        _getDailyTradingDifferential_arg0Val1.setLow(Double.valueOf(0.6671146628051711));
        _getDailyTradingDifferential_arg0Val1.setOpen(Double.valueOf(0.27588808683012456));
        _getDailyTradingDifferential_arg0Val1.setSecurity("Security-649826203");
        _getDailyTradingDifferential_arg0Val1.setVolume(Double.valueOf(0.9788751782534686));
        _getDailyTradingDifferential_arg0.add(_getDailyTradingDifferential_arg0Val1);
        com.bizruntime.stocktrade.GetDailyTradingDifferentialResponse.Return _getDailyTradingDifferential__return = port.getDailyTradingDifferential(_getDailyTradingDifferential_arg0);
        System.out.println("getDailyTradingDifferential.result=" + _getDailyTradingDifferential__return);


        }
        {
        System.out.println("Invoking getMaxVolumeTrade...");
        java.util.List<com.bizruntime.stocktrade.StockTrdae> _getMaxVolumeTrade_arg0 = new java.util.ArrayList<com.bizruntime.stocktrade.StockTrdae>();
        com.bizruntime.stocktrade.StockTrdae _getMaxVolumeTrade_arg0Val1 = new com.bizruntime.stocktrade.StockTrdae();
        _getMaxVolumeTrade_arg0Val1.setAdj_Close(Double.valueOf(0.0784025711821551));
        _getMaxVolumeTrade_arg0Val1.setClose(Double.valueOf(0.2890472983561738));
        _getMaxVolumeTrade_arg0Val1.setDate(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-03-03T15:37:56.823+05:30"));
        _getMaxVolumeTrade_arg0Val1.setHigh(Double.valueOf(0.6456704579267525));
        _getMaxVolumeTrade_arg0Val1.setLow(Double.valueOf(0.9397530024480997));
        _getMaxVolumeTrade_arg0Val1.setOpen(Double.valueOf(0.5404932424402182));
        _getMaxVolumeTrade_arg0Val1.setSecurity("Security1648803270");
        _getMaxVolumeTrade_arg0Val1.setVolume(Double.valueOf(0.2067809978020677));
        _getMaxVolumeTrade_arg0.add(_getMaxVolumeTrade_arg0Val1);
        com.bizruntime.stocktrade.StockTrdae _getMaxVolumeTrade__return = port.getMaxVolumeTrade(_getMaxVolumeTrade_arg0);
        System.out.println("getMaxVolumeTrade.result=" + _getMaxVolumeTrade__return);


        }
        {
        System.out.println("Invoking getMinVolumeTrade...");
        java.util.List<com.bizruntime.stocktrade.StockTrdae> _getMinVolumeTrade_arg0 = new java.util.ArrayList<com.bizruntime.stocktrade.StockTrdae>();
        com.bizruntime.stocktrade.StockTrdae _getMinVolumeTrade_arg0Val1 = new com.bizruntime.stocktrade.StockTrdae();
        _getMinVolumeTrade_arg0Val1.setAdj_Close(Double.valueOf(0.6241817211581847));
        _getMinVolumeTrade_arg0Val1.setClose(Double.valueOf(0.9420665288001334));
        _getMinVolumeTrade_arg0Val1.setDate(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-03-03T15:37:56.824+05:30"));
        _getMinVolumeTrade_arg0Val1.setHigh(Double.valueOf(0.8179178268951574));
        _getMinVolumeTrade_arg0Val1.setLow(Double.valueOf(0.3649433841962364));
        _getMinVolumeTrade_arg0Val1.setOpen(Double.valueOf(0.8857046142061578));
        _getMinVolumeTrade_arg0Val1.setSecurity("Security559655914");
        _getMinVolumeTrade_arg0Val1.setVolume(Double.valueOf(0.2660642678487023));
        _getMinVolumeTrade_arg0.add(_getMinVolumeTrade_arg0Val1);
        com.bizruntime.stocktrade.StockTrdae _getMinVolumeTrade__return = port.getMinVolumeTrade(_getMinVolumeTrade_arg0);
        System.out.println("getMinVolumeTrade.result=" + _getMinVolumeTrade__return);


        }
        {
        System.out.println("Invoking readStockTrades...");
        try {
            java.util.List<com.bizruntime.stocktrade.StockTrdae> _readStockTrades__return = port.readStockTrades();
            System.out.println("readStockTrades.result=" + _readStockTrades__return);

        } catch (StockTradeInValidFormatException_Exception e) { 
            System.out.println("Expected exception: StockTradeInValidFormatException has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}