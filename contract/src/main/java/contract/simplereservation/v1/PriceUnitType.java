/**
 * Autogenerated by soa-sdk-toolkit
 * <p>
 * DO NOT EDIT DIRECTLY
 */
package contract.simplereservation.v1;

import contract.commontype.v1.TagType;
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
import javax.xml.bind.annotation.XmlType;

/**
 * PriceUnit信息
 */
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceUnitType", namespace = "urn:com:ctrip:flight:intl:booking:bookingValidation:contract:simplereservation:v1", propOrder = {
    "priceUnitIndex", "priceInfoList", "tagList"})
@SuppressWarnings("all")
public class PriceUnitType implements Serializable {

    private static final long serialVersionUID = 1L;

    public PriceUnitType(int priceUnitIndex, List<PriceInfoType> priceInfoList, List<TagType> tagList) {
        this.priceUnitIndex = priceUnitIndex;
        this.priceInfoList = priceInfoList;
        this.tagList = tagList;
    }

    public PriceUnitType() {
    }

    @JsonProperty("PriceUnitIndex")
    @XmlElement(name = "PriceUnitIndex")
    private int priceUnitIndex;

    @JsonProperty("PriceInfoList")
    @XmlElement(name = "RepricingPriceInfo")
    @XmlElementWrapper(name = "PriceInfoList")
    private List<PriceInfoType> priceInfoList;

    @JsonProperty("TagList")
    @XmlElement(name = "Tag", namespace = "urn:com:ctrip:flight:intl:booking:bookingValidation:contract:commontype:v1")
    @XmlElementWrapper(name = "TagList")
    private List<TagType> tagList;

    /**
     * PriceUnit索引，从0开始
     */
    public int getPriceUnitIndex() {
        return this.priceUnitIndex;
    }

    public void setPriceUnitIndex(int priceUnitIndex) {
        this.priceUnitIndex = priceUnitIndex;
    }

    /**
     * 价格信息列表
     */
    public List<PriceInfoType> getPriceInfoList() {
        return this.priceInfoList;
    }

    public void setPriceInfoList(List<PriceInfoType> priceInfoList) {
        this.priceInfoList = priceInfoList;
    }

    /**
     * PriceUnit 相关标签 多PU使用 例：BookingId/3UTax/ItineraryKey/EI/Baggages
     */
    public List<TagType> getTagList() {
        return this.tagList;
    }

    public void setTagList(List<TagType> tagList) {
        this.tagList = tagList;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        final PriceUnitType other = (PriceUnitType) obj;
        return Objects.equal(this.priceUnitIndex, other.priceUnitIndex) && Objects
            .equal(this.priceInfoList, other.priceInfoList) && Objects.equal(this.tagList, other.tagList);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.priceUnitIndex);
        result = 31 * result + Objects.hashCode(this.priceInfoList);
        result = 31 * result + Objects.hashCode(this.tagList);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).add("priceUnitIndex", priceUnitIndex)
            .add("priceInfoList", priceInfoList).add("tagList", tagList).toString();
    }

}