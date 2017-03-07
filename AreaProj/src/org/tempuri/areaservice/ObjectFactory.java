
package org.tempuri.areaservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri.areaservice package. 
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

    private final static QName _Parameters_QNAME = new QName("http://tempuri.org/AreaService/", "parameters");
    private final static QName _Area_QNAME = new QName("http://tempuri.org/AreaService/", "area");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri.areaservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Dimensions }
     * 
     */
    public Dimensions createDimensions() {
        return new Dimensions();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Dimensions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/AreaService/", name = "parameters")
    public JAXBElement<Dimensions> createParameters(Dimensions value) {
        return new JAXBElement<Dimensions>(_Parameters_QNAME, Dimensions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/AreaService/", name = "area")
    public JAXBElement<Float> createArea(Float value) {
        return new JAXBElement<Float>(_Area_QNAME, Float.class, null, value);
    }

}
