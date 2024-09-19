## JPA

#### Java Persistence API (JPA) is a specification that defines a standard for object-relational mapping (ORM) in Java. It provides a way to map Java objects to database tables and vice versa, making it easier to work with relational data in a Java application. JPA is part of the Java EE (Enterprise Edition) standard, but it can also be used in Java SE (Standard Edition) applications.

### Key Concepts in JPA:

1. **Entity**:
   - A lightweight, persistent domain object that represents a table in a relational database.
   - Annotated with `@Entity`.
   - Example:
     ```java
     @Entity
     public class Employee {
         @Id
         private Long id;
         private String name;
         private double salary;
         // getters and setters
     }
     ```

2. **Entity Manager**:
   - The primary interface for interacting with the persistence context.
   - Manages the lifecycle of entities, handles queries, and performs CRUD operations.
   - Example:
     ```java
     EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
     EntityManager em = emf.createEntityManager();
     ```

3. **Persistence Unit**:
   - A logical grouping of related entities that are managed together.
   - Defined in the `persistence.xml` file.
   - Example:
     ```xml
     <persistence-unit name="my-persistence-unit">
         <class>com.example.Employee</class>
         <!-- Database connection details -->
     </persistence-unit>
     ```

4. **Annotations**:
   - JPA uses annotations to define the mapping between Java objects and database tables.
   - Common annotations include:
     - `@Entity`: Marks a class as an entity.
     - `@Table`: Specifies the table name in the database.
     - `@Id`: Marks a field as the primary key.
     - `@GeneratedValue`: Specifies the generation strategy for primary keys.
     - `@Column`: Specifies the column name in the table.
     - `@OneToOne`, `@OneToMany`, `@ManyToOne`, `@ManyToMany`: Define relationships between entities.

5. **JPQL (Java Persistence Query Language)**:
   - A query language similar to SQL but operates on entities rather than database tables.
   - Example:
     ```java
     List<Employee> employees = em.createQuery("SELECT e FROM Employee e WHERE e.salary > :salary", Employee.class)
                                  .setParameter("salary", 5000)
                                  .getResultList();
     ```

6. **Transactions**:
   - JPA requires that all database operations be performed within a transaction.
   - Managed using the `EntityTransaction` object.
   - Example:
     ```java
     em.getTransaction().begin();
     em.persist(employee);
     em.getTransaction().commit();
     ```

### Example of Using JPA:

```java
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private double salary;

    // Getters and setters
}

public class JpaExample {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        // Create a new employee
        Employee employee = new Employee();
        employee.setName("John Doe");
        employee.setSalary(7500);

        // Persist the employee
        em.getTransaction().begin();
        em.persist(employee);
        em.getTransaction().commit();

        // Query the employee
        Employee foundEmployee = em.find(Employee.class, employee.getId());
        System.out.println("Found employee: " + foundEmployee.getName());

        em.close();
        emf.close();
    }
}
```

### Benefits of Using JPA:

- **Object-Relational Mapping**: Simplifies the mapping of Java objects to database tables.
- **Portability**: JPA is database-agnostic, meaning the same code can be used with different databases.
- **Productivity**: JPA reduces boilerplate code, making development faster and more efficient.
- **Maintainability**: Using JPA annotations makes the codebase cleaner and easier to maintain.

JPA is commonly used in combination with frameworks like Hibernate, which is a JPA implementation that provides additional features beyond the specification.

