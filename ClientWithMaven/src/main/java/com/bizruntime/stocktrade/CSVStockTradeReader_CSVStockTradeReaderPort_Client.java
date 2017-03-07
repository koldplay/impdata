
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
 * 2017-03-03T16:25:38.881+05:30
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
        _getDailyTradingDifferential_arg0Val1.setAdjClose(Double.valueOf(0.2068435671436275));
        _getDailyTradingDifferential_arg0Val1.setClose(Double.valueOf(0.41845160640238277));
        _getDailyTradingDifferential_arg0Val1.setDate(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-03-03T16:25:39.084+05:30"));
        _getDailyTradingDifferential_arg0Val1.setHigh(Double.valueOf(0.015464111194630759));
        _getDailyTradingDifferential_arg0Val1.setLow(Double.valueOf(0.25103545198269883));
        _getDailyTradingDifferential_arg0Val1.setOpen(Double.valueOf(0.02390763626690673));
        _getDailyTradingDifferential_arg0Val1.setSecurity("Security698808131");
        _getDailyTradingDifferential_arg0Val1.setVolume(Double.valueOf(0.5290161164622439));
        _getDailyTradingDifferential_arg0.add(_getDailyTradingDifferential_arg0Val1);
        com.bizruntime.stocktrade.GetDailyTradingDifferentialResponse.Return _getDailyTradingDifferential__return = port.getDailyTradingDifferential(_getDailyTradingDifferential_arg0);
        System.out.println("getDailyTradingDifferential.result=" + _getDailyTradingDifferential__return);


        }
        {
        System.out.println("Invoking getMaxVolumeTrade...");
        java.util.List<com.bizruntime.stocktrade.StockTrdae> _getMaxVolumeTrade_arg0 = new java.util.ArrayList<com.bizruntime.stocktrade.StockTrdae>();
        com.bizruntime.stocktrade.StockTrdae _getMaxVolumeTrade_arg0Val1 = new com.bizruntime.stocktrade.StockTrdae();
        _getMaxVolumeTrade_arg0Val1.setAdjClose(Double.valueOf(0.13879107903784715));
        _getMaxVolumeTrade_arg0Val1.setClose(Double.valueOf(0.6206743447135259));
        _getMaxVolumeTrade_arg0Val1.setDate(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-03-03T16:25:39.114+05:30"));
        _getMaxVolumeTrade_arg0Val1.setHigh(Double.valueOf(0.7853447015394895));
        _getMaxVolumeTrade_arg0Val1.setLow(Double.valueOf(0.9713364157357363));
        _getMaxVolumeTrade_arg0Val1.setOpen(Double.valueOf(0.5256524499818828));
        _getMaxVolumeTrade_arg0Val1.setSecurity("Security1982788235");
        _getMaxVolumeTrade_arg0Val1.setVolume(Double.valueOf(0.500286770065036));
        _getMaxVolumeTrade_arg0.add(_getMaxVolumeTrade_arg0Val1);
        com.bizruntime.stocktrade.StockTrdae _getMaxVolumeTrade__return = port.getMaxVolumeTrade(_getMaxVolumeTrade_arg0);
        System.out.println("getMaxVolumeTrade.result=" + _getMaxVolumeTrade__return);


        }
        {
        System.out.println("Invoking getMinVolumeTrade...");
        java.util.List<com.bizruntime.stocktrade.StockTrdae> _getMinVolumeTrade_arg0 = new java.util.ArrayList<com.bizruntime.stocktrade.StockTrdae>();
        com.bizruntime.stocktrade.StockTrdae _getMinVolumeTrade_arg0Val1 = new com.bizruntime.stocktrade.StockTrdae();
        _getMinVolumeTrade_arg0Val1.setAdjClose(Double.valueOf(0.8635010020681262));
        _getMinVolumeTrade_arg0Val1.setClose(Double.valueOf(0.39525559489987294));
        _getMinVolumeTrade_arg0Val1.setDate(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-03-03T16:25:39.116+05:30"));
        _getMinVolumeTrade_arg0Val1.setHigh(Double.valueOf(0.3761017679055859));
        _getMinVolumeTrade_arg0Val1.setLow(Double.valueOf(0.873708185818107));
        _getMinVolumeTrade_arg0Val1.setOpen(Double.valueOf(0.39386114685348683));
        _getMinVolumeTrade_arg0Val1.setSecurity("Security-339086586");
        _getMinVolumeTrade_arg0Val1.setVolume(Double.valueOf(0.11514354334069954));
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