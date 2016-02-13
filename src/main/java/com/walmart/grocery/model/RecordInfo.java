
package com.walmart.grocery.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "RecordType",
    "CountryCode",
    "StoreNo",
    "TeamID"
})
public class RecordInfo {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("RecordType")
    private String RecordType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("CountryCode")
    private String CountryCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("StoreNo")
    private String StoreNo;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("TeamID")
    private String TeamID;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The RecordType
     */
    @JsonProperty("RecordType")
    public String getRecordType() {
        return RecordType;
    }

    /**
     * 
     * (Required)
     * 
     * @param RecordType
     *     The RecordType
     */
    @JsonProperty("RecordType")
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The CountryCode
     */
    @JsonProperty("CountryCode")
    public String getCountryCode() {
        return CountryCode;
    }

    /**
     * 
     * (Required)
     * 
     * @param CountryCode
     *     The CountryCode
     */
    @JsonProperty("CountryCode")
    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The StoreNo
     */
    @JsonProperty("StoreNo")
    public String getStoreNo() {
        return StoreNo;
    }

    /**
     * 
     * (Required)
     * 
     * @param StoreNo
     *     The StoreNo
     */
    @JsonProperty("StoreNo")
    public void setStoreNo(String StoreNo) {
        this.StoreNo = StoreNo;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The TeamID
     */
    @JsonProperty("TeamID")
    public String getTeamID() {
        return TeamID;
    }

    /**
     * 
     * (Required)
     * 
     * @param TeamID
     *     The TeamID
     */
    @JsonProperty("TeamID")
    public void setTeamID(String TeamID) {
        this.TeamID = TeamID;
    }

}
