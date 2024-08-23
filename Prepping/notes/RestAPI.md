## REST API - Representational State Transfer Application Programming Interface

A **REST API** (Representational State Transfer Application Programming Interface) is a set of rules and conventions for building and interacting with web services. REST is an architectural style that uses standard HTTP methods to perform operations on resources. It is stateless, meaning that each request from a client to a server must contain all the information the server needs to fulfill the request.

### Key Concepts of REST API

1. **Resources**:
   - In REST, everything is considered a resource. A resource can be any kind of object, data, or service that can be accessed through a URI (Uniform Resource Identifier). For example, a user, a document, or a product in an online store can all be considered resources.

2. **HTTP Methods**:
   - RESTful APIs use standard HTTP methods to perform operations on resources. The most commonly used HTTP methods in REST are:
     - **GET**: Retrieve a resource or a collection of resources.
     - **POST**: Create a new resource.
     - **PUT**: Update an existing resource.
     - **DELETE**: Delete a resource.
     - **PATCH**: Partially update a resource.

3. **Statelessness**:
   - REST is stateless, meaning that each HTTP request from a client to the server must contain all the information needed to understand and process the request. The server does not store any client context between requests.

4. **URIs (Uniform Resource Identifiers)**:
   - URIs are used to identify resources. They should be intuitive and easily understood. Typically, URIs are organized in a hierarchy, reflecting the structure of the resources. For example:
     - `GET /users` - Retrieves a list of users.
     - `GET /users/{id}` - Retrieves a specific user by ID.
     - `POST /users` - Creates a new user.
     - `PUT /users/{id}` - Updates a specific user by ID.
     - `DELETE /users/{id}` - Deletes a specific user by ID.

5. **Representation**:
   - Resources can have multiple representations, such as JSON, XML, HTML, etc. REST APIs commonly use JSON as the format for sending and receiving data due to its simplicity and readability.

6. **Status Codes**:
   - RESTful APIs use standard HTTP status codes to indicate the result of an operation. Common status codes include:
     - **200 OK**: The request was successful.
     - **201 Created**: A new resource has been created successfully.
     - **204 No Content**: The request was successful, but there is no content to return.
     - **400 Bad Request**: The request was invalid or cannot be processed.
     - **401 Unauthorized**: Authentication is required and has failed or not been provided.
     - **403 Forbidden**: The client does not have access rights to the content.
     - **404 Not Found**: The requested resource could not be found.
     - **500 Internal Server Error**: A generic server error occurred.

7. **Headers**:
   - HTTP headers provide additional information with an HTTP request or response. Important headers in REST APIs include:
     - **Content-Type**: Specifies the media type of the resource or data.
     - **Accept**: Indicates the client’s preferred response format.
     - **Authorization**: Contains credentials for authenticating a user with the server.

### Example of a RESTful API in Java using Spring Boot

Spring Boot is a popular framework for building RESTful APIs in Java.

```java
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    private Map<Integer, String> users = new HashMap<>();

    // Retrieve a list of users
    @GetMapping
    public Map<Integer, String> getAllUsers() {
        return users;
    }

    // Retrieve a specific user by ID
    @GetMapping("/{id}")
    public String getUser(@PathVariable int id) {
        return users.get(id);
    }

    // Create a new user
    @PostMapping
    public String createUser(@RequestBody String name) {
        int id = users.size() + 1;
        users.put(id, name);
        return "User created with ID: " + id;
    }

    // Update an existing user by ID
    @PutMapping("/{id}")
    public String updateUser(@PathVariable int id, @RequestBody String name) {
        if (users.containsKey(id)) {
            users.put(id, name);
            return "User updated with ID: " + id;
        } else {
            return "User not found";
        }
    }

    // Delete a specific user by ID
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        if (users.containsKey(id)) {
            users.remove(id);
            return "User deleted with ID: " + id;
        } else {
            return "User not found";
        }
    }
}
```

### Key Features of This Example

- **`@RestController`**: This annotation marks the class as a RESTful controller where every method returns a domain object instead of a view. It combines `@Controller` and `@ResponseBody`.
- **`@RequestMapping`**: This annotation maps HTTP requests to handler methods of MVC and REST controllers.
- **HTTP Methods**: Each method (`GET`, `POST`, `PUT`, `DELETE`) is mapped to an HTTP method using annotations like `@GetMapping`, `@PostMapping`, `@PutMapping`, and `@DeleteMapping`.
- **`@PathVariable`**: Extracts values from the URI.
- **`@RequestBody`**: Maps the HTTP request body to a transfer or domain object, enabling automatic deserialization.

### Benefits of REST APIs

1. **Scalability**: Statelessness and caching mechanisms allow REST APIs to handle a large number of requests efficiently.
2. **Flexibility**: REST APIs can use various data formats (JSON, XML, etc.) and can be consumed by any client capable of making HTTP requests.
3. **Interoperability**: REST APIs are platform-independent and can be used across different programming languages and platforms.
4. **Performance**: HTTP methods and status codes allow for clear communication between client and server, reducing the complexity of data processing.

REST APIs have become a standard for web services due to their simplicity, scalability, and ease of integration.