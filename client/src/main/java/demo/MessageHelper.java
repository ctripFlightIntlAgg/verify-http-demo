package demo;

import contract.bookingvalidation.v1.BookingValidationRequestType;
import contract.commontype.v1.ContactInfo;
import contract.commontype.v1.GenderEnum;
import contract.commontype.v1.IDCardInfoType;
import contract.commontype.v1.PriceDetailType;
import contract.commontype.v1.RequestHeaderType;
import contract.commontype.v1.ReservationPassengerInfoType;
import contract.commontype.v1.TagType;
import contract.commontype.v1.TravelerCategoryCodeEnum;
import contract.commontype.v1.VerifyPassengerInfoType;
import contract.simplereservation.v1.PriceUnitType;
import contract.simplereservation.v1.SimpleReservationRequestType;
import java.util.Arrays;

/**
 * @author jiajie.zhang
 * @date 2020/2/124 18:28
 */

public class MessageHelper {

    public static BookingValidationRequestType buildBookingValidationRequest(boolean isSync) {
        BookingValidationRequestType requestType = new BookingValidationRequestType();

        requestType.setRequestHeader(buildBookingValidationRequestHeader());
        // Passenger information
        requestType.setVerifyPassengerList(Arrays.asList(new VerifyPassengerInfoType() {{
            setTravelerCategoryCode(TravelerCategoryCodeEnum.ADT);
            setPassengerCount(1);
        }}));
        // Must pass for the first time asynchronously, no need to pass the result
        requestType
            .setRouteSearchToken("800000000iI3G04q00RraH003R00Coo928000000001D000000000G00C3V0510G001fQwHO1ATe08000NNKMHOC");
        // Must pass for the first time asynchronously, no need to pass the result
        requestType.setSearchCriteriaToken(
            "KLUv_QBQwQIACwgBEJaqARiMqAQggMCT_4UuDAsIAhCMqAQYlqoBIICwxtGGLgwTCAEQARgBFBgBIAIoCzAzQygAMAA4AEAASABQAIABAJABAKgBALgBAERIAFAAYIvpBQ==");
        // flag of synchronize (Sync is set to true)
        requestType.setSync(isSync);
        requestType.setFinalRequest(false);

        return requestType;
    }

    private static RequestHeaderType buildBookingValidationRequestHeader() {
        RequestHeaderType requestHeader = new RequestHeaderType();
        requestHeader.setSourceAppID("100017733");
        // Used to identify the transaction number, recommend to use UUID to generate, not more than 50 characters
        requestHeader.setTransactionID("ccb97a0366ed63620b8788eec4fc78f0");
        requestHeader.setChannelID("EnglishSite");
        requestHeader.setSubChannelID(51);
        requestHeader.setCustomerID("D3936268004");
        requestHeader.setLoggingLevel(0);
        requestHeader.setClientIP("211.202.112.3");
        requestHeader.setDiagInput("XInsurance=true;scene=IBU_AvailValid;");
        requestHeader.setLoggingLevel(0);

        return requestHeader;
    }


    public static SimpleReservationRequestType buildSimpleReservationRequest(boolean isSync) {
        SimpleReservationRequestType requestType = new SimpleReservationRequestType();

        requestType.setRequestHeader(buildSimpleReservationRequestHeader());
        // Must pass for the first time asynchronously, no need to pass the result
        requestType
            .setRouteSearchToken("8000000008H3004B05Opo18000000000200000000001001hq510G00128HgG00dMm8000GV9F825");
        // Must pass for the first time asynchronously, no need to pass the result
        requestType.setSearchCriteriaToken(
            "KLUv_QBQaQIACwgBEJMkGNTsAyCAoJC3jC4MEwgBEAEYARQYAyABKAswAUMoADAAOABAAEgAUACAAQCQAQCoAQC4AQDLAQgAzAHSAQEyREgAUABg0kY");
        // flag of synchronize (Sync is set to true)
        requestType.setSync(isSync);
        requestType.setOrderID(31296740312L);
        requestType.setFinalRequest(false);

        requestType.setPassengerList(Arrays.asList(getReservationPassengerInfoType()));
        requestType.setContactInfo(getContactInfo());
        requestType.setReservationSource(0);
        requestType.setPriceUnitList(Arrays.asList(getPriceUnit()));

        return requestType;
    }

    private static ReservationPassengerInfoType getReservationPassengerInfoType() {
        ReservationPassengerInfoType passengerInfo = new ReservationPassengerInfoType();
        passengerInfo.setPassengerId(1);
        passengerInfo.setTravelerCategoryCode(TravelerCategoryCodeEnum.ADT);
        passengerInfo.setBirthDay("2013-01-01");
        passengerInfo.setGender(GenderEnum.Male);
        passengerInfo.setNationalityCode("US");
        passengerInfo.setIdCardList(Arrays.asList(getIDCardInfoType()));

        return passengerInfo;
    }

    private static IDCardInfoType getIDCardInfoType() {
        IDCardInfoType idCardInfoType = new IDCardInfoType();
        idCardInfoType.setPriceUnitIndex(0);
        idCardInfoType.setPassengerCardId(0);
        idCardInfoType.setSurName("TAO");
        idCardInfoType.setGivenName("ZHE");
        idCardInfoType.setIdCardType("PASSPORT");
        idCardInfoType.setIdCardNo("1365963");
        idCardInfoType.setCardTimeLimit("2021-04-14");
        idCardInfoType.setIssuingCountry("US");

        return idCardInfoType;
    }

    private static ContactInfo getContactInfo() {
        ContactInfo contactInfo = new ContactInfo();
        contactInfo.setContactName("ZHAO ERTONG");
        contactInfo.setMobilePhone("18900006688");
        contactInfo.setContactEmail("lnqiao@ctrip.com");
        contactInfo.setMobilePhoneCountryCode("86");

        return contactInfo;
    }

    private static PriceUnitType getPriceUnit() {
        PriceUnitType priceUnitType = new PriceUnitType();
        priceUnitType.setPriceUnitIndex(0);
        priceUnitType.setPriceInfoList(Arrays.asList(new contract.simplereservation.v1.PriceInfoType() {{
            setTravelerCategoryCode(TravelerCategoryCodeEnum.ADT);
            setPaidPriceDetail(new PriceDetailType() {{
                setCurrency("CNY");
                setSalePrice(276);
                setTax(403);
                setPublishPrice(300);
                setAccountPrice(273);
                setNetPrice(272.29);
            }});
            setOriginalPriceDetail(new PriceDetailType() {{
                setCurrency("CNY");
                setSalePrice(276);
                setTax(403);
                setPublishPrice(300);
                setAccountPrice(273);
                setNetPrice(272.29);
            }});
            setTagList(Arrays.asList(new TagType() {{
                setKey("CommitionSource");
                setValue("1");
            }}, new TagType() {{
                setKey("qteCommand");
                setValue("ADT*01LOWD/HO/PUBL");
            }}));
            setQteCommand("ADT*01LOWD/HO/PUBL");

        }}));
        priceUnitType.setTagList(Arrays.asList(new TagType() {{
            setKey("SessionId");
            setValue("9874e24d-a7eb-4d01-9ddb-0bcda5fea0e2");
        }}, new TagType() {{
            setKey("CorpAgencyID");
            setValue("2873");
        }}, new TagType() {{
            setKey("CorpAgencyCode");
            setValue("QHEB");
        }}));

        return priceUnitType;
    }

    private static RequestHeaderType buildSimpleReservationRequestHeader() {
        RequestHeaderType requestHeader = new RequestHeaderType();
        requestHeader.setSourceAppID("100015380");
        // Used to identify the transaction number, recommend to use UUID to generate,
        requestHeader.setTransactionID("9874e24d-a7eb-4d01-9ddb-0bcda5fea0e2");
        requestHeader.setChannelID("EnglishSite");
        requestHeader.setSubChannelID(1);
        requestHeader.setCustomerID("M02742729");
        requestHeader.setClientIP("10.2.240.246");
        requestHeader.setDiagInput("XInsurance=true;scene=IBU_AvailValid;");
        requestHeader.setLoggingLevel(0);

        return requestHeader;
    }

}
