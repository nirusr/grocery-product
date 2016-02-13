
package com.walmart.grocery.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "AddressLine1",
    "AddressLine2",
    "AddressLine3",
    "City",
    "County",
    "State",
    "DayPhone",
    "EveningPhone",
    "CustomerFax",
    "Email",
    "PostCode"
})
public class CustomerAddress {

    @JsonProperty("AddressLine1")
    private String AddressLine1;
    @JsonProperty("AddressLine2")
    private String AddressLine2;
    @JsonProperty("AddressLine3")
    private String AddressLine3;
    @JsonProperty("City")
    private String City;
    @JsonProperty("County")
    private String County;
    @JsonProperty("State")
    private String State;
    @JsonProperty("DayPhone")
    private String DayPhone;
    @JsonProperty("EveningPhone")
    private String EveningPhone;
    @JsonProperty("CustomerFax")
    private String CustomerFax;
    @JsonProperty("Email")
    private String Email;
    @JsonProperty("PostCode")
    private String PostCode;

    /**
     * 
     * @return
     *     The AddressLine1
     */
    @JsonProperty("AddressLine1")
    public String getAddressLine1() {
        return AddressLine1;
    }

    /**
     * 
     * @param AddressLine1
     *     The AddressLine1
     */
    @JsonProperty("AddressLine1")
    public void setAddressLine1(String AddressLine1) {
        this.AddressLine1 = AddressLine1;
    }

    /**
     * 
     * @return
     *     The AddressLine2
     */
    @JsonProperty("AddressLine2")
    public String getAddressLine2() {
        return AddressLine2;
    }

    /**
     * 
     * @param AddressLine2
     *     The AddressLine2
     */
    @JsonProperty("AddressLine2")
    public void setAddressLine2(String AddressLine2) {
        this.AddressLine2 = AddressLine2;
    }

    /**
     * 
     * @return
     *     The AddressLine3
     */
    @JsonProperty("AddressLine3")
    public String getAddressLine3() {
        return AddressLine3;
    }

    /**
     * 
     * @param AddressLine3
     *     The AddressLine3
     */
    @JsonProperty("AddressLine3")
    public void setAddressLine3(String AddressLine3) {
        this.AddressLine3 = AddressLine3;
    }

    /**
     * 
     * @return
     *     The City
     */
    @JsonProperty("City")
    public String getCity() {
        return City;
    }

    /**
     * 
     * @param City
     *     The City
     */
    @JsonProperty("City")
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * 
     * @return
     *     The County
     */
    @JsonProperty("County")
    public String getCounty() {
        return County;
    }

    /**
     * 
     * @param County
     *     The County
     */
    @JsonProperty("County")
    public void setCounty(String County) {
        this.County = County;
    }

    /**
     * 
     * @return
     *     The State
     */
    @JsonProperty("State")
    public String getState() {
        return State;
    }

    /**
     * 
     * @param State
     *     The State
     */
    @JsonProperty("State")
    public void setState(String State) {
        this.State = State;
    }

    /**
     * 
     * @return
     *     The DayPhone
     */
    @JsonProperty("DayPhone")
    public String getDayPhone() {
        return DayPhone;
    }

    /**
     * 
     * @param DayPhone
     *     The DayPhone
     */
    @JsonProperty("DayPhone")
    public void setDayPhone(String DayPhone) {
        this.DayPhone = DayPhone;
    }

    /**
     * 
     * @return
     *     The EveningPhone
     */
    @JsonProperty("EveningPhone")
    public String getEveningPhone() {
        return EveningPhone;
    }

    /**
     * 
     * @param EveningPhone
     *     The EveningPhone
     */
    @JsonProperty("EveningPhone")
    public void setEveningPhone(String EveningPhone) {
        this.EveningPhone = EveningPhone;
    }

    /**
     * 
     * @return
     *     The CustomerFax
     */
    @JsonProperty("CustomerFax")
    public String getCustomerFax() {
        return CustomerFax;
    }

    /**
     * 
     * @param CustomerFax
     *     The CustomerFax
     */
    @JsonProperty("CustomerFax")
    public void setCustomerFax(String CustomerFax) {
        this.CustomerFax = CustomerFax;
    }

    /**
     * 
     * @return
     *     The Email
     */
    @JsonProperty("Email")
    public String getEmail() {
        return Email;
    }

    /**
     * 
     * @param Email
     *     The Email
     */
    @JsonProperty("Email")
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * 
     * @return
     *     The PostCode
     */
    @JsonProperty("PostCode")
    public String getPostCode() {
        return PostCode;
    }

    /**
     * 
     * @param PostCode
     *     The PostCode
     */
    @JsonProperty("PostCode")
    public void setPostCode(String PostCode) {
        this.PostCode = PostCode;
    }

}
