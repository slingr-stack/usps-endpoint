package io.slingr.endpoints.usps;

public class ShippingRequest {

    public static String buildTrackRequest(String userId, String trackId) {
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

    public static String buildTrackFieldRequest(String userId, String trackId) {
        String request = "";
        request += "/ShippingAPI.dll";
        request += "?API=TrackV2";
        request += "&XML=";
        request += "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>";
        request += "<TrackFieldRequest USERID=\"" + userId + "\">";
        request += "    <Revision>1</Revision>";
        request += "    <ClientIp>127.0.0.1</ClientIp>";
        request += "    <SourceId>Slingr</SourceId>";
        request += "    <TrackID ID=\"" + trackId + "\"/>";
        request += "</TrackFieldRequest>";
        return request;
    }
}
