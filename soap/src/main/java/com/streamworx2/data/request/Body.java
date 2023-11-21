
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
 *         &lt;element ref="{http://www.oracle.com/external/services/sampleservice/request/v1.0}sampleservicerq"/>
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
    "sampleservicerq"
})
@XmlRootElement(name = "Body", namespace = "http://sample-service.com/request")
public class Body {

    @XmlElement(namespace = "http://www.oracle.com/external/services/sampleservice/request/v1.0", required = true)
    protected Sampleservicerq sampleservicerq;

    /**
     * Gets the value of the sampleservicerq property.
     * 
     * @return
     *     possible object is
     *     {@link Sampleservicerq }
     *     
     */
    public Sampleservicerq getSampleservicerq() {
        return sampleservicerq;
    }

    /**
     * Sets the value of the sampleservicerq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sampleservicerq }
     *     
     */
    public void setSampleservicerq(Sampleservicerq value) {
        this.sampleservicerq = value;
    }

}
