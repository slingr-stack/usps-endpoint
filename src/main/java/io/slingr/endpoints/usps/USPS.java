package io.slingr.endpoints.usps;

import io.slingr.endpoints.Endpoint;
import io.slingr.endpoints.framework.annotations.EndpointFunction;
import io.slingr.endpoints.framework.annotations.SlingrEndpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>
 * <p>
 * <p>Created by hpacini on 03/07/19.
 */
@SlingrEndpoint(name = "usps", functionPrefix = "_")
public class USPS extends Endpoint {

    private Logger logger = LoggerFactory.getLogger(USPS.class);


    public void endpointStarted() {
    }


    @EndpointFunction(name = "_track")
    public void track() {



        logger.info("Should track");
    }

}
