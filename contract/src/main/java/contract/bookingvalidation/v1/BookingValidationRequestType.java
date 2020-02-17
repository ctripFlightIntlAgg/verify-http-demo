/**
 * Autogenerated by soa-sdk-toolkit
 * <p>
 * DO NOT EDIT DIRECTLY
 */
package contract.bookingvalidation.v1;

import contract.commontype.v1.RequestHeaderType;
import contract.commontype.v1.VerifyPassengerInfoType;
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
@XmlRootElement(name = "BookingValidationRequest", namespace = "urn:com:ctrip:flight:intl:booking:bookingValidation:contract:bookingvalidation:v1")
@XmlType(name = "BookingValidationRequestType", namespace = "urn:com:ctrip:flight:intl:booking:bookingValidation:contract:bookingvalidation:v1", propOrder = {
    "requestHeader", "sync", "tokenNumber", "searchCriteriaToken", "routeSearchToken", "verifyPassengerList",
    "finalRequest", "locale"})
@SuppressWarnings("all")
public class BookingValidationRequestType implements Serializable {

    private static final long serialVersionUID = 1L;

    public BookingValidationRequestType(RequestHeaderType requestHeader, boolean sync, String tokenNumber,
        String searchCriteriaToken, String routeSearchToken, List<VerifyPassengerInfoType> verifyPassengerList,
        boolean finalRequest, String locale) {
        this.requestHeader = requestHeader;
        this.sync = sync;
        this.tokenNumber = tokenNumber;
        this.searchCriteriaToken = searchCriteriaToken;
        this.routeSearchToken = routeSearchToken;
        this.verifyPassengerList = verifyPassengerList;
        this.finalRequest = finalRequest;
        this.locale = locale;
    }

    public BookingValidationRequestType() {
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

    @JsonProperty("SearchCriteriaToken")
    @XmlElement(name = "SearchCriteriaToken")
    private String searchCriteriaToken;

    @JsonProperty("RouteSearchToken")
    @XmlElement(name = "RouteSearchToken")
    private String routeSearchToken;

    @JsonProperty("VerifyPassengerList")
    @XmlElement(name = "VerifyPassengerInfo", namespace = "urn:com:ctrip:flight:intl:booking:bookingValidation:contract:commontype:v1")
    @XmlElementWrapper(name = "VerifyPassengerList")
    private List<VerifyPassengerInfoType> verifyPassengerList;

    @JsonProperty("FinalRequest")
    @XmlElement(name = "FinalRequest")
    private boolean finalRequest;

    @JsonProperty("Locale")
    @XmlElement(name = "Locale")
    private String locale;

    public RequestHeaderType getRequestHeader() {
        return this.requestHeader;
    }

    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * 是否同步,同步表示需要获取运价结果（需赋值FlightProduct，TokenNumber为空）,
     *                         异步会分成两步，第一步发送请求（需赋值FlightProduct，TokenNumber为空），
     *                         第二步获取运价结果(需赋值TokenNumber，FlightProduct为空)
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
     * 验证乘客集合
     */
    public List<VerifyPassengerInfoType> getVerifyPassengerList() {
        return this.verifyPassengerList;
    }

    public void setVerifyPassengerList(List<VerifyPassengerInfoType> verifyPassengerList) {
        this.verifyPassengerList = verifyPassengerList;
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

    /**
     * 目标语言
     */
    public String getLocale() {
        return this.locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        final BookingValidationRequestType other = (BookingValidationRequestType) obj;
        return Objects.equal(this.requestHeader, other.requestHeader) && Objects.equal(this.sync, other.sync) && Objects
            .equal(this.tokenNumber, other.tokenNumber) && Objects
            .equal(this.searchCriteriaToken, other.searchCriteriaToken) && Objects
            .equal(this.routeSearchToken, other.routeSearchToken) && Objects
            .equal(this.verifyPassengerList, other.verifyPassengerList) && Objects
            .equal(this.finalRequest, other.finalRequest) && Objects.equal(this.locale, other.locale);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.requestHeader);
        result = 31 * result + Objects.hashCode(this.sync);
        result = 31 * result + Objects.hashCode(this.tokenNumber);
        result = 31 * result + Objects.hashCode(this.searchCriteriaToken);
        result = 31 * result + Objects.hashCode(this.routeSearchToken);
        result = 31 * result + Objects.hashCode(this.verifyPassengerList);
        result = 31 * result + Objects.hashCode(this.finalRequest);
        result = 31 * result + Objects.hashCode(this.locale);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).add("requestHeader", requestHeader).add("sync", sync)
            .add("tokenNumber", tokenNumber).add("searchCriteriaToken", searchCriteriaToken)
            .add("routeSearchToken", routeSearchToken).add("verifyPassengerList", verifyPassengerList)
            .add("finalRequest", finalRequest).add("locale", locale).toString();
    }

}