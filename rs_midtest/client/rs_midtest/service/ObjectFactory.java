
package rs_midtest.client.rs_midtest.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the rs_midtest.service package. 
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

    private final static QName _GetMaxResponse_QNAME = new QName("http://service.rs_midtest/", "GetMaxResponse");
    private final static QName _EchoHelloWorldResponse_QNAME = new QName("http://service.rs_midtest/", "EchoHelloWorldResponse");
    private final static QName _EchoHelloWorld_QNAME = new QName("http://service.rs_midtest/", "EchoHelloWorld");
    private final static QName _GetMax_QNAME = new QName("http://service.rs_midtest/", "GetMax");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: rs_midtest.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EchoHelloWorld }
     * 
     */
    public EchoHelloWorld createEchoHelloWorld() {
        return new EchoHelloWorld();
    }

    /**
     * Create an instance of {@link GetMax }
     * 
     */
    public GetMax createGetMax() {
        return new GetMax();
    }

    /**
     * Create an instance of {@link EchoHelloWorldResponse }
     * 
     */
    public EchoHelloWorldResponse createEchoHelloWorldResponse() {
        return new EchoHelloWorldResponse();
    }

    /**
     * Create an instance of {@link GetMaxResponse }
     * 
     */
    public GetMaxResponse createGetMaxResponse() {
        return new GetMaxResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMaxResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.rs_midtest/", name = "GetMaxResponse")
    public JAXBElement<GetMaxResponse> createGetMaxResponse(GetMaxResponse value) {
        return new JAXBElement<GetMaxResponse>(_GetMaxResponse_QNAME, GetMaxResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EchoHelloWorldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.rs_midtest/", name = "EchoHelloWorldResponse")
    public JAXBElement<EchoHelloWorldResponse> createEchoHelloWorldResponse(EchoHelloWorldResponse value) {
        return new JAXBElement<EchoHelloWorldResponse>(_EchoHelloWorldResponse_QNAME, EchoHelloWorldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EchoHelloWorld }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.rs_midtest/", name = "EchoHelloWorld")
    public JAXBElement<EchoHelloWorld> createEchoHelloWorld(EchoHelloWorld value) {
        return new JAXBElement<EchoHelloWorld>(_EchoHelloWorld_QNAME, EchoHelloWorld.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMax }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.rs_midtest/", name = "GetMax")
    public JAXBElement<GetMax> createGetMax(GetMax value) {
        return new JAXBElement<GetMax>(_GetMax_QNAME, GetMax.class, null, value);
    }

}
