
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package default_package;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.3
 * 2017-03-03T20:42:53.514+05:30
 * Generated source version: 2.6.3
 * 
 */

@javax.jws.WebService(
                      serviceName = "CSVStockTradeReaderService",
                      portName = "CSVStockTradeReaderPort",
                      targetNamespace = "http://default_package/",
                      wsdlLocation = "file:/D:/JOB/StockTradeClient/csvstocktradereader.wsdl",
                      endpointInterface = "default_package.CSVStockTradeReader")
                      
public class CSVStockTradeReaderImpl implements CSVStockTradeReader {

    private static final Logger LOG = Logger.getLogger(CSVStockTradeReaderImpl.class.getName());

    /* (non-Javadoc)
     * @see default_package.CSVStockTradeReader#getMaxVolumeTrade(java.util.List<default_package.StockTrdae>  ada )*
     */
    public default_package.StockTrdae getMaxVolumeTrade(java.util.List<default_package.StockTrdae> ada) { 
        LOG.info("Executing operation getMaxVolumeTrade");
        System.out.println(ada);
        try {
            default_package.StockTrdae _return = new default_package.StockTrdae();
            _return.setAdjClose(Double.valueOf(0.8721508591102572));
            _return.setClose(Double.valueOf(0.9185925894403879));
            _return.setDate(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-03-03T20:42:53.532+05:30"));
            _return.setHigh(Double.valueOf(0.9270051666521916));
            _return.setLow(Double.valueOf(0.8832288470035171));
            _return.setOpen(Double.valueOf(0.6067667642323485));
            _return.setSecurity("Security-1874742950");
            _return.setVolume(Double.valueOf(0.24174911392455123));
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see default_package.CSVStockTradeReader#readStockTrades(*
     */
    public java.util.List<default_package.StockTrdae> readStockTrades() throws StockTradeInValidFormatException_Exception    { 
        LOG.info("Executing operation readStockTrades");
        try {
            java.util.List<default_package.StockTrdae> _return = new java.util.ArrayList<default_package.StockTrdae>();
            default_package.StockTrdae _returnVal1 = new default_package.StockTrdae();
            _returnVal1.setAdjClose(Double.valueOf(0.38999720340045774));
            _returnVal1.setClose(Double.valueOf(0.02253373805597969));
            _returnVal1.setDate(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-03-03T20:42:53.534+05:30"));
            _returnVal1.setHigh(Double.valueOf(0.5431907262166021));
            _returnVal1.setLow(Double.valueOf(0.5874644900746273));
            _returnVal1.setOpen(Double.valueOf(0.3207919598851505));
            _returnVal1.setSecurity("Security-320897304");
            _returnVal1.setVolume(Double.valueOf(0.38620064396504095));
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new StockTradeInValidFormatException_Exception("StockTradeInValidFormatException...");
    }

    /* (non-Javadoc)
     * @see default_package.CSVStockTradeReader#getMinVolumeTrade(java.util.List<default_package.StockTrdae>  arg0 )*
     */
    public default_package.StockTrdae getMinVolumeTrade(java.util.List<default_package.StockTrdae> arg0) { 
        LOG.info("Executing operation getMinVolumeTrade");
        System.out.println(arg0);
        try {
            default_package.StockTrdae _return = new default_package.StockTrdae();
            _return.setAdjClose(Double.valueOf(0.1599695428253588));
            _return.setClose(Double.valueOf(0.06047046596096617));
            _return.setDate(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-03-03T20:42:53.535+05:30"));
            _return.setHigh(Double.valueOf(0.7138898942247283));
            _return.setLow(Double.valueOf(0.32836246679224834));
            _return.setOpen(Double.valueOf(0.9556329162552645));
            _return.setSecurity("Security1493012256");
            _return.setVolume(Double.valueOf(0.27247455054190484));
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see default_package.CSVStockTradeReader#getDailyTradingDifferential(java.util.List<default_package.StockTrdae>  arg0 )*
     */
    public default_package.GetDailyTradingDifferentialResponse.Return getDailyTradingDifferential(java.util.List<default_package.StockTrdae> arg0) { 
        LOG.info("Executing operation getDailyTradingDifferential");
        System.out.println(arg0);
        try {
            default_package.GetDailyTradingDifferentialResponse.Return _return = new default_package.GetDailyTradingDifferentialResponse.Return();
            java.util.List<default_package.GetDailyTradingDifferentialResponse.Return.Entry> _returnEntry = new java.util.ArrayList<default_package.GetDailyTradingDifferentialResponse.Return.Entry>();
            default_package.GetDailyTradingDifferentialResponse.Return.Entry _returnEntryVal1 = new default_package.GetDailyTradingDifferentialResponse.Return.Entry();
            _returnEntryVal1.setKey(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-03-03T20:42:53.537+05:30"));
            _returnEntryVal1.setValue(Double.valueOf(0.02761950587162021));
            _returnEntry.add(_returnEntryVal1);
            _return.getEntry().addAll(_returnEntry);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
