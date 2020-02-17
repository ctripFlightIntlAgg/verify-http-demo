package demo.client;

import com.alibaba.fastjson.JSONObject;
import contract.bookingvalidation.v1.BookingValidationRequestType;
import contract.bookingvalidation.v1.BookingValidationResponseType;
import contract.simplereservation.v1.SimpleReservationRequestType;
import contract.simplereservation.v1.SimpleReservationResponseType;
import demo.MessageHelper;
import java.net.URL;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.client.RestTemplate;
import token.app.AppTokenManager;
import token.app.CerberusApp;

/**
 * @author jiajie.zhang
 * @Description：verifyHttpAsyncDemo
 * @create 2020/2/14 11:18
 **/

@Slf4j
public class VerifyHttpAsyncDemo {

    private static RestTemplate restTemplate = new RestTemplate();

    /**
     * the url description in Readme
     */
    private static final String BASE_URL = "http://apiproxy.ctrip.com/apiproxy/soa2/17439";

    private static AppTokenManager appTokenManager;
    private static CerberusApp app;

    public static void main(String[] args) throws Exception {
        // gateway validation in prod
        initForProd();

        // bookingValidation
        // 1、get url by Cerberus
        String testUrl1 = BASE_URL + "/bookingValidation";
        URL url1 = new URL(testUrl1);
        String completeURI1 = app.updateRequestUri(url1.getPath());
        URL completeURL1 = new URL(url1.getProtocol(), url1.getHost(), completeURI1);
        System.out.println("completeURL1:" + completeURL1);
        // 2、generate request
        BookingValidationRequestType bookingValidationRequestAsync = MessageHelper.buildBookingValidationRequest(false);
        // 3、Get the tokenNumber on the first asynchronous request
        BookingValidationResponseType bookingValidationResponseAsync = getResponse(testUrl1,
            bookingValidationRequestAsync,
            BookingValidationResponseType.class);
        Optional.ofNullable(bookingValidationResponseAsync).ifPresent(response -> {
            // 4、obtain the bookingValidation result based on the obtained tokenNumber
            bookingValidationRequestAsync.setTokenNumber(response.getTokenNumber());
            BookingValidationResponseType finalResponse = getResponse(testUrl1, bookingValidationRequestAsync,
                BookingValidationResponseType.class);
            System.out.println(finalResponse);
            // process finalResponse
        });



        // simpleReservation
        // 1、get url by Cerberus
        String testUrl2 = BASE_URL + "/simpleReservation";
        URL url2 = new URL(testUrl2);
        String completeURI2 = app.updateRequestUri(url2.getPath());
        URL completeURL2 = new URL(url2.getProtocol(), url2.getHost(), completeURI2);
        System.out.println("completeURL2:" + completeURL2);
        // 2、generate request
        SimpleReservationRequestType reservationRequestTypeAsync = MessageHelper.buildSimpleReservationRequest(false);
        // 3、Get the tokenNumber on the first asynchronous request
        SimpleReservationResponseType simpleReservationResponseAsync =
            getResponse(testUrl2, reservationRequestTypeAsync, SimpleReservationResponseType.class);
        Optional.ofNullable(simpleReservationResponseAsync).ifPresent(response -> {
            // 4、obtain the bookingValidation result based on the obtained tokenNumber
            reservationRequestTypeAsync.setTokenNumber(simpleReservationResponseAsync.getTokenNumber());
            SimpleReservationResponseType finalResponse = getResponse(testUrl2, reservationRequestTypeAsync,
                SimpleReservationResponseType.class);
            System.out.println(finalResponse);
            // process finalResponse
        });

    }

    private static <I, O> O getResponse(String url, I request, Class<O> responseClass) {
        O response;
        try {
            String responseResult = restTemplate.postForObject(url, JSONObject.toJSONString(request), String.class);
            response = JSONObject.parseObject(responseResult, responseClass);
        } catch (Exception ex) {
            log.error("VerifyHttpClient", ex);
            response = null;
        }

        return response;
    }

    /**
     * appId:301
     * appKey:3dd25f8ef8429ffe
     * appSacret:526fbde088cc285a957f8c2b26f4ca404a93a3fb29e0dc9f6189de8f87e63151
     */
    private static void initForProd() {
        try {
            appTokenManager = new AppTokenManager();
            app = new CerberusApp(301L, "3dd25f8ef8429ffe",
                "526fbde088cc285a957f8c2b26f4ca404a93a3fb29e0dc9f6189de8f87e63151");
            appTokenManager.addApp(app);
            appTokenManager.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
