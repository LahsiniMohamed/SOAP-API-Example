
package com.baeldung.soap.ws.client.generated;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UserService", targetNamespace = "http://Services.com.example2/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserService {


    /**
     * 
     * @return
     *     returns java.util.List<com.baeldung.soap.ws.client.generated.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUsersService", targetNamespace = "http://Services.com.example2/", className = "com.baeldung.soap.ws.client.generated.GetUsersService")
    @ResponseWrapper(localName = "getUsersServiceResponse", targetNamespace = "http://Services.com.example2/", className = "com.baeldung.soap.ws.client.generated.GetUsersServiceResponse")
    @Action(input = "http://Services.com.example2/UserService/getUsersServiceRequest", output = "http://Services.com.example2/UserService/getUsersServiceResponse")
    public List<User> getUsersService();

    /**
     * 
     * @param arg0
     * @return
     *     returns com.baeldung.soap.ws.client.generated.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUserInfoService", targetNamespace = "http://Services.com.example2/", className = "com.baeldung.soap.ws.client.generated.GetUserInfoService")
    @ResponseWrapper(localName = "getUserInfoServiceResponse", targetNamespace = "http://Services.com.example2/", className = "com.baeldung.soap.ws.client.generated.GetUserInfoServiceResponse")
    @Action(input = "http://Services.com.example2/UserService/getUserInfoServiceRequest", output = "http://Services.com.example2/UserService/getUserInfoServiceResponse")
    public User getUserInfoService(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
