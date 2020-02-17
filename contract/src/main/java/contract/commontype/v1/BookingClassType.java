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

@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingClassType", namespace = "urn:com:ctrip:flight:intl:booking:bookingValidation:contract:commontype:v1", propOrder = {
    "seatClass", "cabinClass", "seatCount", "seatSource", "bookingToken", "storeID"})
@SuppressWarnings("all")
public class BookingClassType implements Serializable {

    private static final long serialVersionUID = 1L;

    public BookingClassType(String seatClass, String cabinClass, int seatCount, int seatSource, String bookingToken,
        long storeID) {
        this.seatClass = seatClass;
        this.cabinClass = cabinClass;
        this.seatCount = seatCount;
        this.seatSource = seatSource;
        this.bookingToken = bookingToken;
        this.storeID = storeID;
    }

    public BookingClassType() {
    }

    @JsonProperty("SeatClass")
    @XmlElement(name = "SeatClass")
    private String seatClass;

    @JsonProperty("CabinClass")
    @XmlElement(name = "CabinClass")
    private String cabinClass;

    @JsonProperty("SeatCount")
    @XmlElement(name = "SeatCount")
    private int seatCount;

    @JsonProperty("SeatSource")
    @XmlElement(name = "SeatSource")
    private int seatSource;

    @JsonProperty("BookingToken")
    @XmlElement(name = "BookingToken")
    private String bookingToken;

    @JsonProperty("StoreID")
    @XmlElement(name = "StoreID")
    private long storeID;

    public String getSeatClass() {
        return this.seatClass;
    }

    public void setSeatClass(String seatClass) {
        this.seatClass = seatClass;
    }

    /**
     * 舱等，传值请使用枚举CabinClassEnumType.name()
     */
    public String getCabinClass() {
        return this.cabinClass;
    }

    public void setCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;
    }

    public int getSeatCount() {
        return this.seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    /**
     * 来源，列表查询不输出
     */
    public int getSeatSource() {
        return this.seatSource;
    }

    public void setSeatSource(int seatSource) {
        this.seatSource = seatSource;
    }

    /**
     * 舱位预订额外标识，附加舱等信息，QTE，订位使用[春秋专用，对应其AgreementID]，列表查询不输出
     */
    public String getBookingToken() {
        return this.bookingToken;
    }

    public void setBookingToken(String bookingToken) {
        this.bookingToken = bookingToken;
    }

    /**
     * 库存ID
     */
    public long getStoreID() {
        return this.storeID;
    }

    public void setStoreID(long storeID) {
        this.storeID = storeID;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        final BookingClassType other = (BookingClassType) obj;
        return Objects.equal(this.seatClass, other.seatClass) && Objects.equal(this.cabinClass, other.cabinClass)
            && Objects.equal(this.seatCount, other.seatCount) && Objects.equal(this.seatSource, other.seatSource)
            && Objects.equal(this.bookingToken, other.bookingToken) && Objects.equal(this.storeID, other.storeID);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.seatClass);
        result = 31 * result + Objects.hashCode(this.cabinClass);
        result = 31 * result + Objects.hashCode(this.seatCount);
        result = 31 * result + Objects.hashCode(this.seatSource);
        result = 31 * result + Objects.hashCode(this.bookingToken);
        result = 31 * result + Objects.hashCode(this.storeID);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).add("seatClass", seatClass).add("cabinClass", cabinClass)
            .add("seatCount", seatCount).add("seatSource", seatSource).add("bookingToken", bookingToken)
            .add("storeID", storeID).toString();
    }

}