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
 * 常旅客信息
 */
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FFPNoInfoType", namespace = "urn:com:ctrip:flight:intl:booking:bookingValidation:contract:commontype:v1", propOrder = {
    "memberID", "carrier"})
@SuppressWarnings("all")
public class FFPNoInfoType implements Serializable {

    private static final long serialVersionUID = 1L;

    public FFPNoInfoType(String memberID, String carrier) {
        this.memberID = memberID;
        this.carrier = carrier;
    }

    public FFPNoInfoType() {
    }

    @JsonProperty("MemberID")
    @XmlElement(name = "MemberID")
    private String memberID;

    @JsonProperty("Carrier")
    @XmlElement(name = "Carrier")
    private String carrier;

    /**
     * 常旅客会员号/航空公司代码
     */
    public String getMemberID() {
        return this.memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    /**
     * 常旅客航空公司代码
     */
    public String getCarrier() {
        return this.carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        final FFPNoInfoType other = (FFPNoInfoType) obj;
        return Objects.equal(this.memberID, other.memberID) && Objects.equal(this.carrier, other.carrier);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.memberID);
        result = 31 * result + Objects.hashCode(this.carrier);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).add("memberID", memberID).add("carrier", carrier).toString();
    }

}