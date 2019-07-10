/////////////////////
// Public API
/////////////////////

endpoint.trackShipping = function (trackId) {
    if (!trackId) {
        throw 'Track Id parameter is required';
    }
    return endpoint._trackShipping(trackId);
};