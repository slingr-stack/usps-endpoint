package io.slingr.endpoints.usps;

import io.slingr.endpoints.HttpEndpoint;
import io.slingr.endpoints.framework.annotations.EndpointFunction;
import io.slingr.endpoints.framework.annotations.EndpointProperty;
import io.slingr.endpoints.framework.annotations.SlingrEndpoint;
import io.slingr.endpoints.utils.Json;
import io.slingr.endpoints.ws.exchange.FunctionRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>
 * <p>
 * <p>Created by hpacini on 03/07/19.
 */
@SlingrEndpoint(name = "usps", functionPrefix = "_")
public class USPS extends HttpEndpoint {

    private Logger logger = LoggerFactory.getLogger(USPS.class);

    @EndpointProperty
    private String username;

    @EndpointProperty
    private String password;

    @EndpointProperty
    private String apiUrl;

    @Override
    public String getApiUri() {
        return apiUrl;
    }

    public void endpointStarted() {
    }


    @EndpointFunction(name = "_track")
    public Json track(FunctionRequest request) {

        logger.info(String.format("User: [%s] and password: [%s]", username, password));

        logger.info(request.toString());

        String url = "/ShippingAPITest.dll?API=Verify";
        url += "&XML=<AddressValidateRequest USERID=\"" + username + "\"><Address ID=\"0\"><Address1></Address1>";
        url += "<Address2>6406 Ivy Lane</Address2><City>Greenbelt</City><State>MD</State>";
        url += "<Zip5></Zip5><Zip4></Zip4></Address></AddressValidateRequest>";

        logger.info(url);

        request.getJsonParams().set("path", url);

        Json res = defaultGetRequest(request);

        /**
         * In ui-builder console
         * var res = app.endpoints.usps._track();
         * log(JSON.string(res));
         */

        return res;

    }

}
