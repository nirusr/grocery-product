
package com.walmart.grocery.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "CustomerAddress",
    "AssociateDiscountNumber",
    "DeliveryInstructions",
    "FirstName",
    "LastName",
    "ID"
})
public class CustomerInfo {

    @JsonProperty("CustomerAddress")
    private com.walmart.grocery.model.CustomerAddress CustomerAddress;
    @JsonProperty("AssociateDiscountNumber")
    private String AssociateDiscountNumber;
    @JsonProperty("DeliveryInstructions")
    private String DeliveryInstructions;
    @JsonProperty("FirstName")
    private String FirstName;
    @JsonProperty("LastName")
    private String LastName;
    @JsonProperty("ID")
    private String ID;

    /**
     * 
     * @return
     *     The CustomerAddress
     */
    @JsonProperty("CustomerAddress")
    public com.walmart.grocery.model.CustomerAddress getCustomerAddress() {
        return CustomerAddress;
    }

    /**
     * 
     * @param CustomerAddress
     *     The CustomerAddress
     */
    @JsonProperty("CustomerAddress")
    public void setCustomerAddress(com.walmart.grocery.model.CustomerAddress CustomerAddress) {
        this.CustomerAddress = CustomerAddress;
    }

    /**
     * 
     * @return
     *     The AssociateDiscountNumber
     */
    @JsonProperty("AssociateDiscountNumber")
    public String getAssociateDiscountNumber() {
        return AssociateDiscountNumber;
    }

    /**
     * 
     * @param AssociateDiscountNumber
     *     The AssociateDiscountNumber
     */
    @JsonProperty("AssociateDiscountNumber")
    public void setAssociateDiscountNumber(String AssociateDiscountNumber) {
        this.AssociateDiscountNumber = AssociateDiscountNumber;
    }

    /**
     * 
     * @return
     *     The DeliveryInstructions
     */
    @JsonProperty("DeliveryInstructions")
    public String getDeliveryInstructions() {
        return DeliveryInstructions;
    }

    /**
     * 
     * @param DeliveryInstructions
     *     The DeliveryInstructions
     */
    @JsonProperty("DeliveryInstructions")
    public void setDeliveryInstructions(String DeliveryInstructions) {
        this.DeliveryInstructions = DeliveryInstructions;
    }

    /**
     * 
     * @return
     *     The FirstName
     */
    @JsonProperty("FirstName")
    public String getFirstName() {
        return FirstName;
    }

    /**
     * 
     * @param FirstName
     *     The FirstName
     */
    @JsonProperty("FirstName")
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * 
     * @return
     *     The LastName
     */
    @JsonProperty("LastName")
    public String getLastName() {
        return LastName;
    }

    /**
     * 
     * @param LastName
     *     The LastName
     */
    @JsonProperty("LastName")
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * 
     * @return
     *     The ID
     */
    @JsonProperty("ID")
    public String getID() {
        return ID;
    }

    /**
     * 
     * @param ID
     *     The ID
     */
    @JsonProperty("ID")
    public void setID(String ID) {
        this.ID = ID;
    }

}
