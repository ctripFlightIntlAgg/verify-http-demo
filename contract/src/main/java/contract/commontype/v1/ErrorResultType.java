/**
 * Autogenerated by soa-sdk-toolkit
 * <p>
 * DO NOT EDIT DIRECTLY
 */
package contract.commontype.v1;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 错误信息
 */
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorResultType", namespace = "urn:com:ctrip:flight:intl:booking:bookingValidation:contract:commontype:v1", propOrder = {
    "errorCode", "errorMessage"})
@SuppressWarnings("all")
public class ErrorResultType implements Serializable {

    private static final long serialVersionUID = 1L;

    public ErrorResultType(int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public ErrorResultType() {
    }

    @JsonProperty("ErrorCode")
    @XmlElement(name = "ErrorCode")
    private int errorCode;

    @JsonProperty("ErrorMessage")
    @XmlElement(name = "ErrorMessage")
    private String errorMessage;

    /**
     * 整型错误码有助于客户端编写错误处理代码
     */
    public int getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * 描述字串有助于理解错误内容，也用于把错误信息传递给最终用户
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        final ErrorResultType other = (ErrorResultType) obj;
        return Objects.equal(this.errorCode, other.errorCode) && Objects.equal(this.errorMessage, other.errorMessage);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.errorCode);
        result = 31 * result + Objects.hashCode(this.errorMessage);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).add("errorCode", errorCode).add("errorMessage", errorMessage)
            .toString();
    }

}