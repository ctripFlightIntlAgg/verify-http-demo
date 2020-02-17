// Generated by eBay Common SDK Platform
package contract.commontype.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * 性别
 */
@XmlType(name = "GenderEnum")
@XmlEnum
@SuppressWarnings("all")
public enum GenderEnum {

    @XmlEnumValue("Male") Male(0, "Male"),

    @XmlEnumValue("Female") Female(1, "Female");

    private final int intValue;
    private final String value;

    GenderEnum(int intValue, String value) {
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
    public static GenderEnum fromValue(String v) {
        for (GenderEnum e : GenderEnum.values()) {
            if (e.value.equalsIgnoreCase(v)) {
                return e;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public static GenderEnum findByValue(int value) {
        switch (value) {
            case 0:
                return Male;
            case 1:
                return Female;
            default:
                return null;
        }
    }
}