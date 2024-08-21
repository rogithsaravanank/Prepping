## Hibernate - ORM Tool


### Annotation
- `@Embeddable` --> Used to embed a class to incorporate the fields into another table. Example: Name field in Student class(Entity) will have Name class(Enclosed with Embeddable) with three attributes firstName, Lastname, Surname.
- `@Column(name="columnname")`
- `@Table(name="tablename")`
- `@Id` --> primary key
- `@GeneratedValue` --> Auto generation of value
- `@Transient` --> Will not store the column
- **`@OneToOne`**: One-to-one relationship between two entities. Example: User and Profile.
- **`@OneToMany`**: One-to-many relationship where one entity has multiple associated entities. Example: Department and Employees.
- **`@ManyToOne`**: Many-to-one relationship where many entities are associated with one entity. Example: Employees and Department.
- **`@ManyToMany`**: Many-to-many relationship where entities are associated with multiple instances of another entity. Example: Students and Courses.


### ORM - Object Relational Mapping
- ORM is a technique that maps the data representation from an object model to a relational data model 
- Purpose: It eliminates the need for developers to write SQL queries to perform CRUD (Create, Read, Update, Delete) operations.

Hibernate is an object-relational mapping (ORM) framework for Java. It simplifies the interaction between Java applications and relational databases by mapping Java objects to database tables. Here are some of the basics:

### 2. **Hibernate Core Components**
   - **Configuration**: Hibernate uses a configuration file (`hibernate.cfg.xml`) to define how it connects to the database, manages sessions, and maps classes to database tables.
   - **SessionFactory**: A thread-safe, heavyweight object that is responsible for creating and managing `Session` objects. It's typically created once per application.
   - **Session**: A lightweight, non-thread-safe object that represents a connection between the application and the database. It provides methods to create, read, update, and delete objects.
   - **Transaction**: Manages the atomicity and isolation of a series of operations. Transactions ensure that all operations within a session are executed as a single unit.
   - **Query**: Used to perform database operations like retrieving data. Hibernate supports HQL (Hibernate Query Language), which is similar to SQL but works with Java objects instead of tables.

### 3. **Mapping**
   - **Entity Classes**: Java classes that are mapped to database tables. Each entity represents a table, and its fields represent the columns.
   - **Annotations**: Hibernate uses annotations or XML to define the mapping between Java classes and database tables.
     - `@Entity`: Marks a class as an entity.
     - `@Table`: Specifies the table name if it's different from the class name.
     - `@Id`: Marks a field as the primary key.
     - `@GeneratedValue`: Specifies how the primary key value is generated.
     - `@Column`: Maps a field to a specific column in the table.
   
   Example:
   ```java
   @Entity
   @Table(name = "Employee")
   public class Employee {
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Long id;
       
       @Column(name = "name")
       private String name;
       
       @Transient //Will not store the column
       private Double salary;
       
       // Getters and setters
   }
   ```

### 4. **Hibernate Query Language (HQL)**
   - **Definition**: HQL is an object-oriented query language similar to SQL but works with objects rather than tables.
   - **Example**:
     ```java
     String hql = "FROM Employee E WHERE E.salary > 1000";
     Query query = session.createQuery(hql);
     List<Employee> results = query.list();
     ```

### 5. **Basic CRUD Operations**
   - **Create**: Saving a new object in the database.
     ```java
     Employee employee = new Employee();
     employee.setName("John");
     employee.setSalary(5000.0);
     session.save(employee);
     ```
   - **Read**: Retrieving objects from the database.
     ```java
     Employee employee = session.get(Employee.class, 1L);
     ```
   - **Update**: Modifying existing objects.
     ```java
     employee.setSalary(6000.0);
     session.update(employee);
     ```
   - **Delete**: Removing objects from the database.
     ```java
     session.delete(employee);
     ```

### 6. **Session Management**
   - A `Session` object is used to create, read, update, and delete objects in a database.
   - Sessions are not thread-safe and should be created and closed for each unit of work (typically a single transaction).
   - Transactions can be managed using `session.beginTransaction()` and `transaction.commit()`.

### 7. **Caching**
   - **First-Level Cache**: Hibernate's first-level cache is associated with the `Session` object and is enabled by default. It caches objects within the same session.
   - **Second-Level Cache**: This is associated with the `SessionFactory` and can be configured to cache objects across sessions.

### 8. **Advantages of Hibernate**
   - **Database Independence**: Hibernate abstracts the database-specific code, making it easier to switch databases.
   - **Less Code**: Reduces the amount of boilerplate code needed for database operations.
   - **Automatic Table Generation**: Hibernate can automatically generate database tables based on the entity mappings.
   - **Lazy Loading**: Loads only the data that is needed, reducing the load on the database.

### 9. **Common Annotations**
   - `@Entity`
   - `@Table`
   - `@Id`
   - `@GeneratedValue`
   - `@Column`
   - `@OneToOne`, `@OneToMany`, `@ManyToOne`, `@ManyToMany` for relationships.

### 10. **Configuration**
   - Hibernate configurations are typically provided in the `hibernate.cfg.xml` file, which includes database connection details, dialect, and other properties.

### Example Configuration (`hibernate.cfg.xml`):
```xml
<hibernate-configuration>
    <session-factory>
        <property name="hibernate.dialect">org.hibernate.dialect.MySQLDialect</property>
        <property name="hibernate.connection.driver_class">com.mysql.jdbc.Driver</property>
        <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/yourdb</property>
        <property name="hibernate.connection.username">root</property>
        <property name="hibernate.connection.password">password</property>
        <property name="hibernate.hbm2ddl.auto">update</property>
        <property name="hibernate.show_sql">true</property>
    </session-factory>
</hibernate-configuration>
```

Hibernate simplifies database interactions in Java applications, allowing developers to focus more on business logic rather than database management.

### Session 
```Session session = HibernateUtil.getSessionFactory().openSession();

session.beginTransaction();

Employee employee = new Employee();
employee.setName("John");
employee.setSalary(5000.0);
session.save(employee);

session.getTransaction().commit();

session.close();

```

- **SessionFactory:** Created once at application startup and used to create Session objects.

- **Session:** Created for each unit of work (typically a transaction) and closed afterward.

- **Transaction:** Ensures that all operations within the session are executed atomically.

This pattern is common in Hibernate applications to manage database sessions and transactions effectively.

These annotations in Hibernate (and JPA) are used to define relationships between entities in a relational database. Each one specifies a different type of relationship between two entities. Here's what each annotation means:

### 1. **`@OneToOne`**
   - **Definition**: A `@OneToOne` relationship is used when one entity is associated with exactly one instance of another entity.
   - **Example**: A `User` has one `Profile`.
   - **Mapping**:
     - The `@OneToOne` annotation is applied to both sides of the relationship, but typically one side is the owner (which contains the foreign key).
     - The `@JoinColumn` annotation is used to specify the foreign key column.
     
   - **Example**:
     ```java
     @Entity
     public class User {
         @Id
         @GeneratedValue(strategy = GenerationType.IDENTITY)
         private Long id;
         
         @OneToOne(cascade = CascadeType.ALL)
         @JoinColumn(name = "profile_id")
         private Profile profile;

         // getters and setters
     }

     @Entity
     public class Profile {
         @Id
         @GeneratedValue(strategy = GenerationType.IDENTITY)
         private Long id;
         
         @OneToOne(mappedBy = "profile")
         private User user;

         // getters and setters
     }
     ```
   - **Key Points**:
     - **Uni-directional**: Only one entity knows about the relationship.
     - **Bi-directional**: Both entities know about the relationship.

### 2. **`@OneToMany`**
   - **Definition**: A `@OneToMany` relationship is used when one entity is associated with multiple instances of another entity.
   - **Example**: A `Department` has many `Employees`.
   - **Mapping**:
     - The `@OneToMany` annotation is applied on the parent side (e.g., `Department`), and the child side contains the foreign key.
     - The `@JoinColumn` or `@JoinTable` annotation is used to define the foreign key or join table.
     
   - **Example**:
     ```java
     @Entity
     public class Department {
         @Id
         @GeneratedValue(strategy = GenerationType.IDENTITY)
         private Long id;
         
         @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
         private List<Employee> employees;

         // getters and setters
     }

     @Entity
     public class Employee {
         @Id
         @GeneratedValue(strategy = GenerationType.IDENTITY)
         private Long id;
         
         @ManyToOne
         @JoinColumn(name = "department_id")
         private Department department;

         // getters and setters
     }
     ```
   - **Key Points**:
     - **Bi-directional**: The parent entity has a `@OneToMany` annotation and the child entity has a `@ManyToOne` annotation.
     - The `mappedBy` attribute specifies the field that owns the relationship on the other side.

### 3. **`@ManyToOne`**
   - **Definition**: A `@ManyToOne` relationship is used when multiple instances of one entity are associated with one instance of another entity.
   - **Example**: Many `Employees` belong to one `Department`.
   - **Mapping**:
     - The `@ManyToOne` annotation is applied to the child entity, which contains the foreign key.
     - The `@JoinColumn` annotation is used to specify the foreign key column.
     
   - **Example**:
     ```java
     @Entity
     public class Employee {
         @Id
         @GeneratedValue(strategy = GenerationType.IDENTITY)
         private Long id;
         
         @ManyToOne
         @JoinColumn(name = "department_id")
         private Department department;

         // getters and setters
     }

     @Entity
     public class Department {
         @Id
         @GeneratedValue(strategy = GenerationType.IDENTITY)
         private Long id;
         
         @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
         private List<Employee> employees;

         // getters and setters
     }
     ```
   - **Key Points**:
     - This is the inverse of a `@OneToMany` relationship.
     - It is the most common type of relationship, representing foreign key associations in databases.

### 4. **`@ManyToMany`**
   - **Definition**: A `@ManyToMany` relationship is used when multiple instances of one entity are associated with multiple instances of another entity.
   - **Example**: `Students` enroll in multiple `Courses`, and each `Course` can have multiple `Students`.
   - **Mapping**:
     - The `@ManyToMany` annotation is used on both sides of the relationship.
     - A `@JoinTable` annotation is used to define the join table that holds the relationship.
     
   - **Example**:
     ```java
     @Entity
     public class Student {
         @Id
         @GeneratedValue(strategy = GenerationType.IDENTITY)
         private Long id;
         
         @ManyToMany
         @JoinTable(
             name = "student_course", 
             joinColumns = @JoinColumn(name = "student_id"), 
             inverseJoinColumns = @JoinColumn(name = "course_id")
         )
         private List<Course> courses;

         // getters and setters
     }

     @Entity
     public class Course {
         @Id
         @GeneratedValue(strategy = GenerationType.IDENTITY)
         private Long id;
         
         @ManyToMany(mappedBy = "courses")
         private List<Student> students;

         // getters and setters
     }
     ```
   - **Key Points**:
     - **Join Table**: The `@JoinTable` annotation defines the intermediate table that holds the keys from both entities.
     - **Bi-directional**: The relationship is typically bi-directional, meaning both entities are aware of the relationship.

