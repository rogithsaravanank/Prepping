**Spring MVC** (Model-View-Controller) is a web framework built on the Spring Framework. It is designed to provide a clean separation of concerns in web applications by dividing the application into three interconnected components: **Model**, **View**, and **Controller**. 

### Key Components of Spring MVC:

1. **Model**:
   - The model contains the application data or business logic.
   - It is represented by Java objects (POJOs) and is responsible for data manipulation, fetching, and business logic processing.
   - It is typically used in conjunction with data access technologies such as Hibernate, JPA, or JDBC.

2. **View**:
   - The view is responsible for rendering the user interface, usually as HTML output.
   - Spring MVC supports various view technologies such as JSP, Thymeleaf, FreeMarker, etc.
   - It is responsible for displaying data received from the controller to the user.

3. **Controller**:
   - The controller handles the incoming HTTP requests, processes them, and returns an appropriate response.
   - It acts as an intermediary between the Model and the View, taking the user input from the View, interacting with the Model, and deciding which View to render.

### How Spring MVC Works:

1. **Client Request**:
   - The client sends a request to the server.

2. **DispatcherServlet**:
   - The `DispatcherServlet` is the front controller in Spring MVC. It intercepts all incoming requests and forwards them to appropriate controllers for processing.
   - It is configured in the `web.xml` file or through Java configuration in a Spring Boot application.

3. **Handler Mapping**:
   - The `DispatcherServlet` uses a handler mapping to determine which controller to call for handling the request.
   - Handler mappings are defined using annotations (like `@RequestMapping`) or XML configuration.

4. **Controller**:
   - The selected controller processes the request and interacts with the Model to handle business logic and data processing.

5. **ViewResolver**:
   - After processing the request, the controller returns a logical view name to the `DispatcherServlet`.
   - The `ViewResolver` then maps the logical view name to the actual view (like a JSP page) and renders it to the user.

6. **Response**:
   - The response is sent back to the client, completing the request-response cycle.

### Key Annotations in Spring MVC:

1. **@Controller**: 
   - Marks a class as a Spring MVC Controller.
   - This class will handle incoming web requests.

2. **@RequestMapping**:
   - Used to map web requests to specific handler methods in a controller.
   - It can be applied at the class level or method level to specify URL patterns.

3. **@RequestParam**:
   - Used to bind request parameters to method parameters in a controller.

4. **@PathVariable**:
   - Used to bind URI template variables to method parameters in a controller.

5. **@ModelAttribute**:
   - Used to bind a model attribute to a method parameter or return it as a part of the model for a view.

6. **@ResponseBody**:
   - Used to directly return data in the response body, instead of a view. Often used in RESTful web services.

7. **@RestController**:
   - A convenient annotation that combines `@Controller` and `@ResponseBody`.
   - Used for RESTful web services where responses are typically in JSON or XML format.

### Basic Spring MVC Example:

Here's a simple Spring MVC controller example:

```java
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "hello"; // This refers to a view named "hello"
    }
}
```

In this example:
- The `@Controller` annotation marks the class as a controller.
- The `@GetMapping` annotation maps HTTP GET requests to the `sayHello` method.
- The `@RequestParam` annotation binds the request parameter "name" to the method parameter `name`.
- The `Model` is used to add attributes to the view.
- The method returns a String "hello," which is the logical view name that will be resolved to a physical view (e.g., a JSP or Thymeleaf template).

Here's an explanation of both `@PathVariable` and `@ModelAttribute` annotations in Spring MVC:

### `@PathVariable`

- **Purpose**: The `@PathVariable` annotation is used to extract values from the URI path and bind them to method parameters in a Spring MVC controller. This is commonly used to dynamically retrieve data based on the URL segments.
- **Usage**: It is often used in RESTful web services to extract dynamic parts of a URI.

**Example**:
```java
@RestController
public class UserController {

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long id) {
        // Logic to fetch user by ID
        return new ResponseEntity<>(userService.findById(id), HttpStatus.OK);
    }
}
```
In this example, if a request comes to `/user/123`, the value `123` will be bound to the `id` parameter in the `getUserById` method.

### `@ModelAttribute`

- **Purpose**: The `@ModelAttribute` annotation is used to bind request parameters to a model object or to add attributes to a model, which is then accessible in the view. It can also initialize the model attribute before the controller method is invoked.
- **Usage**: It is commonly used to populate the model with attributes that are needed by multiple request handlers or to create form-backing beans.

**Example 1 - Binding Request Parameters to a Method Parameter**:
```java
@Controller
public class UserController {

    @PostMapping("/user")
    public String addUser(@ModelAttribute User user) {
        // The 'user' object is automatically populated with form data
        userService.save(user);
        return "userDetail";
    }
}
```
In this example, when a POST request is made to `/user`, the form data from the request body will automatically populate the `User` object.

**Example 2 - Adding Attributes to the Model**:
```java
@Controller
public class UserController {

    @ModelAttribute("countries")
    public List<String> populateCountries() {
        // This method returns a list of countries to be used in forms
        return Arrays.asList("USA", "Canada", "UK");
    }

    @GetMapping("/userForm")
    public String showForm() {
        return "userForm";
    }
}
```
In this example, the `populateCountries` method is annotated with `@ModelAttribute`, which means the returned list of countries will be added to the model under the attribute name "countries" and can be used in the `userForm` view.

### Spring Boot and Spring MVC:

In Spring Boot, much of the boilerplate configuration required by traditional Spring MVC applications is simplified:
- The `DispatcherServlet` and default error handling are auto-configured.
- `ViewResolver` and other components are auto-configured based on dependencies.
- The embedded server (like Tomcat) is also automatically configured, making it easier to run the application without needing an external web server.

This auto-configuration and simplification make Spring Boot a popular choice for developing Spring MVC applications quickly and efficiently.

