
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
 *         &lt;element ref="{http://www.oracle.com}authenticationheader"/>
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
    "authenticationheader"
})
@XmlRootElement(name = "Header", namespace = "http://sample-service.com/request")
public class Header {

    @XmlElement(namespace = "http://www.oracle.com", required = true)
    protected Authenticationheader authenticationheader;

    /**
     * Gets the value of the authenticationheader property.
     * 
     * @return
     *     possible object is
     *     {@link Authenticationheader }
     *     
     */
    public Authenticationheader getAuthenticationheader() {
        return authenticationheader;
    }

    /**
     * Sets the value of the authenticationheader property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authenticationheader }
     *     
     */
    public void setAuthenticationheader(Authenticationheader value) {
        this.authenticationheader = value;
    }

}
