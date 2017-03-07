
package com.bizruntime.productavailabilityservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bizruntime.productavailabilityservice package. 
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

    private final static QName _GetAllProductForUserForCategoryResponse_QNAME = new QName("http://productavailabilityservice.bizruntime.com/", "getAllProductForUserForCategoryResponse");
    private final static QName _GetAllProductForUserResponse_QNAME = new QName("http://productavailabilityservice.bizruntime.com/", "getAllProductForUserResponse");
    private final static QName _GetAllProductForUserForCategory_QNAME = new QName("http://productavailabilityservice.bizruntime.com/", "getAllProductForUserForCategory");
    private final static QName _GetAllProductForUser_QNAME = new QName("http://productavailabilityservice.bizruntime.com/", "getAllProductForUser");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bizruntime.productavailabilityservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllProductForUserForCategoryResponse }
     * 
     */
    public GetAllProductForUserForCategoryResponse createGetAllProductForUserForCategoryResponse() {
        return new GetAllProductForUserForCategoryResponse();
    }

    /**
     * Create an instance of {@link GetAllProductForUserForCategory }
     * 
     */
    public GetAllProductForUserForCategory createGetAllProductForUserForCategory() {
        return new GetAllProductForUserForCategory();
    }

    /**
     * Create an instance of {@link GetAllProductForUser }
     * 
     */
    public GetAllProductForUser createGetAllProductForUser() {
        return new GetAllProductForUser();
    }

    /**
     * Create an instance of {@link GetAllProductForUserResponse }
     * 
     */
    public GetAllProductForUserResponse createGetAllProductForUserResponse() {
        return new GetAllProductForUserResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProductForUserForCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://productavailabilityservice.bizruntime.com/", name = "getAllProductForUserForCategoryResponse")
    public JAXBElement<GetAllProductForUserForCategoryResponse> createGetAllProductForUserForCategoryResponse(GetAllProductForUserForCategoryResponse value) {
        return new JAXBElement<GetAllProductForUserForCategoryResponse>(_GetAllProductForUserForCategoryResponse_QNAME, GetAllProductForUserForCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProductForUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://productavailabilityservice.bizruntime.com/", name = "getAllProductForUserResponse")
    public JAXBElement<GetAllProductForUserResponse> createGetAllProductForUserResponse(GetAllProductForUserResponse value) {
        return new JAXBElement<GetAllProductForUserResponse>(_GetAllProductForUserResponse_QNAME, GetAllProductForUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProductForUserForCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://productavailabilityservice.bizruntime.com/", name = "getAllProductForUserForCategory")
    public JAXBElement<GetAllProductForUserForCategory> createGetAllProductForUserForCategory(GetAllProductForUserForCategory value) {
        return new JAXBElement<GetAllProductForUserForCategory>(_GetAllProductForUserForCategory_QNAME, GetAllProductForUserForCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProductForUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://productavailabilityservice.bizruntime.com/", name = "getAllProductForUser")
    public JAXBElement<GetAllProductForUser> createGetAllProductForUser(GetAllProductForUser value) {
        return new JAXBElement<GetAllProductForUser>(_GetAllProductForUser_QNAME, GetAllProductForUser.class, null, value);
    }

}
