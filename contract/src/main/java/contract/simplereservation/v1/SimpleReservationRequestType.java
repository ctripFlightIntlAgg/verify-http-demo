/**
 * Autogenerated by soa-sdk-toolkit
 * <p>
 * DO NOT EDIT DIRECTLY
 */
package contract.simplereservation.v1;

import contract.commontype.v1.ContactInfo;
import contract.commontype.v1.RequestHeaderType;
import contract.commontype.v1.ReservationPassengerInfoType;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "SimpleReservationRequest", namespace = "urn:com:ctrip:flight:intl:booking:bookingValidation:contract:simplereservation:v1")
@XmlType(name = "SimpleReservationRequestType", namespace = "urn:com:ctrip:flight:intl:booking:bookingValidation:contract:simplereservation:v1", propOrder = {
    "requestHeader", "sync", "tokenNumber", "orderID", "searchCriteriaToken", "routeSearchToken", "passengerList",
    "contactInfo", "reservationSource", "priceUnitList", "xProductToken", "extraCmdList", "finalRequest"})
@SuppressWarnings("all")
public class SimpleReservationRequestType implements Serializable {

    private static final long serialVersionUID = 1L;

    public SimpleReservationRequestType(RequestHeaderType requestHeader, boolean sync, String tokenNumber, long orderID,
        String searchCriteriaToken, String routeSearchToken, List<ReservationPassengerInfoType> passengerList,
        ContactInfo contactInfo, int reservationSource, List<PriceUnitType> priceUnitList, String xProductToken,
        List<String> extraCmdList, boolean finalRequest) {
        this.requestHeader = requestHeader;
        this.sync = sync;
        this.tokenNumber = tokenNumber;
        this.orderID = orderID;
        this.searchCriteriaToken = searchCriteriaToken;
        this.routeSearchToken = routeSearchToken;
        this.passengerList = passengerList;
        this.contactInfo = contactInfo;
        this.reservationSource = reservationSource;
        this.priceUnitList = priceUnitList;
        this.xProductToken = xProductToken;
        this.extraCmdList = extraCmdList;
        this.finalRequest = finalRequest;
    }

    public SimpleReservationRequestType() {
    }

    @JsonProperty("RequestHeader")
    @XmlElement(name = "RequestHeader")
    private RequestHeaderType requestHeader;

    @JsonProperty("Sync")
    @XmlElement(name = "Sync")
    private boolean sync;

    @JsonProperty("TokenNumber")
    @XmlElement(name = "TokenNumber")
    private String tokenNumber;

    @JsonProperty("OrderID")
    @XmlElement(name = "OrderID")
    private long orderID;

    @JsonProperty("SearchCriteriaToken")
    @XmlElement(name = "SearchCriteriaToken")
    private String searchCriteriaToken;

    @JsonProperty("RouteSearchToken")
    @XmlElement(name = "RouteSearchToken")
    private String routeSearchToken;

    @JsonProperty("PassengerList")
    @XmlElement(name = "ReservationPassengerInfo", namespace = "urn:com:ctrip:flight:intl:booking:bookingValidation:contract:commontype:v1")
    @XmlElementWrapper(name = "PassengerList")
    private List<ReservationPassengerInfoType> passengerList;

    @JsonProperty("ContactInfo")
    @XmlElement(name = "ContactInfo")
    private ContactInfo contactInfo;

    @JsonProperty("ReservationSource")
    @XmlElement(name = "ReservationSource")
    private int reservationSource;

    @JsonProperty("PriceUnitList")
    @XmlElement(name = "PriceUnit")
    @XmlElementWrapper(name = "PriceUnitList")
    private List<PriceUnitType> priceUnitList;

    @JsonProperty("XProductToken")
    @XmlElement(name = "XProductToken")
    private String xProductToken;

    @JsonProperty("ExtraCmdList")
    @XmlElement(name = "ExtraCmd", namespace = "urn:com:ctrip:flight:intl:booking:bookingValidation:contract:commontype:v1")
    @XmlElementWrapper(name = "ExtraCmdList")
    private List<String> extraCmdList;

    @JsonProperty("FinalRequest")
    @XmlElement(name = "FinalRequest")
    private boolean finalRequest;

    public RequestHeaderType getRequestHeader() {
        return this.requestHeader;
    }

    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * 是否同步
     */
    public boolean getSync() {
        return this.sync;
    }

    public void setSync(boolean sync) {
        this.sync = sync;
    }

    /**
     * 异步第一次/同步请求可为空，获取结果时需要传TokenNumber
     */
    public String getTokenNumber() {
        return this.tokenNumber;
    }

    public void setTokenNumber(String tokenNumber) {
        this.tokenNumber = tokenNumber;
    }

    public long getOrderID() {
        return this.orderID;
    }

    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }

    /**
     * *查询条件Token
     */
    public String getSearchCriteriaToken() {
        return this.searchCriteriaToken;
    }

    public void setSearchCriteriaToken(String searchCriteriaToken) {
        this.searchCriteriaToken = searchCriteriaToken;
    }

    /**
     * *路由查询Token
     */
    public String getRouteSearchToken() {
        return this.routeSearchToken;
    }

    public void setRouteSearchToken(String routeSearchToken) {
        this.routeSearchToken = routeSearchToken;
    }

    /**
     * 乘客信息列表
     */
    public List<ReservationPassengerInfoType> getPassengerList() {
        return this.passengerList;
    }

    public void setPassengerList(List<ReservationPassengerInfoType> passengerList) {
        this.passengerList = passengerList;
    }

    /**
     * 联系人信息
     */
    public ContactInfo getContactInfo() {
        return this.contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    /**
     * 0:预订订位；1：补订位；2：退改签订位
     */
    public int getReservationSource() {
        return this.reservationSource;
    }

    public void setReservationSource(int reservationSource) {
        this.reservationSource = reservationSource;
    }

    /**
     * PriceUnit信息集合
     */
    public List<PriceUnitType> getPriceUnitList() {
        return this.priceUnitList;
    }

    public void setPriceUnitList(List<PriceUnitType> priceUnitList) {
        this.priceUnitList = priceUnitList;
    }

    /**
     * X 产品流水号
     */
    public String getXProductToken() {
        return this.xProductToken;
    }

    public void setXProductToken(String xProductToken) {
        this.xProductToken = xProductToken;
    }

    /**
     * 商旅票台 计量指令
     */
    public List<String> getExtraCmdList() {
        return this.extraCmdList;
    }

    public void setExtraCmdList(List<String> extraCmdList) {
        this.extraCmdList = extraCmdList;
    }

    /**
     * 是否是最后一次取结果
     */
    public boolean getFinalRequest() {
        return this.finalRequest;
    }

    public void setFinalRequest(boolean finalRequest) {
        this.finalRequest = finalRequest;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        final SimpleReservationRequestType other = (SimpleReservationRequestType) obj;
        return Objects.equal(this.requestHeader, other.requestHeader) && Objects.equal(this.sync, other.sync) && Objects
            .equal(this.tokenNumber, other.tokenNumber) && Objects.equal(this.orderID, other.orderID) && Objects
            .equal(this.searchCriteriaToken, other.searchCriteriaToken) && Objects
            .equal(this.routeSearchToken, other.routeSearchToken) && Objects
            .equal(this.passengerList, other.passengerList) && Objects.equal(this.contactInfo, other.contactInfo)
            && Objects.equal(this.reservationSource, other.reservationSource) && Objects
            .equal(this.priceUnitList, other.priceUnitList) && Objects.equal(this.xProductToken, other.xProductToken)
            && Objects.equal(this.extraCmdList, other.extraCmdList) && Objects
            .equal(this.finalRequest, other.finalRequest);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.requestHeader);
        result = 31 * result + Objects.hashCode(this.sync);
        result = 31 * result + Objects.hashCode(this.tokenNumber);
        result = 31 * result + Objects.hashCode(this.orderID);
        result = 31 * result + Objects.hashCode(this.searchCriteriaToken);
        result = 31 * result + Objects.hashCode(this.routeSearchToken);
        result = 31 * result + Objects.hashCode(this.passengerList);
        result = 31 * result + Objects.hashCode(this.contactInfo);
        result = 31 * result + Objects.hashCode(this.reservationSource);
        result = 31 * result + Objects.hashCode(this.priceUnitList);
        result = 31 * result + Objects.hashCode(this.xProductToken);
        result = 31 * result + Objects.hashCode(this.extraCmdList);
        result = 31 * result + Objects.hashCode(this.finalRequest);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).add("requestHeader", requestHeader).add("sync", sync)
            .add("tokenNumber", tokenNumber).add("orderID", orderID).add("searchCriteriaToken", searchCriteriaToken)
            .add("routeSearchToken", routeSearchToken).add("passengerList", passengerList)
            .add("contactInfo", contactInfo).add("reservationSource", reservationSource)
            .add("priceUnitList", priceUnitList).add("xProductToken", xProductToken).add("extraCmdList", extraCmdList)
            .add("finalRequest", finalRequest).toString();
    }

}