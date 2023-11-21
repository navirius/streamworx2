
package com.streamworx2.data.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.streamworx2.data.request package. 
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

    private final static QName _Type_QNAME = new QName("http://www.oracle.com/external/services/sampleservice/request/v1.0", "type");
    private final static QName _OrderType_QNAME = new QName("http://www.oracle.com/external/services/sampleservice/request/v1.0", "order_type");
    private final static QName _Username_QNAME = new QName("http://www.oracle.com", "username");
    private final static QName _ServiceId_QNAME = new QName("http://www.oracle.com/external/services/sampleservice/request/v1.0", "service_id");
    private final static QName _TrxId_QNAME = new QName("http://www.oracle.com/external/services/sampleservice/request/v1.0", "trx_id");
    private final static QName _Password_QNAME = new QName("http://www.oracle.com", "password");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.streamworx2.data.request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link Authenticationheader }
     * 
     */
    public Authenticationheader createAuthenticationheader() {
        return new Authenticationheader();
    }

    /**
     * Create an instance of {@link Envelope }
     * 
     */
    public Envelope createEnvelope() {
        return new Envelope();
    }

    /**
     * Create an instance of {@link Body }
     * 
     */
    public Body createBody() {
        return new Body();
    }

    /**
     * Create an instance of {@link Sampleservicerq }
     * 
     */
    public Sampleservicerq createSampleservicerq() {
        return new Sampleservicerq();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oracle.com/external/services/sampleservice/request/v1.0", name = "type")
    public JAXBElement<String> createType(String value) {
        return new JAXBElement<String>(_Type_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oracle.com/external/services/sampleservice/request/v1.0", name = "order_type")
    public JAXBElement<String> createOrderType(String value) {
        return new JAXBElement<String>(_OrderType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oracle.com", name = "username")
    public JAXBElement<String> createUsername(String value) {
        return new JAXBElement<String>(_Username_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oracle.com/external/services/sampleservice/request/v1.0", name = "service_id")
    public JAXBElement<String> createServiceId(String value) {
        return new JAXBElement<String>(_ServiceId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oracle.com/external/services/sampleservice/request/v1.0", name = "trx_id")
    public JAXBElement<String> createTrxId(String value) {
        return new JAXBElement<String>(_TrxId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oracle.com", name = "password")
    public JAXBElement<String> createPassword(String value) {
        return new JAXBElement<String>(_Password_QNAME, String.class, null, value);
    }

}
