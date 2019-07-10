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
public class UspsEndpoint extends HttpEndpoint {

    private Logger logger = LoggerFactory.getLogger(UspsEndpoint.class);

    @EndpointProperty
    private String username;

    @EndpointProperty
    private String password;

    public void endpointStarted() {
        // nothing here
    }

    @Override
    public String getApiUri() {
        return "http://production.shippingapis.com";
    }


    @EndpointFunction(name = "")
    public Json trackShipping(FunctionRequest request) {
        Json params = request.getJsonParams();
        logger.info(String.format("Tracking package [%s]", params.string("trackId")));

        Json shippingRequest = Json.map();
        shippingRequest.set("path", ShippingRequest.buildRequest(username, params.string("trackId")));
        return httpService().defaultGetRequest(shippingRequest);
    }

}
