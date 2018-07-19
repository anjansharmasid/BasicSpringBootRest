
This is a simplest form of spring boot application to POST a request to a 3rd party service.
The request has http Header and Http Body.


How to test:

Download code, cd ~/BasicSpringBootRest/  mvn package, mvn clean install  
Start application  java -jar basicspringboot-0.0.1-SNAPSHOT.jar

Go to  http://localhost:8080/test/

Swagger is here  http://localhost:8080/test/swagger-ui.html#/test45api 

Note: In this example there exists a service at http://communication-api-integration.integration.thomascook.io:8000/mail/hotel-everywhere-user-account-create   which can send email and the service is accessable from the local host.

Verify by ping communication-api-integration.integration.thomascook.io    the host.

This application can be use as a alternative to POSTMAN client.

Thanks
Anjan
