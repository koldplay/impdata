
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
 * 2017-03-03T18:37:37.913+05:30
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
        _getDailyTradingDifferential_arg0Val1.setAdjClose(Double.valueOf(0.937499199650508));
        _getDailyTradingDifferential_arg0Val1.setClose(Double.valueOf(0.7877826821883889));
        _getDailyTradingDifferential_arg0Val1.setDate(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-03-03T18:37:37.981+05:30"));
        _getDailyTradingDifferential_arg0Val1.setHigh(Double.valueOf(0.6363848535938043));
        _getDailyTradingDifferential_arg0Val1.setLow(Double.valueOf(0.7293050060272063));
        _getDailyTradingDifferential_arg0Val1.setOpen(Double.valueOf(0.14773263307081197));
        _getDailyTradingDifferential_arg0Val1.setSecurity("Security-1751206741");
        _getDailyTradingDifferential_arg0Val1.setVolume(Double.valueOf(0.08892905682874741));
        _getDailyTradingDifferential_arg0.add(_getDailyTradingDifferential_arg0Val1);
        com.bizruntime.stocktrade.GetDailyTradingDifferentialResponse.Return _getDailyTradingDifferential__return = port.getDailyTradingDifferential(_getDailyTradingDifferential_arg0);
        System.out.println("getDailyTradingDifferential.result=" + _getDailyTradingDifferential__return);


        }
        {
        System.out.println("Invoking getMaxVolumeTrade...");
        java.util.List<com.bizruntime.stocktrade.StockTrdae> _getMaxVolumeTrade_arg0 = new java.util.ArrayList<com.bizruntime.stocktrade.StockTrdae>();
        com.bizruntime.stocktrade.StockTrdae _getMaxVolumeTrade_arg0Val1 = new com.bizruntime.stocktrade.StockTrdae();
        _getMaxVolumeTrade_arg0Val1.setAdjClose(Double.valueOf(0.22310752230607445));
        _getMaxVolumeTrade_arg0Val1.setClose(Double.valueOf(0.46744866313482114));
        _getMaxVolumeTrade_arg0Val1.setDate(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-03-03T18:37:37.987+05:30"));
        _getMaxVolumeTrade_arg0Val1.setHigh(Double.valueOf(0.2940183231692084));
        _getMaxVolumeTrade_arg0Val1.setLow(Double.valueOf(0.5973072678722388));
        _getMaxVolumeTrade_arg0Val1.setOpen(Double.valueOf(0.9769339622919344));
        _getMaxVolumeTrade_arg0Val1.setSecurity("Security44949478");
        _getMaxVolumeTrade_arg0Val1.setVolume(Double.valueOf(0.3515183883856834));
        _getMaxVolumeTrade_arg0.add(_getMaxVolumeTrade_arg0Val1);
        com.bizruntime.stocktrade.StockTrdae _getMaxVolumeTrade__return = port.getMaxVolumeTrade(_getMaxVolumeTrade_arg0);
        System.out.println("getMaxVolumeTrade.result=" + _getMaxVolumeTrade__return);


        }
        {
        System.out.println("Invoking getMinVolumeTrade...");
        java.util.List<com.bizruntime.stocktrade.StockTrdae> _getMinVolumeTrade_arg0 = new java.util.ArrayList<com.bizruntime.stocktrade.StockTrdae>();
        com.bizruntime.stocktrade.StockTrdae _getMinVolumeTrade_arg0Val1 = new com.bizruntime.stocktrade.StockTrdae();
        _getMinVolumeTrade_arg0Val1.setAdjClose(Double.valueOf(0.5800660672121924));
        _getMinVolumeTrade_arg0Val1.setClose(Double.valueOf(0.020530908870720177));
        _getMinVolumeTrade_arg0Val1.setDate(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-03-03T18:37:37.989+05:30"));
        _getMinVolumeTrade_arg0Val1.setHigh(Double.valueOf(0.1505618181255226));
        _getMinVolumeTrade_arg0Val1.setLow(Double.valueOf(0.5895985496653916));
        _getMinVolumeTrade_arg0Val1.setOpen(Double.valueOf(0.9553991938844792));
        _getMinVolumeTrade_arg0Val1.setSecurity("Security1193635253");
        _getMinVolumeTrade_arg0Val1.setVolume(Double.valueOf(0.4715587997504299));
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
