# Task 1:
Screenshots of POSTman depicting the testing of different routes with their respective responses are in the "screenshots" folder
----
## BASE URL - <http://localhost/api/v1/> ##

Markup : ## Routes ##
* ###GET /-> fetches all the server objects from the DB
* ###GET /?server=<server_id> -> fetches the server object corresponding to server_id
* ###POST /=> Body ("name", "id", "language", "framework") -> Adds an object to the DB with the provided details
* ###DELETE /?server=<server_id>### -> Removes the server object corresponding to server_id from the DB
* ###GET /find?name=###-> Find the server whose names contain this "name"
* ###PUT /### -> Update the details of an object of the DB

----

### Description ###
Spring Boot
