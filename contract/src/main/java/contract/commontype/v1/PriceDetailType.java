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
 * 基础价格
 */
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceDetailType", namespace = "urn:com:ctrip:flight:intl:booking:bookingValidation:contract:commontype:v1", propOrder = {
    "currency", "salePrice", "tax", "publishPrice", "accountPrice", "netPrice"})
@SuppressWarnings("all")
public class PriceDetailType implements Serializable {

    private static final long serialVersionUID = 1L;

    public PriceDetailType(String currency, double salePrice, double tax, double publishPrice, double accountPrice,
        double netPrice) {
        this.currency = currency;
        this.salePrice = salePrice;
        this.tax = tax;
        this.publishPrice = publishPrice;
        this.accountPrice = accountPrice;
        this.netPrice = netPrice;
    }

    public PriceDetailType() {
    }

    @JsonProperty("Currency")
    @XmlElement(name = "Currency")
    private String currency;

    @JsonProperty("SalePrice")
    @XmlElement(name = "SalePrice")
    private double salePrice;

    @JsonProperty("Tax")
    @XmlElement(name = "Tax")
    private double tax;

    @JsonProperty("PublishPrice")
    @XmlElement(name = "PublishPrice")
    private double publishPrice;

    @JsonProperty("AccountPrice")
    @XmlElement(name = "AccountPrice")
    private double accountPrice;

    @JsonProperty("NetPrice")
    @XmlElement(name = "NetPrice")
    private double netPrice;

    /**
     * *币种
     */
    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * *携程卖价
     */
    public double getSalePrice() {
        return this.salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * *税费
     */
    public double getTax() {
        return this.tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    /**
     * *航空公司卖价(含附加费)，列表查询不输出
     */
    public double getPublishPrice() {
        return this.publishPrice;
    }

    public void setPublishPrice(double publishPrice) {
        this.publishPrice = publishPrice;
    }

    /**
     * *航空公司结算价，列表查询不输出
     */
    public double getAccountPrice() {
        return this.accountPrice;
    }

    public void setAccountPrice(double accountPrice) {
        this.accountPrice = accountPrice;
    }

    /**
     * 中间变量低价（包含后返），列表查询不输出
     */
    public double getNetPrice() {
        return this.netPrice;
    }

    public void setNetPrice(double netPrice) {
        this.netPrice = netPrice;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        final PriceDetailType other = (PriceDetailType) obj;
        return Objects.equal(this.currency, other.currency) && Objects.equal(this.salePrice, other.salePrice) && Objects
            .equal(this.tax, other.tax) && Objects.equal(this.publishPrice, other.publishPrice) && Objects
            .equal(this.accountPrice, other.accountPrice) && Objects.equal(this.netPrice, other.netPrice);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.currency);
        result = 31 * result + Objects.hashCode(this.salePrice);
        result = 31 * result + Objects.hashCode(this.tax);
        result = 31 * result + Objects.hashCode(this.publishPrice);
        result = 31 * result + Objects.hashCode(this.accountPrice);
        result = 31 * result + Objects.hashCode(this.netPrice);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).add("currency", currency).add("salePrice", salePrice).add("tax", tax)
            .add("publishPrice", publishPrice).add("accountPrice", accountPrice).add("netPrice", netPrice).toString();
    }

}