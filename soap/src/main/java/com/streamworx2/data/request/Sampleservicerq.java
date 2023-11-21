
package com.streamworx2.data.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.oracle.com/external/services/sampleservice/request/v1.0}service_id"/>
 *         &lt;element ref="{http://www.oracle.com/external/services/sampleservice/request/v1.0}order_type"/>
 *         &lt;element ref="{http://www.oracle.com/external/services/sampleservice/request/v1.0}type"/>
 *         &lt;element ref="{http://www.oracle.com/external/services/sampleservice/request/v1.0}trx_id"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceId",
    "orderType",
    "type",
    "trxId"
})
@XmlRootElement(name = "sampleservicerq", namespace = "http://www.oracle.com/external/services/sampleservice/request/v1.0")
public class Sampleservicerq {

    @XmlElement(name = "service_id", namespace = "http://www.oracle.com/external/services/sampleservice/request/v1.0", required = true)
    protected String serviceId;
    @XmlElement(name = "order_type", namespace = "http://www.oracle.com/external/services/sampleservice/request/v1.0", required = true)
    protected String orderType;
    @XmlElement(namespace = "http://www.oracle.com/external/services/sampleservice/request/v1.0", required = true)
    protected String type;
    @XmlElement(name = "trx_id", namespace = "http://www.oracle.com/external/services/sampleservice/request/v1.0", required = true)
    protected String trxId;

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the trxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrxId() {
        return trxId;
    }

    /**
     * Sets the value of the trxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrxId(String value) {
        this.trxId = value;
    }

}
