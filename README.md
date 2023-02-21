# Product Customer Library

This library contains transversal code for ProductCustomerApp.


## Custom Exceptions
Right now, the library contains the following customs exceptions:

`NoDataException`: This exception works when you need to return a `No Content (204)` status.

`InsufficientPermissionsException`: This exception works when the user doesn't have permissions to make a request in specific service. `Unauthorized 401`

`InvalidRequestException`: This exception works when the client have an error in request `Bad Request (400)`.

`FeignClientException`: This exception works when failed the communication with another microservice `Gateway Error (504)`.

`TechnicalException`: This exception works when you need to return a `Internal Server Error (500)` exception.

## ExceptionHandlerConfiguration

This class 'intercept' all `CustomException` classes and build an ErrorDetails class that will be returned in service response.

## Custom Response

Also, this library contains and standard response for all microservices.

```
    {
        data: AnyObject,
        error_details: AnyError if exists
    }
```
* **Data:** When service response it's ok.
* **ErrorDetails:** When existing any error in the execution of method.