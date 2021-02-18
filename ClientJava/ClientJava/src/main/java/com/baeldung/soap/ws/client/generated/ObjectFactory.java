
package com.baeldung.soap.ws.client.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.baeldung.soap.ws.client.generated package. 
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

    private final static QName _GetUserInfoService_QNAME = new QName("http://Services.com.example2/", "getUserInfoService");
    private final static QName _GetUserInfoServiceResponse_QNAME = new QName("http://Services.com.example2/", "getUserInfoServiceResponse");
    private final static QName _GetUsersService_QNAME = new QName("http://Services.com.example2/", "getUsersService");
    private final static QName _GetUsersServiceResponse_QNAME = new QName("http://Services.com.example2/", "getUsersServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.baeldung.soap.ws.client.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserInfoService }
     * 
     */
    public GetUserInfoService createGetUserInfoService() {
        return new GetUserInfoService();
    }

    /**
     * Create an instance of {@link GetUserInfoServiceResponse }
     * 
     */
    public GetUserInfoServiceResponse createGetUserInfoServiceResponse() {
        return new GetUserInfoServiceResponse();
    }

    /**
     * Create an instance of {@link GetUsersService }
     * 
     */
    public GetUsersService createGetUsersService() {
        return new GetUsersService();
    }

    /**
     * Create an instance of {@link GetUsersServiceResponse }
     * 
     */
    public GetUsersServiceResponse createGetUsersServiceResponse() {
        return new GetUsersServiceResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserInfoService }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUserInfoService }{@code >}
     */
    @XmlElementDecl(namespace = "http://Services.com.example2/", name = "getUserInfoService")
    public JAXBElement<GetUserInfoService> createGetUserInfoService(GetUserInfoService value) {
        return new JAXBElement<GetUserInfoService>(_GetUserInfoService_QNAME, GetUserInfoService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserInfoServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUserInfoServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Services.com.example2/", name = "getUserInfoServiceResponse")
    public JAXBElement<GetUserInfoServiceResponse> createGetUserInfoServiceResponse(GetUserInfoServiceResponse value) {
        return new JAXBElement<GetUserInfoServiceResponse>(_GetUserInfoServiceResponse_QNAME, GetUserInfoServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersService }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUsersService }{@code >}
     */
    @XmlElementDecl(namespace = "http://Services.com.example2/", name = "getUsersService")
    public JAXBElement<GetUsersService> createGetUsersService(GetUsersService value) {
        return new JAXBElement<GetUsersService>(_GetUsersService_QNAME, GetUsersService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUsersServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Services.com.example2/", name = "getUsersServiceResponse")
    public JAXBElement<GetUsersServiceResponse> createGetUsersServiceResponse(GetUsersServiceResponse value) {
        return new JAXBElement<GetUsersServiceResponse>(_GetUsersServiceResponse_QNAME, GetUsersServiceResponse.class, null, value);
    }

}
