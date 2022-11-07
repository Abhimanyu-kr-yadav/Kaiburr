
# Task-1

The application demonstrates the REST API using Spring boot and MongoDB. The application demonstrates all the database operations like Create, Read, Update and Delete.


## 🚀 About Me
* Abhimanyu Kumar
* Computer Science @ CUTM


### Tools and Technologies Used
* Spring Boot 2.7.5
* MongoDB
* Spring Tools Suite
* Java 8
* Postman

### Dependencies Used
* Spring Web
* Lombok
* Spring Data MongoDB
* Spring Boot Dev Tools

> **_NOTE:_**  This project is based upon MVC architecture.


## Start MongoDB

To run mongoDB server. Type mongod in the terminal.

```bash
  mongod
```

### Features
### `Insert Data`
* The server object is passed as a json-encoded message body.

Base URL - http://localhost:8080/api/v1/
#### POST API

#### Insert student details 

```http
  POST /addStudent
```


## Code

```java
//Add student 
@PostMapping("/addStudent")
public String saveBook(@RequestBody Student student) {
	repository.save(student);
	return "Added book with id : " + student.getId();
}
```


## Screenshots

![Insert Data Screenshot](./Screenshots/insertData.jpg)

