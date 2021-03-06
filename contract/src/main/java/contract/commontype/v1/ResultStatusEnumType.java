// Generated by eBay Common SDK Platform
package contract.commontype.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * 返回结果状态
 */
@XmlType(name = "ResultStatusEnumType")
@XmlEnum
@SuppressWarnings("all")
public enum ResultStatusEnumType {

    /**
     * 成功
     */
    @XmlEnumValue("SUCCESS") SUCCESS(0, "SUCCESS"),

    /**
     * 失败
     */
    @XmlEnumValue("FAIL") FAIL(1, "FAIL"),

    /**
     * 拦截，原因：满舱，变价
     */
    @XmlEnumValue("INTERCEPTED") INTERCEPTED(2, "INTERCEPTED"),

    /**
     * 处理中
     */
    @XmlEnumValue("IN_PROCESS") IN_PROCESS(3, "IN_PROCESS"),

    /**
     * 特殊拦截，需要关注错误码
     */
    @XmlEnumValue("SPECIAL_INTERCEPTED") SPECIAL_INTERCEPTED(4, "SPECIAL_INTERCEPTED");

    private final int intValue;
    private final String value;

    ResultStatusEnumType(int intValue, String value) {
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
    public static ResultStatusEnumType fromValue(String v) {
        for (ResultStatusEnumType e : ResultStatusEnumType.values()) {
            if (e.value.equalsIgnoreCase(v)) {
                return e;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public static ResultStatusEnumType findByValue(int value) {
        switch (value) {
            case 0:
                return SUCCESS;
            case 1:
                return FAIL;
            case 2:
                return INTERCEPTED;
            case 3:
                return IN_PROCESS;
            case 4:
                return SPECIAL_INTERCEPTED;
            default:
                return null;
        }
    }
}