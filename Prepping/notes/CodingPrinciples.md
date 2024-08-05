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
- 