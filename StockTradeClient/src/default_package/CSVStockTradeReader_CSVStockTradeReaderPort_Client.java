
package default_package;

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
 * 2017-03-03T20:42:53.359+05:30
 * Generated source version: 2.6.3
 * 
 */
public final class CSVStockTradeReader_CSVStockTradeReaderPort_Client {

    private static final QName SERVICE_NAME = new QName("http://default_package/", "CSVStockTradeReaderService");

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
        System.out.println("Invoking getMaxVolumeTrade...");
        java.util.List<default_package.StockTrdae> _getMaxVolumeTrade_ada = new java.util.ArrayList<default_package.StockTrdae>();
        default_package.StockTrdae _getMaxVolumeTrade_adaVal1 = new default_package.StockTrdae();
        _getMaxVolumeTrade_adaVal1.setAdjClose(Double.valueOf(0.4778001505549391));
        _getMaxVolumeTrade_adaVal1.setClose(Double.valueOf(0.6135099940828411));
        _getMaxVolumeTrade_adaVal1.setDate(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-03-03T20:42:53.459+05:30"));
        _getMaxVolumeTrade_adaVal1.setHigh(Double.valueOf(0.8388018959654695));
        _getMaxVolumeTrade_adaVal1.setLow(Double.valueOf(0.030916572311417756));
        _getMaxVolumeTrade_adaVal1.setOpen(Double.valueOf(0.5735905695083949));
        _getMaxVolumeTrade_adaVal1.setSecurity("Security-146460177");
        _getMaxVolumeTrade_adaVal1.setVolume(Double.valueOf(0.23898037056998256));
        _getMaxVolumeTrade_ada.add(_getMaxVolumeTrade_adaVal1);
        default_package.StockTrdae _getMaxVolumeTrade__return = port.getMaxVolumeTrade(_getMaxVolumeTrade_ada);
        System.out.println("getMaxVolumeTrade.result=" + _getMaxVolumeTrade__return);


        }
        {
        System.out.println("Invoking readStockTrades...");
        try {
            java.util.List<default_package.StockTrdae> _readStockTrades__return = port.readStockTrades();
            System.out.println("readStockTrades.result=" + _readStockTrades__return);

        } catch (StockTradeInValidFormatException_Exception e) { 
            System.out.println("Expected exception: StockTradeInValidFormatException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getMinVolumeTrade...");
        java.util.List<default_package.StockTrdae> _getMinVolumeTrade_arg0 = new java.util.ArrayList<default_package.StockTrdae>();
        default_package.StockTrdae _getMinVolumeTrade_arg0Val1 = new default_package.StockTrdae();
        _getMinVolumeTrade_arg0Val1.setAdjClose(Double.valueOf(0.5379931213167417));
        _getMinVolumeTrade_arg0Val1.setClose(Double.valueOf(0.9003048801242717));
        _getMinVolumeTrade_arg0Val1.setDate(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-03-03T20:42:53.499+05:30"));
        _getMinVolumeTrade_arg0Val1.setHigh(Double.valueOf(0.42755225806292263));
        _getMinVolumeTrade_arg0Val1.setLow(Double.valueOf(0.6093255747223482));
        _getMinVolumeTrade_arg0Val1.setOpen(Double.valueOf(0.7050267777813868));
        _getMinVolumeTrade_arg0Val1.setSecurity("Security-763093114");
        _getMinVolumeTrade_arg0Val1.setVolume(Double.valueOf(0.0843823821558003));
        _getMinVolumeTrade_arg0.add(_getMinVolumeTrade_arg0Val1);
        default_package.StockTrdae _getMinVolumeTrade__return = port.getMinVolumeTrade(_getMinVolumeTrade_arg0);
        System.out.println("getMinVolumeTrade.result=" + _getMinVolumeTrade__return);


        }
        {
        System.out.println("Invoking getDailyTradingDifferential...");
        java.util.List<default_package.StockTrdae> _getDailyTradingDifferential_arg0 = new java.util.ArrayList<default_package.StockTrdae>();
        default_package.StockTrdae _getDailyTradingDifferential_arg0Val1 = new default_package.StockTrdae();
        _getDailyTradingDifferential_arg0Val1.setAdjClose(Double.valueOf(0.20437227188247142));
        _getDailyTradingDifferential_arg0Val1.setClose(Double.valueOf(0.13510079575746747));
        _getDailyTradingDifferential_arg0Val1.setDate(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-03-03T20:42:53.500+05:30"));
        _getDailyTradingDifferential_arg0Val1.setHigh(Double.valueOf(0.8883822790995144));
        _getDailyTradingDifferential_arg0Val1.setLow(Double.valueOf(0.8481304120098214));
        _getDailyTradingDifferential_arg0Val1.setOpen(Double.valueOf(0.3316649257979143));
        _getDailyTradingDifferential_arg0Val1.setSecurity("Security1265915571");
        _getDailyTradingDifferential_arg0Val1.setVolume(Double.valueOf(0.04660801170981743));
        _getDailyTradingDifferential_arg0.add(_getDailyTradingDifferential_arg0Val1);
        default_package.GetDailyTradingDifferentialResponse.Return _getDailyTradingDifferential__return = port.getDailyTradingDifferential(_getDailyTradingDifferential_arg0);
        System.out.println("getDailyTradingDifferential.result=" + _getDailyTradingDifferential__return);


        }

        System.exit(0);
    }

}
