
package rs_midtest.client.rs_midtest.service;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloWorldWebService", targetNamespace = "http://service.rs_midtest/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWorldWebService {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "EchoHelloWorld")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "EchoHelloWorld", targetNamespace = "http://service.rs_midtest/", className = "rs_midtest.service.EchoHelloWorld")
    @ResponseWrapper(localName = "EchoHelloWorldResponse", targetNamespace = "http://service.rs_midtest/", className = "rs_midtest.service.EchoHelloWorldResponse")
    @Action(input = "http://service.rs_midtest/HelloWorldWebService/EchoHelloWorldRequest", output = "http://service.rs_midtest/HelloWorldWebService/EchoHelloWorldResponse")
    public String echoHelloWorld(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod(operationName = "GetMax")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetMax", targetNamespace = "http://service.rs_midtest/", className = "rs_midtest.service.GetMax")
    @ResponseWrapper(localName = "GetMaxResponse", targetNamespace = "http://service.rs_midtest/", className = "rs_midtest.service.GetMaxResponse")
    @Action(input = "http://service.rs_midtest/HelloWorldWebService/GetMaxRequest", output = "http://service.rs_midtest/HelloWorldWebService/GetMaxResponse")
    public int getMax(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

}
