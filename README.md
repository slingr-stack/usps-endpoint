---
title: US Postal Service (USPS) endpoint
keywords: 
last_updated: July 10, 2019
tags: []
summary: "Detailed description of the API of the U.S. Postal Service (USPS) endpoint."
---

## Overview

This endpoint allows access to the information provided by [USPS](https://www.usps.com/business/web-tools-apis/documentation-updates.htm) through its Tracking & Delivery Information APIs. 

Through this endpoint you are able access to the tracking of a specific package.

Please make sure you take a look at the documentation from USPS as features are based on its API.

## Configuration

Before configuring the endpoint you will need to sign-up in their [website](https://reg.usps.com/entreg/RegistrationAction_input). 
Then you will be receiving an email with the credentials to be used in the endpoint configuration.  

### User Name 

This is the user name given by USPS.

### User Password 

This is the password given by USPS.

## Javascript API

The Javascript API of the endpoint is based on the [USPS](https://www.usps.com/business/web-tools-apis/documentation-updates.htm) API,
so you should see their documentation for details on parameters and data formats. If there are differences
they will be explained here.

### Tracking

For now, API only allows to work with functions related to the tracking of packages.


#### Track a specific package

Track the shipment `EJ123456780US`.

Samples:

```js
var tracking = app.endpoints.usps.trackShipping('EJ123456780US');
```

If you want data returned by the Track/Confirm Web Tool to be for display only then you need to set a second parameter 
as `true`.  The content or sequence of the string data returned by the Web Tool may change. Consequently, if you desire 
to apply any kind of logic against the tracking data, then you will need to use the first example.

```js
var tracking = app.endpoints.usps.trackShipping('EJ123456780US', true);
```

## About SLINGR

SLINGR is a low-code rapid application development platform that accelerates development, with robust architecture for integrations and executing custom workflows and automation.

[More info about SLINGR](https://slingr.io)

## License

This endpoint is licensed under the Apache License 2.0. See the `LICENSE` file for more details.




