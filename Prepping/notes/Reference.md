# Java and Microservices Notes

## Table of Contents

1. [Features of Java 8](#features-of-java-8)
2. [Concurrent HashMap](#concurrent-hash-map)
3. [Vertex](#vertex)
4. [REST API](#rest-api)
5. [Endpoint](#endpoint)
6. [HTTP Methods](#http-methods)
7. [URI](#uri)
8. [REST Features](#rest-features)
9. [Statelessness in REST](#statelessness-in-rest)
10. [Status Codes](#status-codes)
11. [Disadvantages of REST](#disadvantages-of-rest)
12. [SOAP](#soap)
13. [REST vs SOAP](#rest-vs-soap)
14. [Idempotent](#idempotent)
15. [Microservices](#microservices)
16. [Why Microservices](#why-microservices)
17. [Cons of Microservices](#cons-of-microservices)
18. [API Gateway](#api-gateway)
19. [Service Discovery](#service-discovery)
20. [Communication Between Microservices](#communication-between-microservices)
21. [Kafka](#kafka)
22. [Packages](#packages)
23. [Communication Between Microservices: Sync vs Async](#communication-between-microservices-sync-vs-async)
24. [JDK, JRE, JVM](#jdk-jre-jvm)
25. [Class Loading in Java](#class-loading-in-java)
26. [Wrapper Classes](#wrapper-classes)
27. [Autoboxing and Unboxing](#autoboxing-and-unboxing)
28. [Integer Cache](#integer-cache)
29. [Casting](#casting)
30. [Strings in Java](#strings-in-java)
31. [StringBuffer and StringBuilder](#stringbuffer-and-stringbuilder)
32. [String Storage](#string-storage)
33. [Class](#class)
34. [Object](#object)
35. [toString()](#tostring)
36. [equals()](#equals)
37. [hashCode()](#hashcode)
38. [Overriding equals and hashCode](#overriding-equals-and-hashcode)
39. [Inheritance](#inheritance)
40. [Method Overloading](#method-overloading)
41. [Method Overriding](#method-overriding)
42. [Super Class Reference](#super-class-reference)
43. [Multiple Inheritance](#multiple-inheritance)
44. [Diamond Problem](#diamond-problem)
45. [Interface](#interface)
46. [Using Interface](#using-interface)
47. [Interface Variables](#interface-variables)
48. [Extending Interfaces](#extending-interfaces)
49. [Abstract Class](#abstract-class)
50. [Abstract Method](#abstract-method)
51. [Interface vs Abstract Class](#interface-vs-abstract-class)
52. [Constructor](#constructor)
53. [Types of Constructors](#types-of-constructors)
54. [Constructor Chaining](#constructor-chaining)
55. [super()](#super)
56. [this()](#this)
57. [Polymorphism](#polymorphism)
58. [Types of Polymorphism](#types-of-polymorphism)
59. [Coupling](#coupling)
60. [Cohesion](#cohesion)
61. [Encapsulation](#encapsulation)
62. [Final Keyword](#final-keyword)
63. [Static Keyword](#static-keyword)
64. [Exception Handling](#exception-handling)
65. [finally Block](#finally-block)
66. [try without catch or finally](#try-without-catch-or-finally)
67. [Custom Exception](#custom-exception)
68. [Enum](#enum)
69. [Assert](#assert)
70. [Garbage Collection](#garbage-collection)
71. [Initialization Blocks](#initialization-blocks)
72. [Serialization](#serialization)
73. [File Input and Output](#file-input-and-output)
74. [Transient Keyword](#transient-keyword)
75. [Collections](#collections)
76. [Set](#set)
77. [List](#list)
78. [Queue](#queue)
79. [WeakHashMap](#weakhashmap)
80. [Design Patterns](#design-patterns)
81. [Encapsulation](#encapsulation-1)
82. [Abstraction](#abstraction)
83. [Inheritance](#inheritance-1)
84. [Polymorphism](#polymorphism-1)
85. [Composition](#composition)
86. [Association](#association)
87. [Dependency Inversion](#dependency-inversion)

## Features of Java 8

- Streams
- Lambda expressions
- Functional Programming

## Concurrent HashMap

- Multi-threading

## Vertex

## REST API

- Representational State Transfer Application Programming Interface

## Endpoint

- Simple URL through which you can use API

## HTTP Methods

- GET
- POST (NEW)
- PUT (Modify)
- DELETE

## URI

- Uniform Resource Identifier: To identify each resource in a REST architecture

## REST Features

- Client-server model
- URI
- Messaging between client and server

## Statelessness in REST

- Client state not maintained by the system
- Client session identified by Session identifier

## Status Codes

- 1XX: Information response
- 2XX: Success
- 3XX: Redirect
- 4XX: Client error
- 5XX: Server error

## Disadvantages of REST

- Security is not available inherently
- Cannot store sessions

## SOAP

- Simple Object Access Protocol
- Slow
- Strict Standards
- XML

## REST vs SOAP

- REST: Fast, Standard not available, XML, HTTP, JSON

## Idempotent

- Single request multiple times but the response should be same. Example: PUT methods.

## Microservices

- Multiple services communicate with each other and are loosely coupled
- Independently developed and deployed
- Uses polyglot architecture
- Decentralization
- Security (RBAC - Role Based Access model)
- Independent

## Why Microservices

- Modernizing legacy applications
- Better scalability
- Faster development
- Cloud-native development
- Distinct services can be developed and deployed maintained separately

## Cons of Microservices

- Communication between microservices is complex
- Requires a large number of people
- Increased efforts in configurations and operations

## API Gateway

- Entry point for each request received from clients and it carries the routing towards the services

## Service Discovery

- Eureka, Netflix OSS: way applications and microservices locate each other on a network

## Communication Between Microservices

- Synchronous: client waits for the response (e.g., RestTemplate, gRPC)
- Asynchronous: Kafka (KafkaTemplate.send), RabbitMQ (RabbitTemplate.convertAndSend with @RabbitListener)

## Kafka

- Distributed streaming platform for real-time data pipelines
- Producer: sends record to Kafka topic
- Consumer: reads the record from Kafka topic

## Packages

- Controller
- Services
- Entities
- Repository

## Communication Between Microservices: Sync vs Async

- Sync: when you need immediate response, tolerance is available, services are internal
- Async: decoupled services and high throughput

## JDK, JRE, JVM

- JDK: Java Development Kit
- JRE: Java Runtime Environment
- JVM: Bytecode to machine code

## Class Loading in Java

- System class loader
- Extension class loader
- Bootstrap class loader

## Wrapper Classes

- Encapsulate primitive data types
- Immutable classes
- Examples: int to Integer, long to Long, char to Character, boolean to Boolean

## Autoboxing and Unboxing

- Autoboxing: converting the primitive to corresponding wrapper classes (int to Integer)
- Unboxing: converting the wrapper class to respective primitive data types

## Integer Cache

- Only object references are compared using `==`
- Integer Cache range: -127 to 127

## Casting

- Converting one datatype into another
- Implicit (Widening conversion): int to long (handled by compiler)
- Explicit (Narrowing conversion): long to int (handled by code)

## Strings in Java

- Strings are immutable
- Modifying a string creates a new instance
- Example: concat() method is thread-safe

## StringBuffer and StringBuilder

- Mutable
- Not thread-safe

## String Storage

- Strings are stored in the String constant pool, which is a heap memory
- Reusability is possible if new instance is not created

## Class

- Template consisting of behavior and state of objects

## Object

- Instance of a class

## toString()

- Prints the contents of the object
- Default method prints the name of the class and location

## equals()

- Symmetric, reflexive, consistent
- Compares the content of the objects

## hashCode()

- Generates hashcode for an object
- Provides an efficient way to locate an object in a collection
- If `equals` is overridden, `hashCode` should be overridden too to maintain the general contract of hashCode: equal objects must have equal hashCode


## Inheritance

- Acquires the property and methods of another class.
- Example: `HashMap` extends `AbstractMap`.

## Method Overloading

- Methods having the same name with different parameters.
- In the same class or the extending class.

## Method Overriding

- Methods are overridden in the subclass.
- Subclass overrides superclass methods.

## Super Class Reference

- Super class reference variable can hold the object of subclass.
- Example: `Object obj = new Person();`.

## Multiple Inheritance

- Java does not support multiple inheritance to avoid the diamond problem.
- Supports multiple inheritance through interfaces.

## Diamond Problem

- A -> B, C -> D.

## Interface

- Contracts of responsibilities of the class.
- Example: `Map` interface.

## Using Interface

- Implements multiple interfaces can be implemented by a class.

## Interface Variables

- Variables in interface are `public`, `static`, and `final`.
- If `private` is used, it results in a compiler error.
- Methods are `public` and `abstract`.

## Extending Interfaces

- Interface cannot extend a class, but it can extend another interface.

## Abstract Class

- Provides a default implementation.
- Abstract keyword.
- Restricted class which cannot be used to create an object.
- To use an abstract class, it needs to be inherited by another class.
- Example: In a banking application, use `deposit()` and `withdraw()` methods in an abstract class used by subclasses like `SavingsAccount` and `CurrentAccount`.

## Abstract Method

- Method without a body.
- Body should be provided by the subclass.

## Interface vs Abstract Class

- Implements functionality and public.
- Abstract class: Provides a default implementation, a restricted class which cannot be used to create an object, needs to be inherited by another class.
- Interface: Contracts of responsibilities of the class.

## Constructor

- Invoked as an instance of the object of the class.
- We cannot create an object without a constructor.
- Has no return type.

## Types of Constructors

- Default.
- Parameterized.
- No argument constructor.

## Constructor Chaining

- Constructor can only be called by another constructor.
- Should always be called in the first line of the constructor.

## `super()`

- For calling the superclass constructor.

## `this()`

- Another constructor from the same class can be called by this keyword.

## polymorphism

- Ability of a message to be displayed in more than one form.

## Types of Polymorphism

- Compile time (Overloading).
- Runtime (Overriding, Interfaces).

## Overloading

- Same method name but different parameters.

## Overriding

- Super class methods can be overridden in the subclass to behave differently.

## Coupling

- How much one class is dependent on another class.
- Low coupling is always good.
- By using interface to inject dependencies.

## Cohesion

- Measure of how related the responsibilities of the class are.
- Should be high.

## Encapsulation

- Bundling of data and methods into a single unit as a class.
- Data hiding (hiding the internal state of the object) and access modifiers (public, private).

## Final Keyword

- Methods cannot be overridden.
- Assigned values cannot be changed.
- Example: Pi.

## Static Keyword

- Class-level variables which can be changed with their required instances.
- Only one copy in the entire class.
- Initialization is not required.

## Exception Handling

- Process to handle the runtime errors, allowing the program to execute without interruption.
- Keywords: `try`, `catch`, `finally` (always executes).

## `finally` Block

- `finally` will not execute only when the JVM crashes or `finally` consists of any exception.

## `try` without `catch` or `finally`

- `try` is not allowed without `catch` or `finally`.
- Either one of them should be there.

## Custom Exception

- By extending the `Exception` class or `RuntimeException`.
- Multiple local exceptions can be handled in the same place.

# Java Notes

## Assert
- Validates assumptions in your program’s state during development and test.

## Garbage Collection
- Automatic memory management when memory on heap is low.
- Example: GC, Z garbage has lower pause time.

## Initialization Blocks
- Initialize instance variable of a class.
- Instance initialization and static initialization (executed without an instance created).

## Serialization
- State of object to byte stream to transport over network.
- Used while caching: storing objects in memory for faster access.

## File Input and Output
- `FileInputStream`, `ObjectInputStream`: `readObject()`.
- `FileOutputStream`, `ObjectOutputStream`: `writeObject()`.

## Transient Keyword
- Cannot be serialized.

## Collections
- Arrays are not dynamic, and sizing cannot be modified, hence formed Collections when data is dynamic.

### Set
- Unique items can only be added.
- `TreeSet`: Sorted naturally.

### List
- Position is important.
- Insertion order is maintained.
- `ArrayList`: Not thread-safe, insertion and deletion are slow.
- `LinkedList`: Insertion and deletion are fast, iteration is slower than `ArrayList`.
- `Vector`: Same as `ArrayList`, thread-safe.

### Queue
- Added in order of processing.

### WeakHashMap
- Weak references for keys.
- Kind of `HashMap` which stores the key and value only for a certain amount of time; it will be obsolete and will be garbage collected.
- Majorly used for storing temporary cache.

## Design Patterns
- Singleton Pattern.
- Façade Pattern.
- Strategy Pattern.
- Decorator Pattern.
- Observer Pattern.

## Encapsulation
- Bundles data and methods in a single unit.
- Protects data from outside interference and misuse.
- Example: A class `Car` with private attributes like `speed` and `fuel`, and public methods like `accelerate` and `brake`.

## Abstraction
- Hides complex implementation details, exposing only the necessary information.
- Simplifies code interaction and reduces complexity.
- Example: A `Database` interface with methods `connect` and `query`, hiding the details of SQL or NoSQL operations.

## Inheritance
- Allows a class to inherit properties and behaviors from another class.
- Promotes code reuse and reduces redundancy.
- Example: A `Vehicle` class inherited by `Car` and `Bike` classes, sharing common properties like `engine` and methods like `start`.

## Polymorphism
- Objects of different types can be treated as the same type.
- Enables flexible and modular code.
- Example: A method `draw` that can work with objects of `Circle`, `Square`, and `Triangle` classes.

## Composition
- Combines simpler objects to create complex ones.
- Enhances code maintainability and flexibility.
- Example: A `House` class composed of `Room` objects like `Kitchen`, `Bedroom`, and `Bathroom`.

## Association
- Relationship between two objects where one uses or depends on the other.
- Defines how objects interact with each other.
- Example: A `Library` class is associated with `Book` class where the library contains books.

## Dependency Inversion
- High-level modules should not depend on low-level modules; both should depend on abstractions.
- Reduces coupling between code and enhances flexibility.
- Example: A `Payment Processor` class depends on an `IPaymentGateway` interface instead of concrete implementations like `PayPal` or `Stripe`.


## Enum

- Provides structured and defined set of constants.
- Example:

```java
public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
## Overriding equals and hashCode

```java
@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Person person = (Person) obj;
    return age == person.age && Objects.equals(name, person.name);
}

@Override
public int hashCode() {
    return Objects.hash(name, age);
}```
