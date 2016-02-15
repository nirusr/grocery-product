
package com.walmart.grocery.model;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "RecordInfo",
    "CustomerInfo",
    "OrderInfo",
    "Version",
    "xmlns"
})
public class TSOrder {
	
	
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("RecordInfo")
    private com.walmart.grocery.model.RecordInfo RecordInfo;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("CustomerInfo")
    private com.walmart.grocery.model.CustomerInfo CustomerInfo;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("OrderInfo")
    private com.walmart.grocery.model.OrderInfo orderInfo;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Version")
    private String Version;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("xmlns")
    private String xmlns;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The RecordInfo
     */
    @JsonProperty("RecordInfo")
    public com.walmart.grocery.model.RecordInfo getRecordInfo() {
        return RecordInfo;
    }

    /**
     * 
     * (Required)
     * 
     * @param RecordInfo
     *     The RecordInfo
     */
    @JsonProperty("RecordInfo")
    public void setRecordInfo(com.walmart.grocery.model.RecordInfo RecordInfo) {
        this.RecordInfo = RecordInfo;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The CustomerInfo
     */
    @JsonProperty("CustomerInfo")
    public com.walmart.grocery.model.CustomerInfo getCustomerInfo() {
        return CustomerInfo;
    }

    /**
     * 
     * (Required)
     * 
     * @param CustomerInfo
     *     The CustomerInfo
     */
    @JsonProperty("CustomerInfo")
    public void setCustomerInfo(com.walmart.grocery.model.CustomerInfo CustomerInfo) {
        this.CustomerInfo = CustomerInfo;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The OrderInfo
     */
    @JsonProperty("OrderInfo")
    public com.walmart.grocery.model.OrderInfo getOrderInfo() {
        return orderInfo;
    }

    /**
     * 
     * (Required)
     * 
     * @param OrderInfo
     *     The OrderInfo
     */
    @JsonProperty("OrderInfo")
    public void setOrderInfo(com.walmart.grocery.model.OrderInfo OrderInfo) {
        this.orderInfo = OrderInfo;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The Version
     */
    @JsonProperty("Version")
    public String getVersion() {
        return Version;
    }

    /**
     * 
     * (Required)
     * 
     * @param Version
     *     The Version
     */
    @JsonProperty("Version")
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The xmlns
     */
    @JsonProperty("xmlns")
    public String getXmlns() {
        return xmlns;
    }

    /**
     * 
     * (Required)
     * 
     * @param xmlns
     *     The xmlns
     */
    @JsonProperty("xmlns")
    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

}
