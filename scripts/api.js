/////////////////////
// Public API
/////////////////////

endpoint.trackShipping = function (trackId) {
    if (!trackId) {
        throw 'Track Id parameter is required';
    }
    var payload = {
        trackId: trackId
    };
    return endpoint._trackShipping(payload);
};