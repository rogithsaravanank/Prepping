## SpringBoot

### Annotations

**Spring Boot Annotations - A Comprehensive Guide**

**Core Annotations:**

* **@SpringBootApplication:** This single annotation combines three functionalities:
    * `@EnableAutoConfiguration`: Enables automatic Spring Boot configuration based on classpath libraries.
    * `@ComponentScan`: Scans for components (beans) in the package where the class is located.
    * `@Configuration`: Marks the class as a configuration class.
* **@RestController:** Marks a class as a REST API controller, handling incoming HTTP requests and responses.
* **@Autowired:**  It automatically injects dependencies into a class, Injects dependencies into a bean constructor, field, or setter method. Prefer constructor injection for clarity and better control. -> https://youtu.be/ET39IFffr24?si=-XKubSkwERj2vvXw ,**Dependency Injection** Instead of objects creating their dependencies themselves, they receive them from an external source.
* **@Qualifier** or **@Primary** to resolve ambiguity when multiple beans of the same type exist
* **@Component (including @Service and @Repository):** A generic annotation for Spring beans.
    * `@Service`: Marks a class as a business logic service.
    * `@Repository`: Marks a class for data access logic (repositories).
* **@Entity:** Marks a class as a JPA entity, representing a database table.

**Advanced Annotations:**

* **@RestControllerAdvice:** Provides global exception handling and custom argument resolution across controllers.
* **@ExceptionHandler (within @RestControllerAdvice):** Defines methods to handle specific exceptions with appropriate HTTP status codes and error responses.
* **@Table (with @Entity):** Specifies the name of the database table for an entity class.
* **@Column (with @Entity):** Specifies the name and properties of a column within an entity.
* **@Id (with @Entity):** Marks the primary key field of an entity.
* **@GeneratedValue (with @Entity):** Configures automatic generation strategy for the primary key (e.g., `GenerationType.IDENTITY` for auto-increment).

**Data Validation Annotations:**

* **@NotNull:** Ensures a field cannot be null.
* **@Nullable:** Allows a field to be null.
* **@Pattern:** Validates a field against a regular expression(regex).

**JPA Relationship Annotations:**

* **@OneToMany:** Defines a one-to-many relationship between entities.
* **@ManyToOne:** Defines a many-to-one relationship between entities.
* **@ManyToMany:** Defines a many-to-many relationship between entities.
* **@JoinTable (with @ManyToMany):** Specifies the join table for a many-to-many relationship.
* **@JoinColumn (with @OneToMany or @ManyToOne):** Specifies the join column for a one-to-many or many-to-one relationship.

**JSON Serialization Annotations:**

* **@JSONManagedReference:** Used for bi-directional relationships in JSON serialization to avoid infinite loops.
* **@JSONBackReference:** Used for bi-directional relationships in JSON serialization to avoid infinite loops.

**Lombok Annotations:**

* **@Data:** Reduces boilerplate code by automatically generating getters, setters, `toString`, `equals`, and `hashCode` methods for a class (useful for POJOs).

**Aspect Oriented Programming**
* **@Aspect:** Marks a class as an aspect, containing advice (code to be executed at specific points)
* **@Pointcut:** Specifies a pointcut (a method or a set of methods) to which
* **@Before:** Specifies a method to be executed before a pointcut
* **@After:** Specifies a method to be executed after a pointcut , remove the transaction id
* **@Around:** Specifies a method to be executed around a pointcut , allowing for full control over the execution flow , generate the transaction id 

**Other Useful Annotations:**

* **@NoArgsConstructor:** Generates a no-argument constructor for a class.
* **@AllArgsConstructor:** Generates an all-argument constructor for a class.
* **@Slf4j:** Provides simplified logging using a static logger instance.
* **@Bean:** Defines a method that returns an object managed as a Spring bean.
* **@Configuration:** Marks a class as a configuration class with bean definitions.
* **@EnableWebSecurity:** Enables Spring Security for web applications.
* **@Order(1):** Specifies the order in which beans are initialized.
* **@Operation (with @Swagger):** Provides descriptive information about operations in API documentation.
* **@Tag (with @Swagger):** Tags a class as an application or controller for API documentation.
* **@CrossOrigin:** Enables Cross-Origin Resource Sharing (CORS) for handling requests from different origins.
* **@Validated:** Triggers validation on a bean or method parameter.
* **@Lock (LockModeType.PESSIMISTIC_WRITE/PESSIMISTIC_READ):** Specifies the lock mode for a method to control data access concurrency.
* **@Transactional:** Marks a method or class as transactional, managing database transactions (commit/rollback).
* **@Value("{application.properties}")** Injects values from application properties files.
* **@Scope ("prototype/session/request/singleton")**: Defines the scope of a bean (singleton by default, prototype for each request, etc.).
* **@RequestParam**: Binds request parameters to method parameters.
* **@PathVariable**: Binds URI template variables to method parameters.
* **@RequestBody**: Binds the HTTP request body to a method parameter.(Deserialise the request)
* **@ResponseBody**: Writes the return value of a method directly to the HTTP response body.(Serialise the response)
* **@PreAuthorize**: Secures methods with Spring Security expressions.
* **@PostAuthorize**: Secures method return values with Spring Security expressions.
* **@Scheduled**: Schedules methods to be executed at fixed intervals or specific times.
* **@Async**: Marks methods to be executed asynchronously.
* **@Cacheable**: Enables caching for methods.


### Dependancy Injection
- DI is a design pattern where objects receive their dependencies from external sources rather than creating them themselves. This promotes loose coupling, testability, and maintainability.

### QueryDSL
- 1.19.46.00 --> Springboot with mongodb

- Mongo db website to create a free account and cluster
- spring io
- dependancy --> spring web, spring data monogodb
- extend mongorepository
- 1.20.26.54 

Sure! Let’s imagine we have a fun little toy world with two types of toys: **Dolls** and **Cars**.

### JSON Managed Reference
- Think of the **Doll** as a special toy that has a collection of **Cars**. Each Doll can have many Cars, and it keeps track of them.
- When we say “**JSON Managed Reference**,” it’s like telling our Doll, “You can show off your Cars to anyone who asks!”

### JSON Back Reference
- Now, each **Car** wants to remember which **Doll** it belongs to. So, when you look at a Car, it can say, “I belong to this specific Doll!”
- This is what we call a “**JSON Back Reference**.” It’s like the Car saying, “Hey, I’m friends with this Doll!”

### Why Do We Use Them?
- When we want to send information about our toys (like in a computer program), we need to decide what to show and what not to show.
- **Managed Reference** helps us say, “Show all the Cars when we look at a Doll.”
- **Back Reference** helps us say, “Show who owns this Car when we look at the Car.”

### The Problem
Sometimes, if we try to show everything at once, we can get confused. It’s like if all the Cars tried to shout out their Doll at the same time! So, we use these references to keep everything neat and tidy.

### In Summary
- **JSON Managed Reference**: Tells the Doll to show its Cars.
- **JSON Back Reference**: Tells the Car to remember its Doll.

- **@SpringBootApplication** : It is the annotation used to enable auto-configuration of the Spring Boot application.
- **@RestController** : It is used to mark the class as a rest controller.
- **@Autowired** : It is used to inject the dependencies in the class without explicitly configuring them.
- **@Component** : It is used to mark the class as a Spring component(Bean).
- **@Service** : It is used to mark the class as a service component. Service layer for business logic.
- **@Respository** : It is used to mark the interface as repository component. Repository layer for data access.
- **@Entity** : It will mark the class as an entity. Data model for the application.
- **@RestControllerAdvice** : annotation in Spring is a powerful tool for handling global exception handling and custom method argument resolution across multiple controllers in a Spring Boot application.
- **@ExceptionHandling** : Used in the methods to call the Exception.class 
- **@Table** : It will specify the table name in the database.
- **@Column** : It will specify the column name in the table.
- **@Id** : It will specify the primary key of the table.
- **@GeneratedValue(strategy = GenerationType.IDENTITY)** : To specify the generated values in the table.
- **@NotNull** : It won't allow the field to be set as null.
- **@Nullable** : It will allow the field to be set as null.
- **@Pattern(regexp = "^[A-Z][A-Z][0-9][A-Z0-9]*", message = "Invalid Data")** : It will specify the pattern for the field.
- **@OneToMany** : It will specify the one to many relationship between the tables.
- **@ManyToOne** : It will specify the many to one relationship between the tables.
- **@ManyToMany** : It will specify the many to many relationship between the tables.
- **@JoinTable** : It will specify the join table for the many to many relationship.
- **@JoinColumn** : It will specify the join column for the one to many relationship.
- **@JSONManagedReference** : It will specify the managed reference for the JSON serialization.
- **@JSONBackReference** : It will specify Back Reference to support JSON serialization.
- **@Data** : It will be useful to reduce boilerplate code of getter,setters,toString,hashcodes,equals. especially for Plain Old Java Objects (POJOs)
- **@NoArgsConstructor** : It will be useful to create a no-arg constructor for the class.
- **@AllArgsConstructor** : It will be useful to create an all-arg constructor for the class
- **@Slf4j** : It is used to instantiation of the Logger object in our class.(Methods to use in logger are info,debug,trace, warn, error).
- **@Bean** : Method level annotaion to inject the bean into application context.
- **@Configuration** : Class level annotation to enable the configuration class.
- **@EnableWebSecurity**: 
- **@Order(1)** : It is used to specify the order of the bean in the application context.
- **@Aspect** : Marks the class as an aspect, which contains advice (code to be executed at certain join points)
- **@Operation("Description of the method")** : It is used to specify the description of the method.
- **@Tag** : Tag for the Class name of the Application (Controller)
- **@CrossOrigin** : It is used to enable cross origin resource sharing(Controller).
- **@Validated** : It is used to enable validation for the class. potential validation error can be avoided.
- **@Lock(LockModeType.PESSIMISTIC_WRITE/PESSIMISTIC_READ)** : It is used to specify the lock mode for the method.
- **@Transactional** : It is used to mark the method or class as a transactional .Which will automatically rollback if the commit didn't happen.
- **@Value("{application.properties}")** : This annotation is used to set the properties from the application.properties or application.yaml file.
- **@Scope("prototype/session/request/singleton(default)")**: This annotation is used to set the scope for the object creation.same hashcodes for the objects if the scope is singleton.
