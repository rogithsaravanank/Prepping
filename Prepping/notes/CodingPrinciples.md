## Coding Standards

### SOLID Principles
- Single Responsibility Principle
- Open/ Closed Principle
- Liskov's Substituition Principle
- Interface Segrgation Principle
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
