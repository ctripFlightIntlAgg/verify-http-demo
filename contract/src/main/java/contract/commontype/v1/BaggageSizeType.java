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
 * 行李额尺寸信息
 */
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageSizeType", namespace = "urn:com:ctrip:flight:intl:booking:bookingValidation:contract:commontype:v1", propOrder = {
    "size", "sizeLimitType"})
@SuppressWarnings("all")
public class BaggageSizeType implements Serializable {

    private static final long serialVersionUID = 1L;

    public BaggageSizeType(String size, int sizeLimitType) {
        this.size = size;
        this.sizeLimitType = sizeLimitType;
    }

    public BaggageSizeType() {
    }

    @JsonProperty("Size")
    @XmlElement(name = "Size")
    private String size;

    @JsonProperty("SizeLimitType")
    @XmlElement(name = "SizeLimitType")
    private int sizeLimitType;

    /**
     * 尺寸大小，格式：180CM 或者 10*12*14CM
     */
    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    /**
     * 行李额尺寸种类 (1:长+宽+高之和，2是长*宽*高)
     */
    public int getSizeLimitType() {
        return this.sizeLimitType;
    }

    public void setSizeLimitType(int sizeLimitType) {
        this.sizeLimitType = sizeLimitType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        final BaggageSizeType other = (BaggageSizeType) obj;
        return Objects.equal(this.size, other.size) && Objects.equal(this.sizeLimitType, other.sizeLimitType);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.size);
        result = 31 * result + Objects.hashCode(this.sizeLimitType);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).add("size", size).add("sizeLimitType", sizeLimitType).toString();
    }

}