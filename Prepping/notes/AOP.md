## AOP
- 1.21.05
- Aspect
- Join point 
- Advice
- Pointcut
- Weaving


Sure! Let's dive into **Spring Boot AOP** using the same toy car analogy, but with real-world coding details in a Spring Boot environment.

### Scenario:
Imagine you're developing a Spring Boot application where certain methods need extra actions, like logging, security checks, or performance monitoring, but you don't want to clutter every method with these additional tasks.

Instead, you can use **Spring Boot AOP** to automatically apply these tasks before, after, or around certain methods.

### Steps in Spring Boot AOP

1. **Create the Main Service (CarService)**: This is where the main business logic (driving and parking cars) happens.
2. **Create the Aspect (LoggingAspect)**: This is the "magic helper" that will log certain activities without modifying the core logic.
3. **Use AOP to Automatically Apply the Aspect**: Spring Boot's AOP will handle calling this aspect before or after the methods you choose.

### Example in Spring Boot AOP

#### 1. **Main Code (CarService)**

This class represents your business logic where you drive or park the car. It's a typical Spring Boot service class.

```java
import org.springframework.stereotype.Service;

@Service
public class CarService {
    
    public void drive() {
        System.out.println("Driving the car!");
    }

    public void park() {
        System.out.println("Parking the car!");
    }
}
```

Here, the methods `drive()` and `park()` represent the main actions you are performing.

#### 2. **Aspect Class (LoggingAspect)**

This class contains the **aspect** that will add extra functionality (logging) before the car methods are executed. It uses annotations provided by Spring AOP.

```java
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // This method runs before any method in CarService is executed
    @Before("execution(* com.example.CarService.*(..))")
    public void logBefore() {
        System.out.println("Check if the car is clean!");
    }
}
```

#### 3. **Application Setup**

In your **Spring Boot application**, AOP is automatically enabled, so you don’t need to do much configuration. Just make sure you have the necessary Spring AOP dependencies in your `pom.xml` if you're using Maven:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-aop</artifactId>
</dependency>
```

### How it Works:

1. **CarService** contains the business logic: driving and parking cars.
2. **LoggingAspect** is the aspect that logs a message before each method in `CarService` is executed. It uses the `@Before` annotation to ensure the `logBefore()` method runs before every method in `CarService`.
3. **Spring AOP** automatically applies the aspect to the relevant methods in `CarService` based on the pointcut expression.

### Output:

When you call the `drive()` method:
```java
carService.drive();
```

The output will be:
```
Check if the car is clean!
Driving the car!
```

When you call the `park()` method:
```java
carService.park();
```

The output will be:
```
Check if the car is clean!
Parking the car!
```

### Key Components of Spring Boot AOP:

1. **Aspect (`@Aspect`)**: This is the "sticker" (extra functionality) that you apply around your main business logic. In this case, it's logging a message before each method in `CarService`.
  
2. **Advice (`@Before`, `@After`, etc.)**: These are the points where the aspect is applied. In this case, `@Before` means the aspect runs before the `drive()` or `park()` methods are executed. @AfterReturning --> executes only after returing,@AfterThrowing --> Executed oly when it throws a error,@After --> represents finally block it will always be executed.

  
3. **Pointcut (`execution(* com.example.CarService.*(..))`)**: This defines *where* the aspect should be applied. It tells Spring AOP to apply the aspect to every method in `CarService`.

### Summary:

In **Spring Boot AOP**, you can add extra behavior (like logging or security checks) without changing the actual methods. Just like having a magic helper that checks if your car is clean before driving it, you can have Spring Boot automatically apply certain actions before or after your main methods by defining **aspects**.


Let's break down the key concepts of **AOP (Aspect-Oriented Programming)** in a simple and easy-to-understand way, using a relatable analogy.

### Imagine this Scenario:
You're running a busy restaurant, and while you're focused on preparing the food (your main task), there are other tasks that need to be done, like cleaning the kitchen, checking the quality of ingredients, or greeting customers. Instead of doing these tasks **every single time** for each dish, you'd want an automatic way of handling them whenever required.

**AOP** is like hiring a helper to automatically take care of those additional tasks, so you can focus on cooking the food (your main code).

----------------------------------@-----------------------------------------------@----------------------------------@-----------------------------------

### Key Concepts in AOP

1. **Aspect**:
   - This is the **helper** that handles the extra tasks (like cleaning the kitchen or checking ingredients).
   - In code, it’s a class that defines what extra behavior (logging, security, transactions, etc.) should happen and when.
   - **Example**: A logging aspect might log every time a customer places an order.

2. **Advice**:
   - This is **when** your helper will do their work. It’s the **action** that the aspect performs at a certain point in your code.
   - There are different types of advice based on timing:
     - **Before Advice**: The helper does something **before** you cook the food.
     - **After Advice**: The helper does something **after** you’ve finished cooking.
     - **Around Advice**: The helper does something **both before and after** the cooking.
   - **Example**: A logging advice could log "Order started" before an order is processed and "Order completed" afterward.

3. **Join Point**:
   - This is **anywhere** in your code where something can happen (like when you start cooking or serve a dish). It’s the point where extra action could be taken.
   - In Spring AOP, a join point is usually a method that is being called.
   - **Example**: The moment you start cooking a dish is a join point, where you could apply some additional action, like quality checking.

4. **Pointcut**:
   - This is like a **rule** that tells the helper where exactly to step in and take action. It defines which specific tasks (methods) should trigger the extra work.
   - **Example**: You may decide that the helper only needs to check the ingredients when making pasta, but not when making a salad. This is what a pointcut does: It specifies that the helper should only act for specific methods.
   - In code, it’s an expression that matches methods for the aspect to be applied.

5. **Target Object**:
   - This is the **main code** or the object where the real action is happening (like cooking in our restaurant example). It’s the class whose methods are being intercepted to apply the aspect.
   - **Example**: The target object in a restaurant could be the chef preparing the dish.

6. **Weaving**:
   - This is the **process** of putting everything together. The weaving happens when Spring AOP applies the aspect (the helper) to the target object (your methods).
   - **Example**: When you hire the helper to start checking ingredients before cooking, this is similar to weaving in AOP.

---

### Important 
### Simple Example of AOP in Action

Let’s say you’re writing code for an online store, and you want to log whenever someone makes a purchase. Instead of adding a logging line to every method where purchases happen, you can use AOP to **automatically log** before and after every purchase.

Here’s how the concepts fit together:

1. **Aspect**: The helper who logs the information about purchases.
2. **Advice**: The logging that happens **before** and **after** a purchase.
3. **Join Point**: Any method in your store where a purchase happens.
4. **Pointcut**: The rule that says, "Log only when a purchase method is called."
5. **Target Object**: The method that processes the purchase.
6. **Weaving**: Spring Boot automatically inserts the logging before and after the purchase method.

---

### Example in Simple Terms:

**Before AOP**: You would write something like this in every purchase-related method:
```java
System.out.println("Purchase started");
processPurchase();
System.out.println("Purchase completed");
```

**With AOP**:
1. The **aspect** defines a logging task.
2. The **advice** says to log before and after any purchase.
3. The **pointcut** says to apply this only to methods related to purchases.
4. **Weaving** applies this logging automatically without you needing to change your main code.

Now, whenever someone makes a purchase, the logging happens automatically without cluttering your code with repeated log statements.

---

### Summary of Key Concepts:
- **Aspect**: The helper that adds extra behavior.
- **Advice**: When the extra behavior happens (before, after, etc.).
- **Join Point**: Any place in the code where extra behavior could happen.
- **Pointcut**: The rule that decides where exactly to apply the aspect.
- **Target Object**: The main code (like the methods you’re enhancing).
- **Weaving**: The process of applying the aspect to the code.

With AOP, you keep your main code clean, and all the extra stuff happens behind the scenes, like having a magic helper!


## properties
- Application.properties --> logging.level.root=info/debug/warn
- logging.file=app.log
- 

