package io.slingr.endpoints.usps;

public class ShippingRequest {

    public static String buildRequest(String userId, String trackId) {
        String request = "";
        request += "/ShippingAPI.dll";
        request += "?API=TrackV2";
        request += "&XML=";
        request += "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>";
        request += "<TrackRequest USERID=\"" + userId + "\">";
        request += "    <TrackID ID=\"" + trackId + "\"></TrackID>";
        request += "</TrackRequest>";
        return request;
    }
}
