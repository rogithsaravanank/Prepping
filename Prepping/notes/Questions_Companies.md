## KPMG Interview Questions

These are potential interview questions categorized by level and topic, based on the information you provided.

### Level 1

### About Project

*   Explain about your project and the tech stack you are using.
*   What are your roles and responsibilities in your team?

### Core Java

*   What is try-with-resources?
*   What is immutability?
*   How does the `add` method work in a `Set`?
*   Implement an `add` method for a `List`.
*   Which version of Java are you using?
*   Explain the relationship between `equals` and `hashCode` methods in Java.

### Database

*   What are SQL Triggers?
*   Explain the `HAVING` clause in SQL.

### Spring Framework

*   How do you handle exceptions globally in Spring Boot?
*   What is Spring profiling?

### Microservices

*   What is your team's approach to splitting a monolith into microservices?

## Level 2

### About Project

*   Explain about your project and the tech stack you are using.
*   What are your roles and responsibilities in your team?

### Coding

*   Find the second highest salary from a given list of employees (using Java streams).
*   Find the second highest salary (using an SQL query).
  ```
select * from employee order by salary desc OFFSET 1 FETCH FIRST 1 ROW ONLY 
  ```

### Design Patterns

*   What design patterns have you worked on?
*   Explain the Decorator design pattern.
*   What is the difference between the Factory and Abstract Factory design patterns?

### Microservices

*   How do you establish communication between two microservices?
*   How do you do service discovery?
*   Do you use caching? What is the use of it?
*   What are the challenges you faced while migrating to a microservices architecture?

### Security

*   How do you do authentication and authorization?

### Cloud (Azure)

*   What is Azure Service Bus?
*   How do you deploy services without any downtime?

### Generic Questions

*   Do you have any experience with UI technologies?
*   How do you handle a conflict with a colleague?
*   Have you ever failed at any task, and how did you tackle it?
*   How do you handle/identify performance issues?

## Level 3 (with Senior Manager and Client)

### About Project

*   Explain about your project and the tech stack you are using.
*   What are your roles and responsibilities in your team?

### Microservices

*   What are the advantages of microservices?
*   How do you make REST API calls? By opening the service with a public path or IP address?

### Security

*   How do you authenticate a user?
*   How does JWT authentication work? Can you explain?
*   What does a JWT contain?
*   How do you use filters? Explain a JWT authentication filter.
*   What is the difference between hashing and encoding? Which one do you use to secure passwords?
*   How do you authenticate databases for a user?

### Generic Questions

*   What are your roles and responsibilities in your current team?
*   Which role would you be comfortable accepting? As a lead or a senior dev?




## Level 1

### About Project

*   Explain about your project and the tech stack you are using.
*   What are your roles and responsibilities in your team?

### Core Java

*   What is serialization?
*   How do you create custom exceptions in Java?
*   Have you ever created a custom exception extending the `Exception` class?
*   What is a marker interface?
*   What collections have you used?
*   How do you make a `List` thread-safe?
*   How do you make a singleton instance synchronized?
*   What is lazy loading of a singleton instance?
*   Give a scenario where you have used a `Set`.
*   Why choose `ArrayList` over `Vector`?
*   What is an atomic variable?

### Coding

*   Implement the Singleton design pattern.

### Design Patterns

*   What design patterns have you worked on?

### Spring Framework

*   Name the annotations you have used in Spring Boot.
*   Can you create more than one database connection instance in Spring Boot?
*   What does `@Transactional` do?

### Generic Questions

*   Have you ever worked on front-end technologies like Angular or React?
*   When and how did you implement AWS S3?
*   Where did you use Kafka?
*   Where have you used Base64 and SHA256?
*   Did you ever face performance issues? How did you resolve them?
*   Have you ever used caching? Explain the scenario.
*   How did you implement Redis?
*   How do you mock static methods using Mockito?
*   Explain a scenario where you had to use Apache POI.
*   Are you following TDD (Test-Driven Development)?

## Level 2

### About Project

*   Explain about your project and the tech stack you are using.
*   What are your roles and responsibilities in your team?

### Core Java

*   Features of Java 21.
*   Features of Java 8.
*   What are functional interfaces?
*   Why are lambdas used?
*   What is a Red-Black tree?

### Coding

*   Stream an employee list and filter employees having a salary > 10000 and sort them.
*   How to implement customized sorting in the `streams().sort()` method.

### Spring Framework

*   What are the important annotations in Spring Boot?
*   How does Spring Batch work?
*   Give a scenario where you have implemented Spring Scheduler.
*   What does `@Transactional` do?
*   How do you call a stored procedure using `JdbcTemplate`?

### Database

*   What is a partition in a database?
*   How do you read a list of items from a database?

### Kafka

*   How do you set up Kafka?
*   Are Kafka messages synchronous or asynchronous?

### Unit Testing

*   How do you test DB calls using JUnit and Mockito?
*   How do you test stored procedures using JUnit?
*   What is the code coverage you maintain?

### Cloud

*   Have you ever used EC2 (Elastic Compute Cloud)?

### Generic Questions

*   Have you been part of production deployments?
*   Have you ever used React or Angular?
*   Explain ACID properties.
*   What is a webhook? Have you ever used or implemented it?



# EPAM Interview Questions (Level 1 - Part 1)

These are potential interview questions for a Level 1 interview at EPAM.

## About Project

*   Explain your project and the tech stack you are using.
*   What are your roles and responsibilities in your team?

## Core Java

*   Distinguish between `==` vs. `equals()`.
*   What is immutability, and how do you create an immutable class?
*   What is Autoboxing and Auto-unboxing?
*   Explain the `final` keyword.
*   Explain access modifiers in Java.
*   Explain the four main OOPs concepts (Abstraction, Encapsulation, Inheritance, Polymorphism).
*   Distinguish between compile-time vs. runtime polymorphism.
*   What is fail-fast vs. fail-safe?
*   What is the Fork/Join Pool?
*   Distinguish between `ArrayList`, `LinkedList`, and `Vector`.
*   Explain the Java Memory Model (stack, heap, string constant pool) and Garbage Collection in Java.
*   Explain Functional Interfaces (FIs in the Java library).
*   What are intermediate and terminal operations in Streams?
*   Explain the difference between `wait`, `notify`, and `notifyAll`.
*   Explain exception handling in Java and its hierarchy.
*   How do you define custom exceptions in Java?
*   What is the `volatile` keyword? Explain its usage in synchronization.
*   Distinguish between `HashMap` vs. `Hashtable`. How do you handle collisions?

## Coding

*   Basic program using Streams (filter, map, sort, flatMap, reduce, Optional, collect, grouping).
*   Find the first non-repetitive character in a string (explain its time complexity).



# EPAM Interview Questions (Part 2)

These are potential interview questions for EPAM, continued from the previous set.

## Level 2

### About Project

*   Explain about your project and the tech stack you are using.
*   What are your roles and responsibilities in your team?

### Core Java

*   What do you need to run a Java program? JDK or JRE?
*   What is platform independence in Java?
*   What is `<? extends Number>` in generics?
*   Explain the exception hierarchy in Java.
*   Can we throw an `Error` in Java? If yes, what happens when you do? (Example: `throw new Error();`)
*   A child class extending a parent class has an overridden method. Can we increase/decrease the scope of access modifiers/specifiers in the child class?
*   Explain Java memory model/management.
*   Explain different memory areas in Java (Heap, Stack, Method Area/Permanent Generation (now Metaspace)).
*   How does the garbage collector work? What is its framework/algorithm (e.g., mark and sweep, generational GC)?
*   What are the inbuilt Functional Interfaces in Java? How do you create one?
*   How does serialization work in Java? What is `serialVersionUID`? What is its use?
*   Have you ever created custom annotations? What is the use of custom annotations?
*   If 3 objects are created in the `main` method, how many objects are created in the stack?

### Coding

*   Java generics: How to write a method accepting a generic value (wildcard).
*   Override the `equals` method to check if two given `Employee` objects are equal or not.
*   Create a functional interface and run it.
*   Program to merge two sorted arrays into one.
*   Sort a given `LinkedHashMap` based on values (using streams).

### Spring Framework

*   What is the Application Context?
*   Why use `@Repository` over `@Component` for data access?
*   What is a Spring Bean?
*   How does Spring Batch work?
*   Give a scenario where you have implemented Spring Scheduler.
*   What does `@Transactional` do?
*   How do you call a stored procedure using `JdbcTemplate`?

### Database

*   What is a partition in a database?
*   Which approach is better when reading from two tables: subquery or joins?
*   What is cluster indexing?

### Kafka

*   How do you set up Kafka?
*   Will a consumer group consume the same message from Kafka (duplicates)?

### Unit Testing

*   Difference between `@Mock` and `@InjectMocks` in Mockito.
*   How do you test DB calls using JUnit and Mockito?
*   How do you test stored procedures using JUnit?
*   What is the code coverage you maintain?

### Swagger

*   Explain Swagger annotations that you have used in your project.

### Cloud

*   How to implement AWS S3 in code.
*   How do you save usernames and passwords in a cloud environment?

### Generic Questions

*   What do you know about API Gateway?
*   What is the best approach to save passwords?
*   Explain SOLID principles.
*   Explain CAP theorem.

## Level 3 (Manager Discussion)

### About Project

*   Explain about your project and the tech stack you are using.
*   What are your roles and responsibilities in your team?

### Coding

*   Write a program to print non-repeating numbers from a given list.
*   Balanced parentheses program.

### Spring Framework/Microservices

*   How do you make microservices communicate with each other?
*   How to achieve asynchronous calls in Java and Spring Boot?



# Cognizant Interview Questions (Level 1)

These are potential interview questions for a Level 1 interview at Cognizant.

## About Project

*   Explain your project and the tech stack you are using.
*   What are your roles and responsibilities in your team?

## Core Java

*   Java latest updates/features.
*   Java 8 features.
*   What is externalization (in the context of Java, likely referring to serialization or configuration)?
*   What are functional interfaces?
*   How does `stream().forEach()` work?

## Coding

*   Sort an employee list by name and salary (using streams).
*   Write a program to remove duplicate characters from a string.

## Spring Framework

*   How to handle exceptions in Spring Boot?

## Microservices

*   Why microservices?
*   How to expose endpoints to the end user?

## Database

*   How to add a new column to a table (SQL `ALTER TABLE`).
*   Delete duplicate records in a table (SQL).
*   What is an index in SQL?
*   What is an SQL trigger?
*   What is an SQL stored procedure?
*   Define a table structure for a user.

## Spring Security

*   What do you know about Spring Security?
*   What are request matchers in Spring Security?
*   JWT and OAuth (basic understanding).
*   How do you generate a JWT token?
*   How to authenticate a user?

## Generic Questions

*   How to do load balancing?
*   How do you test the DAO (Data Access Object) layer using JUnit and Mockito?
*   What is Spring AOP (Aspect-Oriented Programming)?
*   Have you used Kubernetes and Docker in your projects?
*   How to get data with optional fields in JPA/Hibernate.
*   Explain the Maven lifecycle.


# EY Interview Questions (Part 1)

These are potential interview questions for EY, categorized by level.

## Level 1

### About Project

*   Explain your project and the tech stack you are using.
*   What are your roles and responsibilities in your team?

### Spring Framework

*   How do you make services communicate with each other?
*   What is `@Async`?
*   What is `@Transactional`?

### Microservices

*   Explain the architecture of your project.
*   What does service discovery do when a service goes down?

### Circuit Breaker

*   What is circuit breaking? What are the different methods of achieving it?
*   What other frameworks can be used in place of Resilience4j?

### Database

*   How to add a new column to a table (SQL `ALTER TABLE`).
*   Delete duplicate records in a table (SQL).
*   What is an index in SQL?
*   What is an SQL trigger?
*   What is an SQL stored procedure?
*   Define a table structure for a user.

### Spring Security

*   What do you know about Spring Security?
*   What are request matchers in Spring Security?
*   JWT and OAuth (basic understanding).
*   How do you generate a JWT token?
*   How to authenticate a user?

### Generic Questions

*   What is scaling up and scaling down?
*   How did you implement AWS S3 for uploading and reading data?
*   What is containerization?

## Level 2

### About Project

*   Explain your project and the tech stack you are using.
*   What are your roles and responsibilities in your team?

### Core Java

*   Deadlock synchronization program debugging.

### Spring Framework

*   What does `@Component` do?
*   What is the use of `@Autowired`?
*   Have you ever used JPA or Hibernate?
*   How is pagination implemented?
*   What do you send in the request body of a transaction (likely referring to a request to a transactional endpoint)?
*   Which HTTP status codes have you used?
*   Difference between `PUT` and `POST`.
*   `PUT` or `POST`, which one is idempotent?

### Microservices

*   What microservice design patterns have you used?

### Circuit Breaker

*   What is circuit breaking? What are the different methods of achieving it?
*   What other frameworks can be used in place of Resilience4j?

### Spring Security

*   How to set up Spring Security?

### Generic Questions

*   How do you handle event-driven programming?


# EY Interview Questions (Part 2)

These are potential interview questions for EY, continued from the previous set.

## Level 3 (Client Round)

### About Project

*   Explain your project and the tech stack you are using.
*   What are your roles and responsibilities in your team?

### Core Java

*   Which version of Java are you using?
*   What are the features in Java 17?
*   Can we define a `case` for `null` in a `switch` expression in Java 17?
*   Are you using Oracle OpenJDK?

### Spring Framework

*   How do you set up transactions in Spring Boot?
*   How do you handle exceptions in Spring Boot?
*   How do you do profiling in Spring Boot?
*   Have you ever connected to multiple databases in Spring Boot?

### Microservices

*   How do you set up the entire microservices architecture?

### Database

*   Tell us more about SingleStore database. How is it different from Oracle?

### Circuit Breaker & Load Balancing

*   How do you do load balancing and circuit breaking (combining these is common in microservices)?

### Spring Security

*   How do you configure Spring Security?
*   What annotation(s) do you use for configuring Spring Security (e.g., `@EnableWebSecurity`)?

### Kafka

*   Tell us about how you use Kafka for consuming and publishing.

### Generic Questions

*   How do you scale your applications?
*   How do you test `void` methods in Mockito?
*   How do you check code coverage?
*   How do you do static code analysis?

# Capgemini Interview Questions

These are potential interview questions for Capgemini, categorized by level.

## Level 1

### About Project

*   Explain your project and the tech stack you are using.
*   What are your roles and responsibilities in your team?

### Core Java

*   Explain features of Java 8.
*   What are functional interfaces?
*   What are streams?
*   What is a `CompletableFuture`?
*   What is the Collections Framework?
*   What have you used from the Collections Framework?
*   Difference between `HashMap` and `Hashtable`.

### Coding

*   Fetch the second highest salary (from a list/array/collection).

### Spring Framework

*   Why send data in batches to the database instead of sending all at once?
*   What is a REST API? What do you know about the REST framework?
*   What is the use of status codes in REST?
*   Why do we use different HTTP methods in REST APIs (e.g., GET, POST, PUT, DELETE)?
*   How will a Spring application understand the JSON request you send?
*   Why are you using `JdbcTemplate` over Hibernate?
*   How do you achieve Spring Security?

### Microservices

*   What do you know about microservices?
*   How to do load balancing? What is Eureka?
*   How do you scale your applications?
*   How do you deploy services?
*   What are the steps involved in deploying a service?

### Circuit Breaker

*   How to do circuit breaking? What framework do you use for it?
*   What are the open, half-open, and closed states of a circuit breaker?

### Spring Security

*   What do you know about JWT tokens?

### Generic Questions

*   What are some critical and difficult defects you have fixed?
*   What technologies have you used?
*   Have you used Docker and Kubernetes?
*   How to get data with optional fields in JPA/Hibernate?
*   Explain the Maven lifecycle.

## Level 2

### About Project

*   Explain your project and the tech stack you are using.
*   What are your roles and responsibilities in your team?

### Core Java

*   Difference between `==` and `equals()`.
*   What are the latest Java features in recent versions?
*   Difference between `Collection` and `Collections`.
*   How does `HashMap` work internally?
*   How do you synchronize a `HashMap`?
*   Why do we have `ConcurrentHashMap` when we can synchronize `HashMap`?
*   What is the use of streams in Java?
*   What is a lambda expression?
*   What is a scope resolution operator (`::` in Java)?

### Coding

*   Write a program to print the count of each character in a string.

### Spring Framework

*   Difference between `@Autowired` and `@Qualifier`?
*   How do you handle exceptions in Spring Boot?
*   Have you worked on Hibernate?

### Microservices

*   How to set up a microservice architecture?
*   How do you establish communication between two microservices?
*   Are these calls synchronous or asynchronous?
*   Explain the microservice design patterns you have worked on.


# Accenture Interview Questions

These are potential interview questions for Accenture, categorized by level.

## Level 1

### About Project

*   Explain your project and the tech stack you are using.
*   What are your roles and responsibilities in your team?

### Core Java

*   What is a `Spliterator`?
*   `PermGen` vs. `Metaspace`.
*   What are wrapper classes?
*   What is an anonymous class in Java?
*   Difference between JSP and Servlets.
*   Java 8 and 9 updates/features.
*   Explain multithreading in Java.
*   What is a default method in an interface?
*   Difference between inheritance and cohesion (likely a typo, should be cohesion).

### Design Patterns

*   What is a Singleton?

### Spring Framework

*   How does Spring Boot work?
*   How do you handle exception handling in Spring Boot?
*   What is an Actuator?

### Microservices

*   Difference between synchronous and asynchronous calls. When to use each?

### Generic Questions

*   Have you ever worked on Swagger?
*   Explain JUnit.
*   What is a Stub and a Driver (in testing)?
*   What is Sharding?
*   Difference between horizontal and vertical scaling. When to use each?
*   What will you do if the project manager asks you to implement a new change in the middle of a sprint?
*   What if a production defect arises at a very critical time, and you cannot refuse to address it?



# Virtusa Interview Questions

These are potential interview questions for Virtusa, categorized by level.

## Level 1

### About Project

*   Explain your project and the tech stack you are using.
*   What are your roles and responsibilities in your team?

### Core Java

*   Method overriding example. What should be the access specifier of the overriding method?
*   What are access specifiers in Java? Name a few you are familiar with.
*   Example of what happens when you insert different objects with the same data into a `HashSet`?

### Database

*   Write a query to fetch the student who has scored the top third highest marks.

### Spring Framework

*   Exception handling in Spring Boot?
*   How do you secure a Spring application?
*   How to generalize a common response object for all endpoints in the project?
*   How can you create Spring beans of two different implementations of a single interface without any issues? (using `@Qualifier` and `@Primary` annotations).

### Microservices

*   What are the challenges you faced while switching to a microservices architecture?

### AWS

*   What was the use case in your previous project for using AWS S3? How did you implement it?

### Generic Questions

*   Have you ever worked on UI?

## Level 2

### About Project

*   Explain your project and the tech stack you are using.
*   What are your roles and responsibilities in your team?

### Core Java

*   Tell me about your project.
*   Which version of Java are you using?
*   What are functional interfaces, and how do you use them?
*   How do you read huge amounts of data from a file with limited CPU and memory?
*   How do you assign a task to a thread? You can use thread frameworks (e.g., ExecutorService, Fork/Join).

### Database

*   Write a query to join the `emp` and `dept` tables to fetch the maximum salary in each department.
*   Use streams to filter records having age greater than 30 and salary greater than 1 lakh and concatenate their names.

### Spring Framework

*   How did you implement the Spring Scheduler?

### Microservices

*   What are the challenges you faced while switching to a microservices architecture?

### AWS

*   What do you know about AWS S3?

### Generic Questions

*   What do you know about CI/CD pipelines?
*   What is blue/green deployment?
*   What is SSL?
*   `HTTP` vs. `HTTPS`?

## Level 3 (Client Round)

### About Project

*   Explain your project and the tech stack you are using.
*   What are your roles and responsibilities in your team?

### Core Java

*   Explain the latest features that you have used in Java.
*   Where did you use text blocks and sealed classes in your project?

### Circuit Breaker

*   How did you implement circuit breaking?
*   When did you use the retry mechanism?

### Kafka

*   What was the purpose of using Kafka in your project?

### Generic Questions

*   How will you fix the issues when multiple instances are failing to serve the incoming requests?
*   What was the reason for choosing SingleStore database in your project?
*   Have you ever used caching in your project? Where did you use it?


# Oracle Interview Questions (Attempt 1)

These are potential interview questions for Oracle, categorized by level.

## Level 1

### About Project

*   Explain your project and the tech stack you are using.
*   What are your roles and responsibilities in your team?

### Core Java

*   What are generics in Java, and what is their purpose?
*   What is a thread pool in Java?
*   What happens if one of the threads in a thread pool causes an error/exception?
*   How do you handle multiple threads trying to access a shared resource (concurrency control)?

### Coding

*   Write a program to find the longest substring without repeating characters.

### Design Patterns

*   What design patterns have you used?

### System Design

*   Design an ordering system for stores.

### Kafka

*   Do you use Kafka?

### Caching

*   What is an LRU (Least Recently Used) cache?

## Level 2

### About Project

*   Explain your project and the tech stack you are using.
*   What are your roles and responsibilities in your team?

### Core Java

*   What is serialization?
*   What do you know about `Class.class` in Java (reflection)?
*   How do you access a private constructor from outside the class (using reflection)?
*   What is an annotation?
*   How do you create custom annotations in Java?

### Coding

*   Implement the Singleton design pattern.
*   Trapping Rain Water problem.
*   Write a method to get the maximum value from a custom data structure in constant time (O(1)) without traversing.

### Database

*   What is `RANK()` in SQL?
*   Delete duplicate rows from a table (SQL).

### Design Patterns

*   What design patterns have you worked on?

### Caching

*   What is an LRU cache?
*   Implement an LRU cache.

### Generic Questions

*   What are the SOLID principles? Explain them in detail.



# Highradius Interview Questions

These are potential interview questions for Highradius, categorized by level.

## Level 1

### About Project

*   Explain your project and the tech stack you are using.
*   What are your roles and responsibilities in your team?

### Core Java

*   Explain `BiPredicate`.
*   Strings in Java (general concepts).
*   Inheritance in Java.
*   `StackOverflowError`.
*   Different types of exceptions in Java.
*   `NullPointerException` in Java and how to prevent it.
*   `ArrayIndexOutOfBoundsException`.
*   Recursion.
*   Memory areas in Java (Heap, Stack, Method Area/Metaspace).
*   How to iterate over values in a `Map`.
*   Is it valid to have classes and interfaces without any content/members?
*   Exception hierarchy in Java.
*   Checked and unchecked exceptions.
*   Examples of checked and unchecked exceptions.
*   `final`, `finally`, and `finalize`.
*   `final` method.
*   `final` method reference (likely referring to method references to `final` methods).
*   What is the String constant pool?
*   Mention a few `String` class methods.
*   Why is `String` immutable?
*   Different ways of creating `String` objects.
*   Collection hierarchy in Java.
*   Difference between `List` and `Set`.
*   Structure of `Map` implementations (e.g., `HashMap`, `TreeMap`).
*   How values are stored based on hashing (hash functions, collision handling).
*   Java 1.8 features.
*   Different methods of the `Object` class.
*   Different OOPs concepts (Abstraction, Encapsulation, Inheritance, Polymorphism).
*   What is abstraction and encapsulation?
*   What is method overloading and method overriding?

### Data Structures

*   Linked list.

### Coding

*   Check whether a given year is a leap year or not.
*   Inserting a new node in the middle of a linked list.
*   Binary search logic.

### Design Patterns

*   What are the different categories of design patterns (Creational, Structural, Behavioral)?
*   Explain the design patterns you have used and their use cases in your previous projects.

### Spring Framework

*   Spring MVC.
*   Annotations of Spring MVC.
*   What do you know about application security in Spring?
*   How do you set up security in a Spring application?
*   What do you know about SSO (Single Sign-On)?

### Microservices

*   What is JWT (JSON Web Token)?
*   What are the different parts of a JWT token (Header, Payload, Signature)?

### Kafka

*   Have you used Kafka? Explain the business need where you have implemented it.

### System Design

*   Can you design an Amazon e-commerce system (only a web app)?
*   Explain the tech stack that you’ll use for this.

### Generic Questions

*   What are your current roles and responsibilities?
*   Which part do you prefer: dealing with people or working on the technical side of it?


# Oracle Interview Questions (Attempt 2)

These are potential interview questions for Oracle, categorized by level.

## Level 1

### About Project

*   Explain your project and the tech stack you are using.
*   What are your roles and responsibilities in your team?

### Core Java

*   Which version of Java are you using?
*   What are the latest features in Java 21?
*   What are the deprecated features in the Java version you are using?
*   What kind of issues/challenges have you faced while upgrading the Java version in your project?

### Coding

*   Use a `switch` statement/expression to write a program that returns a lottery winning message when the user passes any random number.
*   Write a REST controller with all the necessary annotations.

### Spring Framework

*   What do you know about Maven?
*   How does Maven work?
*   How do you set up Spring Security?

### Database

*   How frequently do you use SQL?
*   Tell us about the different `JOIN` types you have used in your project.

### Kafka

*   Explain how you implemented Kafka.
*   What happens if message processing fails at the consumer end?
*   What happens if the Kafka broker is down?

### Generic Questions

*   Which artifact repository do you use to store your artifacts?
*   What are the `ADD` and `COPY` commands in a Dockerfile?
*   What are Docker and Kubernetes used for?
*   What do you know about Jenkins?

## Level 2

### About Project

*   Explain your project and the tech stack you are using.
*   What are your roles and responsibilities in your team?

### Core Java

*   Which version of Java are you using?
*   Which features excited you the most in Java 21?
*   Which libraries do you use for reducing boilerplate code (e.g., Lombok)?
*   What are association, aggregation, and composition in Java (object relationships)?
*   Is multiple inheritance allowed in Java?
*   How do you implement new features into existing functionality without disturbing existing functionality (e.g., using design patterns, refactoring)?

### Coding

*   Write a complex code snippet using streams, filters, `map`, `flatMap`, `collect`, with nested lists, etc.

### Spring Framework

*   What is the abbreviation for JWT? (JSON Web Token)
*   What are the different parts of a JWT (Header, Payload, Signature)?
*   How is JWT used for authentication and authorization?

### Design Patterns

*   What design patterns have you worked on?

### Generic Questions

*   What are the roles you have taken up in your career?
*   What are the different activities you handle in your team?
*   What are the SOLID principles? Explain them in detail.
*   What kind of role are you looking for?
*   Where do you see yourself in 5 years?
*   Do you follow Agile methodologies?


# Java Interview Preparation for Schindler Electric

This document outlines potential topics and questions you might encounter during a Java interview at Schindler Electric.

---

## 1. Design Patterns and Architecture

You’ll likely be asked to explain how you design resilient systems:

*   "Can you explain the Circuit Breaker design pattern and its role in system resilience?"
*   "What are the different states in the Circuit Breaker pattern, and when do they transition?"
*   "How would you implement a Circuit Breaker using Java and Resilience4j?"
*   "What are the key trade-offs of using microservices over a monolithic architecture?"

---

## 2. Core Java and Java 8 Features

Expect to dive deep into Java 8 features, especially Streams and functional programming:

*   "How would you dynamically segregate data based on the first two characters of a string using Java 8?"
*   "Can you explain the difference between `map()` and `flatMap()` in Streams?"
*   "What are the best practices for using `Optional` to handle null values?"
*   "How do lambda expressions improve code readability?"
*   "When should you use parallel streams, and what are the pitfalls?"

---

## 3. Concurrency and Multithreading

With years of experience, you’ll definitely be quizzed on multithreading and asynchronous programming:

*   "How would you implement a multithreaded application using `ExecutorService`?"
*   "What’s the difference between `volatile` and `synchronized` in Java?"
*   "How does the `ForkJoinPool` work, and when should you use it?"
*   "How can `CompletableFuture` be used to handle asynchronous operations in a non-blocking way?"

---

## 4. Database and Data Handling

Schindler Electric deals with large-scale systems, so you can expect SQL and database optimization questions:

*   "Write a SQL query to find the second highest salary in a table."
*   "How would you optimize a slow-running SQL query?"
*   "Explain how indexing works in databases and how it improves performance."
*   "What are ACID properties, and how do they ensure database consistency?"

---

## 5. Behavioral and Problem-Solving Questions

Apart from technical expertise, your problem-solving and teamwork skills will also be tested:

*   "Can you share a challenging project you worked on and how you managed it?"
*   "How do you prioritize tasks when handling multiple deadlines?"
*   "Describe a situation where you had to learn a new technology quickly—how did you approach it?"
*   "Have you mentored junior developers? How did you help them adopt Java 8 features effectively?"
*   "Can you recall a time when you identified a performance bottleneck in a Java application and how you resolved it?"


