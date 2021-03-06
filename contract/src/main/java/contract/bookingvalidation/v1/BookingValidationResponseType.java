/**
 * Autogenerated by soa-sdk-toolkit
 * <p>
 * DO NOT EDIT DIRECTLY
 */
package contract.bookingvalidation.v1;

import contract.commontype.v1.ErrorResultType;
import contract.commontype.v1.ResponseHeaderType;
import contract.commontype.v1.ResultStatusEnumType;
import com.ctriposs.baiji.rpc.common.types.ResponseStatusType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

public class BookingValidationResponseType implements Serializable {

    private static final long serialVersionUID = 1L;

    public BookingValidationResponseType(ResponseStatusType responseStatus, ResponseHeaderType responseHeader,
        String tokenNumber, ResultStatusEnumType resultStatus, List<ValidationResultType> validationResultList,
        ErrorResultType errorResult) {
        this.responseStatus = responseStatus;
        this.responseHeader = responseHeader;
        this.tokenNumber = tokenNumber;
        this.resultStatus = resultStatus;
        this.validationResultList = validationResultList;
        this.errorResult = errorResult;
    }

    public BookingValidationResponseType() {
        this.resultStatus = ResultStatusEnumType.values()[0];
    }

    @JsonProperty("ResponseStatus")
    @XmlElement(name = "ResponseStatus")
    private ResponseStatusType responseStatus;

    @JsonProperty("ResponseHeader")
    @XmlElement(name = "ResponseHeader")
    private ResponseHeaderType responseHeader;

    @JsonProperty("TokenNumber")
    @XmlElement(name = "TokenNumber")
    private String tokenNumber;

    @JsonProperty("ResultStatus")
    @XmlElement(name = "ResultStatus")
    private ResultStatusEnumType resultStatus;

    @JsonProperty("ValidationResultList")
    @XmlElement(name = "ValidationResult")
    @XmlElementWrapper(name = "ValidationResultList")
    private List<ValidationResultType> validationResultList;

    @JsonProperty("ErrorResult")
    @XmlElement(name = "ErrorResult", nillable = true)
    private ErrorResultType errorResult;

    public ResponseStatusType getResponseStatus() {
        return this.responseStatus;
    }

    public void setResponseStatus(ResponseStatusType responseStatus) {
        this.responseStatus = responseStatus;
    }

    public ResponseHeaderType getResponseHeader() {
        return this.responseHeader;
    }

    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * 验舱验价Token，多PU的第一个
     */
    public String getTokenNumber() {
        return this.tokenNumber;
    }

    public void setTokenNumber(String tokenNumber) {
        this.tokenNumber = tokenNumber;
    }

    /**
     * 验舱验价状态 通过，拦截，处理中，通过且变价
     */
    public ResultStatusEnumType getResultStatus() {
        return this.resultStatus;
    }

    public void setResultStatus(ResultStatusEnumType resultStatus) {
        this.resultStatus = resultStatus;
    }

    public List<ValidationResultType> getValidationResultList() {
        return this.validationResultList;
    }

    public void setValidationResultList(List<ValidationResultType> validationResultList) {
        this.validationResultList = validationResultList;
    }

    /**
     * 错误信息，AGG查询无结果，请求参数验证失败，多票拆分之前产生错误时赋值
     */
    public ErrorResultType getErrorResult() {
        return this.errorResult;
    }

    public void setErrorResult(ErrorResultType errorResult) {
        this.errorResult = errorResult;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        final BookingValidationResponseType other = (BookingValidationResponseType) obj;
        return Objects.equal(this.responseStatus, other.responseStatus) && Objects
            .equal(this.responseHeader, other.responseHeader) && Objects.equal(this.tokenNumber, other.tokenNumber)
            && Objects.equal(this.resultStatus, other.resultStatus) && Objects
            .equal(this.validationResultList, other.validationResultList) && Objects
            .equal(this.errorResult, other.errorResult);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.responseStatus);
        result = 31 * result + Objects.hashCode(this.responseHeader);
        result = 31 * result + Objects.hashCode(this.tokenNumber);
        result = 31 * result + Objects.hashCode(this.resultStatus);
        result = 31 * result + Objects.hashCode(this.validationResultList);
        result = 31 * result + Objects.hashCode(this.errorResult);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).add("responseStatus", responseStatus)
            .add("responseHeader", responseHeader).add("tokenNumber", tokenNumber).add("resultStatus", resultStatus)
            .add("validationResultList", validationResultList).add("errorResult", errorResult).toString();
    }

}