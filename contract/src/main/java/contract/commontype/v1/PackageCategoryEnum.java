// Generated by eBay Common SDK Platform
package contract.commontype.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * 套餐类型
 * None：无
 * Exclusive：网络专享
 * Cloud: 特惠推荐
 * Prioritizing：商务优选
 * LowestPrice : 廉价航司
 * FlagShipStore : 国航旗舰
 */
@XmlType(name = "PackageCategoryEnum")
@XmlEnum
@SuppressWarnings("all")
public enum PackageCategoryEnum {

    @XmlEnumValue("None") None(0, "None"),

    @XmlEnumValue("Exclusive") Exclusive(1, "Exclusive"),

    @XmlEnumValue("Prioritizing") Prioritizing(2, "Prioritizing"),

    @XmlEnumValue("LowestPrice") LowestPrice(3, "LowestPrice"),

    @XmlEnumValue("FlagShipStore") FlagShipStore(4, "FlagShipStore"),

    @XmlEnumValue("CombinedProduct") CombinedProduct(5, "CombinedProduct"),

    @XmlEnumValue("Cloud") Cloud(6, "Cloud");

    private final int intValue;
    private final String value;

    PackageCategoryEnum(int intValue, String value) {
        this.intValue = intValue;
        this.value = value;
    }

    public int getValue() {
        return intValue;
    }

    @JsonValue
    public String value() {
        return value;
    }

    @JsonCreator
    public static PackageCategoryEnum fromValue(String v) {
        for (PackageCategoryEnum e : PackageCategoryEnum.values()) {
            if (e.value.equalsIgnoreCase(v)) {
                return e;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public static PackageCategoryEnum findByValue(int value) {
        switch (value) {
            case 0:
                return None;
            case 1:
                return Exclusive;
            case 2:
                return Prioritizing;
            case 3:
                return LowestPrice;
            case 4:
                return FlagShipStore;
            case 5:
                return CombinedProduct;
            case 6:
                return Cloud;
            default:
                return null;
        }
    }
}