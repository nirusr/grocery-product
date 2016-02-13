
package com.walmart.grocery.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "eVoucherName",
    "eVoucherDescription",
    "eVoucherAmount"
})
public class EVoucherDetails {

    @JsonProperty("eVoucherName")
    private String eVoucherName;
    @JsonProperty("eVoucherDescription")
    private String eVoucherDescription;
    @JsonProperty("eVoucherAmount")
    private String eVoucherAmount;

    /**
     * 
     * @return
     *     The eVoucherName
     */
    @JsonProperty("eVoucherName")
    public String getEVoucherName() {
        return eVoucherName;
    }

    /**
     * 
     * @param eVoucherName
     *     The eVoucherName
     */
    @JsonProperty("eVoucherName")
    public void setEVoucherName(String eVoucherName) {
        this.eVoucherName = eVoucherName;
    }

    /**
     * 
     * @return
     *     The eVoucherDescription
     */
    @JsonProperty("eVoucherDescription")
    public String getEVoucherDescription() {
        return eVoucherDescription;
    }

    /**
     * 
     * @param eVoucherDescription
     *     The eVoucherDescription
     */
    @JsonProperty("eVoucherDescription")
    public void setEVoucherDescription(String eVoucherDescription) {
        this.eVoucherDescription = eVoucherDescription;
    }

    /**
     * 
     * @return
     *     The eVoucherAmount
     */
    @JsonProperty("eVoucherAmount")
    public String getEVoucherAmount() {
        return eVoucherAmount;
    }

    /**
     * 
     * @param eVoucherAmount
     *     The eVoucherAmount
     */
    @JsonProperty("eVoucherAmount")
    public void setEVoucherAmount(String eVoucherAmount) {
        this.eVoucherAmount = eVoucherAmount;
    }

}
