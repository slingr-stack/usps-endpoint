/////////////////////
// Public API
/////////////////////

endpoint.trackShipping = function (trackId, forDisplayFormat) {
    if (!trackId) {
        throw 'Track Id parameter is required';
    }
    var payload = {
        trackId: trackId,
        forDisplayFormat: forDisplayFormat
    };
    return endpoint._trackShipping(payload);
};