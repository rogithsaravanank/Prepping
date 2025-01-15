## Coding Standards

### SOLID Principles
- Single Responsibility Principle
- Open/ Closed Principle
- Liskov's Substituition Principle
- Interface Segrigation Principle
- Dependancy Inversion Principle

### Single Responsibility Principle
- High cohesion between the mehtods within the class. Cohesion is degree to which various parts of software components are related.
- Coupling it is a level of interdependancy within the software components.
- Tight coupling is bad for the code.
- Every software component should have one and only one responsibility.
- Every software component should have one and only one reason to change.


### Open/ Closed Principle
- Software components should be closed for modification and open for extension.
- New feature should not modify existing code , But can add a new behaviour by adding a new component
- Adding an interface to have the methods which can cause code redundancy.
- Ease of adding new feature, **Insurance** bike,home , health


### Liskov's Substituition Principle
- Object's should be replaceable with their subtypes without affecting the correctness of the program.
- Is-A relationships can be wrong at times
- Example : Consider **Bird** class with fly method , Parrot class will extend bird class and Ostrich method will extend bird class, But Ostritch cannot implement the fly method as it cannot fly.
- In such cases there should be generic classes to override the errors happening. By breaking down the hierarchy
- Tell don't ask pattern - Amazon's inhouse products get high discount

### Interface Segregation Principle
- No clients should be forced to use a method which they do not use.
- Interfaces can be split based on the need
- **Printer** interface has fax, scan, print methods but some machine are capable of only one thing and some are all the functions in this case the interface should be segregated based on the requirement.
- Violation of ISP ---> Fat interfaces, interfaces with low cohesion, un implemented methods

### Dependancy Inversion Principle 
- High level modules should not depend on low level modules both should depend on Abstraction
- Abstraction should not depend on details , Details should depend on abstractions
- [DI ](images/DI_code.jpeg)
- [Sample](images/DI_example.jpeg)


**Problem Identification:**

1. **Object Creation:** If your problem is related to creating objects, consider these patterns:
    - **Singleton:** Ensure only one instance of a class exists.
    - **Factory Method:** Delegate object creation to subclasses.
    - **Abstract Factory:** Create families of related objects.
    - **Prototype:** Create objects by cloning existing ones.
    - **Builder:** Construct complex objects step-by-step.

2. **Object Assembly:** If your problem is related to how objects are composed, consider these patterns:
    - **Adapter:** Adapt incompatible interfaces.
    - **Bridge:** Separate an abstraction from its implementation.
    - **Composite:** Treat individual objects and compositions of objects uniformly.
    - **Decorator:** Add responsibilities to objects dynamically.
    - **Facade:** Provide a simplified interface to a complex system.
    - **Flyweight:** Share objects to reduce memory usage.
    - **Proxy:** Control access to an object.

3. **Object Interactions:** If your problem is related to how objects interact with each other, consider these patterns:
    - **Observer:** Notify multiple objects of changes.
    - **Strategy:** Encapsulate algorithms for interchangeable behavior.
    - **Command:** Encapsulate a request as an object.
    - **State:** Change an object's behavior based on its internal state.
    - **Visitor:** Add operations to object structures without modifying them.
    - **Memento:** Capture and restore object states.
    - **Iterator:** Provide a way to access elements of a collection sequentially.
    - **Mediator:** Centralize communication between objects.
    - **Chain of Responsibility:** Pass requests along a chain of handlers.
    - **Template Method:** Define a skeleton algorithm with steps to be filled in by subclasses.

**Remember:**

* **Context Matters:** The best pattern for a particular problem depends on the specific context and requirements.
* **Trade-offs:** Consider the trade-offs between different patterns in terms of complexity, performance, and maintainability.
* **Learn and Experiment:** Practice using different patterns to gain experience and develop intuition.

By understanding these patterns and their applications, you can make informed decisions about how to design your software effectively.


## ACID

### Atomicity - all or nothing

### Consistency - Data should be consistent across all the datasets

### Isolation - Isolating the failure to prevent a cascading effect of failures

### Durability - Once transaction is committed the changes are permanent even in the time of system failures

## CAP Theorem - Always has Availabilty and Partial tolerance to sacrifice consistency

### Consistency

### Availability

### Partial Tolerance 

## Commonly Used Java Design Patterns

As a Java developer, here are the most commonly used design patterns, categorized by their types:

---

## 1. Creational Design Patterns

These deal with object creation.

*   **Singleton:** Ensures a class has only one instance and provides a global access point.
    *   Example: Logger, Configuration classes, Database connection pool.
*   **Factory Method:** Provides an interface for creating objects but allows subclasses to alter the type of objects created.
    *   Example: `DocumentFactory` for creating `PDFDocument` or `WordDocument`.
*   **Builder:** Constructs a complex object step by step, providing a clear API for its construction.
    *   Example: Creating immutable objects like `StringBuilder` or Lombok's `@Builder`.
*   **Prototype:** Creates a new object by copying an existing object.
    *   Example: Cloning objects with `Cloneable`.

---

## 2. Structural Design Patterns

These focus on object composition and relationships.

*   **Adapter:** Allows incompatible interfaces to work together.
    *   Example: Wrapping legacy APIs to make them compatible with modern interfaces.
*   **Decorator:** Dynamically adds new behavior to an object without altering its structure.
    *   Example: Java I/O classes like `BufferedReader` and `FileReader`.
*   **Proxy:** Provides a placeholder for another object to control access.
    *   Example: Lazy initialization, security proxies, or caching.
*   **Composite:** Composes objects into tree structures to represent part-whole hierarchies.
    *   Example: File system structure with folders and files.

---

## 3. Behavioral Design Patterns

These deal with communication between objects.

*   **Observer:** Defines a one-to-many dependency between objects so that when one object changes state, all dependents are notified.
    *   Example: Event listeners in Java (e.g., `PropertyChangeListener`).
*   **Strategy:** Defines a family of algorithms, encapsulates each one, and makes them interchangeable.
    *   Example: Sorting strategies like `BubbleSort` or `MergeSort`.
*   **Command:** Encapsulates a request as an object, allowing parameterization of clients.
    *   Example: Task scheduling and undo functionality.
*   **Template Method:** Defines the skeleton of an algorithm in a superclass, letting subclasses fill in specific steps.
    *   Example: `HttpServlet` class in Java.
*   **Iterator:** Provides a way to access elements of a collection sequentially without exposing its internal structure.
    *   Example: `Iterator` and `ListIterator` in Java Collections.

---

## Most Commonly Used Patterns in Enterprise Applications:

*   **Singleton:** For application-level configurations.
*   **Factory Method:** For creating objects dynamically.
*   **Builder:** For constructing complex objects.
*   **Proxy:** For AOP in Spring.
*   **Observer:** For event-driven systems.
*   **Strategy:** For flexible algorithm switching.

These patterns provide flexibility, scalability, and maintainability in software design.
