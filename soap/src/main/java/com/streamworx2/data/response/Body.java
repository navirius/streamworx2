
package com.streamworx2.data.response;

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
 *         &lt;element ref="{http://www.oracle.com/external/services/sampleservice/response/v1.0}sampleservicers"/>
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
    "sampleservicers"
})
@XmlRootElement(name = "Body", namespace = "http://sample-service.com/response")
public class Body {

    @XmlElement(namespace = "http://www.oracle.com/external/services/sampleservice/response/v1.0", required = true)
    protected Sampleservicers sampleservicers;

    /**
     * Gets the value of the sampleservicers property.
     * 
     * @return
     *     possible object is
     *     {@link Sampleservicers }
     *     
     */
    public Sampleservicers getSampleservicers() {
        return sampleservicers;
    }

    /**
     * Sets the value of the sampleservicers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sampleservicers }
     *     
     */
    public void setSampleservicers(Sampleservicers value) {
        this.sampleservicers = value;
    }

}
