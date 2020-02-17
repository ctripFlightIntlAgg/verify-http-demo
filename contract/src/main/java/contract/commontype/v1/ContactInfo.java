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
 * 联系人信息
 */
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInfo", namespace = "urn:com:ctrip:flight:intl:booking:bookingValidation:contract:commontype:v1", propOrder = {
    "contactName", "mobilePhone", "contactEmail", "mobilePhoneCountryCode"})
@SuppressWarnings("all")
public class ContactInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    public ContactInfo(String contactName, String mobilePhone, String contactEmail, String mobilePhoneCountryCode) {
        this.contactName = contactName;
        this.mobilePhone = mobilePhone;
        this.contactEmail = contactEmail;
        this.mobilePhoneCountryCode = mobilePhoneCountryCode;
    }

    public ContactInfo() {
    }

    @JsonProperty("ContactName")
    @XmlElement(name = "ContactName")
    private String contactName;

    @JsonProperty("MobilePhone")
    @XmlElement(name = "MobilePhone")
    private String mobilePhone;

    @JsonProperty("ContactEmail")
    @XmlElement(name = "ContactEmail")
    private String contactEmail;

    @JsonProperty("MobilePhoneCountryCode")
    @XmlElement(name = "MobilePhoneCountryCode")
    private String mobilePhoneCountryCode;

    /**
     * 联系人姓名
     */
    public String getContactName() {
        return this.contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     * 手机号码
     */
    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * 电子邮箱
     */
    public String getContactEmail() {
        return this.contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    /**
     * 联系人手机国家码
     */
    public String getMobilePhoneCountryCode() {
        return this.mobilePhoneCountryCode;
    }

    public void setMobilePhoneCountryCode(String mobilePhoneCountryCode) {
        this.mobilePhoneCountryCode = mobilePhoneCountryCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        final ContactInfo other = (ContactInfo) obj;
        return Objects.equal(this.contactName, other.contactName) && Objects.equal(this.mobilePhone, other.mobilePhone)
            && Objects.equal(this.contactEmail, other.contactEmail) && Objects
            .equal(this.mobilePhoneCountryCode, other.mobilePhoneCountryCode);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.contactName);
        result = 31 * result + Objects.hashCode(this.mobilePhone);
        result = 31 * result + Objects.hashCode(this.contactEmail);
        result = 31 * result + Objects.hashCode(this.mobilePhoneCountryCode);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).add("contactName", contactName).add("mobilePhone", mobilePhone)
            .add("contactEmail", contactEmail).add("mobilePhoneCountryCode", mobilePhoneCountryCode).toString();
    }

}
