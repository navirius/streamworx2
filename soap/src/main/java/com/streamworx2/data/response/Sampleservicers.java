
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
 *         &lt;element ref="{http://www.oracle.com/external/services/sampleservice/response/v1.0}error_code"/>
 *         &lt;element ref="{http://www.oracle.com/external/services/sampleservice/response/v1.0}error_msg"/>
 *         &lt;element ref="{http://www.oracle.com/external/services/sampleservice/response/v1.0}trx_id"/>
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
    "errorCode",
    "errorMsg",
    "trxId"
})
@XmlRootElement(name = "sampleservicers", namespace = "http://www.oracle.com/external/services/sampleservice/response/v1.0")
public class Sampleservicers {

    @XmlElement(name = "error_code", namespace = "http://www.oracle.com/external/services/sampleservice/response/v1.0", required = true)
    protected String errorCode;
    @XmlElement(name = "error_msg", namespace = "http://www.oracle.com/external/services/sampleservice/response/v1.0", required = true)
    protected String errorMsg;
    @XmlElement(name = "trx_id", namespace = "http://www.oracle.com/external/services/sampleservice/response/v1.0", required = true)
    protected String trxId;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * Sets the value of the errorMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMsg(String value) {
        this.errorMsg = value;
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
