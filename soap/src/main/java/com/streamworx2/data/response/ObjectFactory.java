
package com.streamworx2.data.response;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.streamworx2.data.response package. 
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

    private final static QName _ErrorCode_QNAME = new QName("http://www.oracle.com/external/services/sampleservice/response/v1.0", "error_code");
    private final static QName _TrxId_QNAME = new QName("http://www.oracle.com/external/services/sampleservice/response/v1.0", "trx_id");
    private final static QName _ErrorMsg_QNAME = new QName("http://www.oracle.com/external/services/sampleservice/response/v1.0", "error_msg");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.streamworx2.data.response
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
     * Create an instance of {@link Sampleservicers }
     * 
     */
    public Sampleservicers createSampleservicers() {
        return new Sampleservicers();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oracle.com/external/services/sampleservice/response/v1.0", name = "error_code")
    public JAXBElement<String> createErrorCode(String value) {
        return new JAXBElement<String>(_ErrorCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oracle.com/external/services/sampleservice/response/v1.0", name = "trx_id")
    public JAXBElement<String> createTrxId(String value) {
        return new JAXBElement<String>(_TrxId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.oracle.com/external/services/sampleservice/response/v1.0", name = "error_msg")
    public JAXBElement<String> createErrorMsg(String value) {
        return new JAXBElement<String>(_ErrorMsg_QNAME, String.class, null, value);
    }

}
