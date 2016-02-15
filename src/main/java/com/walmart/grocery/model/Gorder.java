
package com.walmart.grocery.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "TSOrder"
})
public class Gorder {
	@org.springframework.data.annotation.Id
	private String Id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("TSOrder")
    private com.walmart.grocery.model.TSOrder tSOrder;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The TSOrder
     */
    @JsonProperty("TSOrder")
    public com.walmart.grocery.model.TSOrder getTSOrder() {
        return tSOrder;
    }

    /**
     * 
     * (Required)
     * 
     * @param TSOrder
     *     The TSOrder
     */
    @JsonProperty("TSOrder")
    public void setTSOrder(com.walmart.grocery.model.TSOrder TSOrder) {
        this.tSOrder = TSOrder;
    }

}
