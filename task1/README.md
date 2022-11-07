# Task 1:
The application demonstrates the REST API using Spring boot and MongoDB. The application demonstrates all the database operations like Create, Read, Update and Delete.
----
### BASE URL - <http://localhost/api/v1/> ###

Markup : ## Routes ##
* GET /-> fetches all the server objects from the DB
* GET /?server=<server_id> -> fetches the server object corresponding to server_id
* POST /=> Body ("name", "id", "language", "framework") -> Adds an object to the DB with the provided details
* DELETE /?server=<server_id> -> Removes the server object corresponding to server_id from the DB
* GET /find?name=-> Find the server whose names contain this "name"
* PUT / -> Update the details of an object of the DB

----

### Description ###
Spring Boot
