
package com.walmart.grocery.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "OrderNumber",
    "Zone",
    "GroupID",
    "PlannedDeliveryTime",
    "ScheduleTimeSlot",
    "FulfillmentDate",
    "GeneralMessage",
    "OrderMessage",
    "eVoucherTotalAmount",
    "eVoucherDetails",
    "DeliveryCharge",
    "CarrierBagCharge",
    "OrderTotal",
    "Authorized",
    "EmergencyInd",
    "InStorePick",
    "DoorstepTime",
    "VanID",
    "ScheduleNumber",
    "OrderLine",
    "DetailLines"
})
public class OrderInfo {

    @JsonProperty("OrderNumber")
    private String OrderNumber;
    @JsonProperty("Zone")
    private String Zone;
    @JsonProperty("GroupID")
    private String GroupID;
    @JsonProperty("PlannedDeliveryTime")
    private String PlannedDeliveryTime;
    @JsonProperty("ScheduleTimeSlot")
    private String ScheduleTimeSlot;
    @JsonProperty("FulfillmentDate")
    private String FulfillmentDate;
    @JsonProperty("GeneralMessage")
    private String GeneralMessage;
    @JsonProperty("OrderMessage")
    private String OrderMessage;
    @JsonProperty("eVoucherTotalAmount")
    private String eVoucherTotalAmount;
    @JsonProperty("eVoucherDetails")
    private EVoucherDetails eVoucherDetails;
    @JsonProperty("DeliveryCharge")
    private String DeliveryCharge;
    @JsonProperty("CarrierBagCharge")
    private String CarrierBagCharge;
    @JsonProperty("OrderTotal")
    private String OrderTotal;
    @JsonProperty("Authorized")
    private String Authorized;
    @JsonProperty("EmergencyInd")
    private String EmergencyInd;
    @JsonProperty("InStorePick")
    private String InStorePick;
    @JsonProperty("DoorstepTime")
    private String DoorstepTime;
    @JsonProperty("VanID")
    private String VanID;
    @JsonProperty("ScheduleNumber")
    private String ScheduleNumber;
    @JsonProperty("OrderLine")
    private List<Object> OrderLine = new ArrayList<Object>();
    @JsonProperty("DetailLines")
    private String DetailLines;

    /**
     * 
     * @return
     *     The OrderNumber
     */
    @JsonProperty("OrderNumber")
    public String getOrderNumber() {
        return OrderNumber;
    }

    /**
     * 
     * @param OrderNumber
     *     The OrderNumber
     */
    @JsonProperty("OrderNumber")
    public void setOrderNumber(String OrderNumber) {
        this.OrderNumber = OrderNumber;
    }

    /**
     * 
     * @return
     *     The Zone
     */
    @JsonProperty("Zone")
    public String getZone() {
        return Zone;
    }

    /**
     * 
     * @param Zone
     *     The Zone
     */
    @JsonProperty("Zone")
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 
     * @return
     *     The GroupID
     */
    @JsonProperty("GroupID")
    public String getGroupID() {
        return GroupID;
    }

    /**
     * 
     * @param GroupID
     *     The GroupID
     */
    @JsonProperty("GroupID")
    public void setGroupID(String GroupID) {
        this.GroupID = GroupID;
    }

    /**
     * 
     * @return
     *     The PlannedDeliveryTime
     */
    @JsonProperty("PlannedDeliveryTime")
    public String getPlannedDeliveryTime() {
        return PlannedDeliveryTime;
    }

    /**
     * 
     * @param PlannedDeliveryTime
     *     The PlannedDeliveryTime
     */
    @JsonProperty("PlannedDeliveryTime")
    public void setPlannedDeliveryTime(String PlannedDeliveryTime) {
        this.PlannedDeliveryTime = PlannedDeliveryTime;
    }

    /**
     * 
     * @return
     *     The ScheduleTimeSlot
     */
    @JsonProperty("ScheduleTimeSlot")
    public String getScheduleTimeSlot() {
        return ScheduleTimeSlot;
    }

    /**
     * 
     * @param ScheduleTimeSlot
     *     The ScheduleTimeSlot
     */
    @JsonProperty("ScheduleTimeSlot")
    public void setScheduleTimeSlot(String ScheduleTimeSlot) {
        this.ScheduleTimeSlot = ScheduleTimeSlot;
    }

    /**
     * 
     * @return
     *     The FulfillmentDate
     */
    @JsonProperty("FulfillmentDate")
    public String getFulfillmentDate() {
        return FulfillmentDate;
    }

    /**
     * 
     * @param FulfillmentDate
     *     The FulfillmentDate
     */
    @JsonProperty("FulfillmentDate")
    public void setFulfillmentDate(String FulfillmentDate) {
        this.FulfillmentDate = FulfillmentDate;
    }

    /**
     * 
     * @return
     *     The GeneralMessage
     */
    @JsonProperty("GeneralMessage")
    public String getGeneralMessage() {
        return GeneralMessage;
    }

    /**
     * 
     * @param GeneralMessage
     *     The GeneralMessage
     */
    @JsonProperty("GeneralMessage")
    public void setGeneralMessage(String GeneralMessage) {
        this.GeneralMessage = GeneralMessage;
    }

    /**
     * 
     * @return
     *     The OrderMessage
     */
    @JsonProperty("OrderMessage")
    public String getOrderMessage() {
        return OrderMessage;
    }

    /**
     * 
     * @param OrderMessage
     *     The OrderMessage
     */
    @JsonProperty("OrderMessage")
    public void setOrderMessage(String OrderMessage) {
        this.OrderMessage = OrderMessage;
    }

    /**
     * 
     * @return
     *     The eVoucherTotalAmount
     */
    @JsonProperty("eVoucherTotalAmount")
    public String getEVoucherTotalAmount() {
        return eVoucherTotalAmount;
    }

    /**
     * 
     * @param eVoucherTotalAmount
     *     The eVoucherTotalAmount
     */
    @JsonProperty("eVoucherTotalAmount")
    public void setEVoucherTotalAmount(String eVoucherTotalAmount) {
        this.eVoucherTotalAmount = eVoucherTotalAmount;
    }

    /**
     * 
     * @return
     *     The eVoucherDetails
     */
    @JsonProperty("eVoucherDetails")
    public EVoucherDetails getEVoucherDetails() {
        return eVoucherDetails;
    }

    /**
     * 
     * @param eVoucherDetails
     *     The eVoucherDetails
     */
    @JsonProperty("eVoucherDetails")
    public void setEVoucherDetails(EVoucherDetails eVoucherDetails) {
        this.eVoucherDetails = eVoucherDetails;
    }

    /**
     * 
     * @return
     *     The DeliveryCharge
     */
    @JsonProperty("DeliveryCharge")
    public String getDeliveryCharge() {
        return DeliveryCharge;
    }

    /**
     * 
     * @param DeliveryCharge
     *     The DeliveryCharge
     */
    @JsonProperty("DeliveryCharge")
    public void setDeliveryCharge(String DeliveryCharge) {
        this.DeliveryCharge = DeliveryCharge;
    }

    /**
     * 
     * @return
     *     The CarrierBagCharge
     */
    @JsonProperty("CarrierBagCharge")
    public String getCarrierBagCharge() {
        return CarrierBagCharge;
    }

    /**
     * 
     * @param CarrierBagCharge
     *     The CarrierBagCharge
     */
    @JsonProperty("CarrierBagCharge")
    public void setCarrierBagCharge(String CarrierBagCharge) {
        this.CarrierBagCharge = CarrierBagCharge;
    }

    /**
     * 
     * @return
     *     The OrderTotal
     */
    @JsonProperty("OrderTotal")
    public String getOrderTotal() {
        return OrderTotal;
    }

    /**
     * 
     * @param OrderTotal
     *     The OrderTotal
     */
    @JsonProperty("OrderTotal")
    public void setOrderTotal(String OrderTotal) {
        this.OrderTotal = OrderTotal;
    }

    /**
     * 
     * @return
     *     The Authorized
     */
    @JsonProperty("Authorized")
    public String getAuthorized() {
        return Authorized;
    }

    /**
     * 
     * @param Authorized
     *     The Authorized
     */
    @JsonProperty("Authorized")
    public void setAuthorized(String Authorized) {
        this.Authorized = Authorized;
    }

    /**
     * 
     * @return
     *     The EmergencyInd
     */
    @JsonProperty("EmergencyInd")
    public String getEmergencyInd() {
        return EmergencyInd;
    }

    /**
     * 
     * @param EmergencyInd
     *     The EmergencyInd
     */
    @JsonProperty("EmergencyInd")
    public void setEmergencyInd(String EmergencyInd) {
        this.EmergencyInd = EmergencyInd;
    }

    /**
     * 
     * @return
     *     The InStorePick
     */
    @JsonProperty("InStorePick")
    public String getInStorePick() {
        return InStorePick;
    }

    /**
     * 
     * @param InStorePick
     *     The InStorePick
     */
    @JsonProperty("InStorePick")
    public void setInStorePick(String InStorePick) {
        this.InStorePick = InStorePick;
    }

    /**
     * 
     * @return
     *     The DoorstepTime
     */
    @JsonProperty("DoorstepTime")
    public String getDoorstepTime() {
        return DoorstepTime;
    }

    /**
     * 
     * @param DoorstepTime
     *     The DoorstepTime
     */
    @JsonProperty("DoorstepTime")
    public void setDoorstepTime(String DoorstepTime) {
        this.DoorstepTime = DoorstepTime;
    }

    /**
     * 
     * @return
     *     The VanID
     */
    @JsonProperty("VanID")
    public String getVanID() {
        return VanID;
    }

    /**
     * 
     * @param VanID
     *     The VanID
     */
    @JsonProperty("VanID")
    public void setVanID(String VanID) {
        this.VanID = VanID;
    }

    /**
     * 
     * @return
     *     The ScheduleNumber
     */
    @JsonProperty("ScheduleNumber")
    public String getScheduleNumber() {
        return ScheduleNumber;
    }

    /**
     * 
     * @param ScheduleNumber
     *     The ScheduleNumber
     */
    @JsonProperty("ScheduleNumber")
    public void setScheduleNumber(String ScheduleNumber) {
        this.ScheduleNumber = ScheduleNumber;
    }

    /**
     * 
     * @return
     *     The OrderLine
     */
    @JsonProperty("OrderLine")
    public List<Object> getOrderLine() {
        return OrderLine;
    }

    /**
     * 
     * @param OrderLine
     *     The OrderLine
     */
    @JsonProperty("OrderLine")
    public void setOrderLine(List<Object> OrderLine) {
        this.OrderLine = OrderLine;
    }

    /**
     * 
     * @return
     *     The DetailLines
     */
    @JsonProperty("DetailLines")
    public String getDetailLines() {
        return DetailLines;
    }

    /**
     * 
     * @param DetailLines
     *     The DetailLines
     */
    @JsonProperty("DetailLines")
    public void setDetailLines(String DetailLines) {
        this.DetailLines = DetailLines;
    }

}
