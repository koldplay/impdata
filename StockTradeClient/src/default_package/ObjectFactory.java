
package default_package;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the default_package package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetMaxVolumeTradeResponse_QNAME = new QName("http://default_package/", "getMaxVolumeTradeResponse");
    private final static QName _GetDailyTradingDifferentialResponse_QNAME = new QName("http://default_package/", "getDailyTradingDifferentialResponse");
    private final static QName _ReadStockTrades_QNAME = new QName("http://default_package/", "readStockTrades");
    private final static QName _GetMinVolumeTrade_QNAME = new QName("http://default_package/", "getMinVolumeTrade");
    private final static QName _GetMinVolumeTradeResponse_QNAME = new QName("http://default_package/", "getMinVolumeTradeResponse");
    private final static QName _GetMaxVolumeTrade_QNAME = new QName("http://default_package/", "getMaxVolumeTrade");
    private final static QName _GetDailyTradingDifferential_QNAME = new QName("http://default_package/", "getDailyTradingDifferential");
    private final static QName _StockTradeInValidFormatException_QNAME = new QName("http://default_package/", "StockTradeInValidFormatException");
    private final static QName _ReadStockTradesResponse_QNAME = new QName("http://default_package/", "readStockTradesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: default_package
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDailyTradingDifferentialResponse }
     * 
     */
    public GetDailyTradingDifferentialResponse createGetDailyTradingDifferentialResponse() {
        return new GetDailyTradingDifferentialResponse();
    }

    /**
     * Create an instance of {@link GetDailyTradingDifferentialResponse.Return }
     * 
     */
    public GetDailyTradingDifferentialResponse.Return createGetDailyTradingDifferentialResponseReturn() {
        return new GetDailyTradingDifferentialResponse.Return();
    }

    /**
     * Create an instance of {@link ReadStockTradesResponse }
     * 
     */
    public ReadStockTradesResponse createReadStockTradesResponse() {
        return new ReadStockTradesResponse();
    }

    /**
     * Create an instance of {@link GetDailyTradingDifferential }
     * 
     */
    public GetDailyTradingDifferential createGetDailyTradingDifferential() {
        return new GetDailyTradingDifferential();
    }

    /**
     * Create an instance of {@link StockTradeInValidFormatException }
     * 
     */
    public StockTradeInValidFormatException createStockTradeInValidFormatException() {
        return new StockTradeInValidFormatException();
    }

    /**
     * Create an instance of {@link GetMaxVolumeTrade }
     * 
     */
    public GetMaxVolumeTrade createGetMaxVolumeTrade() {
        return new GetMaxVolumeTrade();
    }

    /**
     * Create an instance of {@link GetMinVolumeTradeResponse }
     * 
     */
    public GetMinVolumeTradeResponse createGetMinVolumeTradeResponse() {
        return new GetMinVolumeTradeResponse();
    }

    /**
     * Create an instance of {@link ReadStockTrades }
     * 
     */
    public ReadStockTrades createReadStockTrades() {
        return new ReadStockTrades();
    }

    /**
     * Create an instance of {@link GetMinVolumeTrade }
     * 
     */
    public GetMinVolumeTrade createGetMinVolumeTrade() {
        return new GetMinVolumeTrade();
    }

    /**
     * Create an instance of {@link GetMaxVolumeTradeResponse }
     * 
     */
    public GetMaxVolumeTradeResponse createGetMaxVolumeTradeResponse() {
        return new GetMaxVolumeTradeResponse();
    }

    /**
     * Create an instance of {@link StockTrdae }
     * 
     */
    public StockTrdae createStockTrdae() {
        return new StockTrdae();
    }

    /**
     * Create an instance of {@link GetDailyTradingDifferentialResponse.Return.Entry }
     * 
     */
    public GetDailyTradingDifferentialResponse.Return.Entry createGetDailyTradingDifferentialResponseReturnEntry() {
        return new GetDailyTradingDifferentialResponse.Return.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMaxVolumeTradeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "getMaxVolumeTradeResponse")
    public JAXBElement<GetMaxVolumeTradeResponse> createGetMaxVolumeTradeResponse(GetMaxVolumeTradeResponse value) {
        return new JAXBElement<GetMaxVolumeTradeResponse>(_GetMaxVolumeTradeResponse_QNAME, GetMaxVolumeTradeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDailyTradingDifferentialResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "getDailyTradingDifferentialResponse")
    public JAXBElement<GetDailyTradingDifferentialResponse> createGetDailyTradingDifferentialResponse(GetDailyTradingDifferentialResponse value) {
        return new JAXBElement<GetDailyTradingDifferentialResponse>(_GetDailyTradingDifferentialResponse_QNAME, GetDailyTradingDifferentialResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadStockTrades }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "readStockTrades")
    public JAXBElement<ReadStockTrades> createReadStockTrades(ReadStockTrades value) {
        return new JAXBElement<ReadStockTrades>(_ReadStockTrades_QNAME, ReadStockTrades.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMinVolumeTrade }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "getMinVolumeTrade")
    public JAXBElement<GetMinVolumeTrade> createGetMinVolumeTrade(GetMinVolumeTrade value) {
        return new JAXBElement<GetMinVolumeTrade>(_GetMinVolumeTrade_QNAME, GetMinVolumeTrade.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMinVolumeTradeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "getMinVolumeTradeResponse")
    public JAXBElement<GetMinVolumeTradeResponse> createGetMinVolumeTradeResponse(GetMinVolumeTradeResponse value) {
        return new JAXBElement<GetMinVolumeTradeResponse>(_GetMinVolumeTradeResponse_QNAME, GetMinVolumeTradeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMaxVolumeTrade }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "getMaxVolumeTrade")
    public JAXBElement<GetMaxVolumeTrade> createGetMaxVolumeTrade(GetMaxVolumeTrade value) {
        return new JAXBElement<GetMaxVolumeTrade>(_GetMaxVolumeTrade_QNAME, GetMaxVolumeTrade.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDailyTradingDifferential }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "getDailyTradingDifferential")
    public JAXBElement<GetDailyTradingDifferential> createGetDailyTradingDifferential(GetDailyTradingDifferential value) {
        return new JAXBElement<GetDailyTradingDifferential>(_GetDailyTradingDifferential_QNAME, GetDailyTradingDifferential.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockTradeInValidFormatException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "StockTradeInValidFormatException")
    public JAXBElement<StockTradeInValidFormatException> createStockTradeInValidFormatException(StockTradeInValidFormatException value) {
        return new JAXBElement<StockTradeInValidFormatException>(_StockTradeInValidFormatException_QNAME, StockTradeInValidFormatException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadStockTradesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "readStockTradesResponse")
    public JAXBElement<ReadStockTradesResponse> createReadStockTradesResponse(ReadStockTradesResponse value) {
        return new JAXBElement<ReadStockTradesResponse>(_ReadStockTradesResponse_QNAME, ReadStockTradesResponse.class, null, value);
    }

}
