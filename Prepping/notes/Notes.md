## Notes

### Architecture

### **1. Layered Architecture (N-Tier Architecture)**
- **Layers:** Presentation, Business, Persistence, Database.
- **Strengths:** 
  - Clear separation of concerns.
  - Works well for enterprise applications.
- **Challenges:** 
  - Can become difficult to scale when the system complexity increases.
  - Tight coupling between layers.

### **2. Onion Architecture**
- **Core Logic:** Core business logic is at the center, separated from external layers.
- **Strengths:**
  - Decouples core logic from external dependencies (like UI, databases).
  - Easier to test core logic.
  
### **3. Hexagonal Architecture (Ports and Adapters)**
- **Adaptability:** Allows easy integration with new technology and external services.
- **Strengths:**
  - Supports isolation of business logic from external systems.
  - Promotes testability and flexibility in adapting to new systems.

### **4. Modular Architecture**
- **Modularity:** The system is broken down into self-contained modules.
- **Strengths:**
  - Helps manage complexity.
  - Enhances maintainability by isolating functionalities in different modules.

### **5. Microkernel Architecture**
- **Plugins:** Extends the core functionality with plug-ins.
- **Example:** IntelliJ IDEA.
- **Strengths:**
  - Flexible architecture for adding features without affecting the core.
  - Well-suited for product-based systems like IDEs and content management systems.

### **6. Event-Driven Architecture**
- **Real-Time Events:** Systems are decoupled and react to events in real time.
- **Strengths:**
  - Great for real-time, responsive systems (e.g., IoT, gaming).
  - High scalability and loose coupling between services.

### **7. Command Query Responsibility Segregation (CQRS)**
- **Event Bus:** Separates read and write operations.
- **Strengths:**
  - Optimized for complex systems where reads and writes have different performance and scaling needs.
  - Promotes scalability by handling operations separately.

### **8. Service-Oriented Architecture (SOA)**
- **Independent Systems:** Different services work together.
- **Strengths:**
  - Encourages reusability of services.
  - Useful for large, distributed systems.

### **9. Clean Architecture**
- **Core Functionalities:** Core business logic remains consistent across layers.
- **Strengths:**
  - Promotes separation of concerns like Onion Architecture.
  - Flexible and testable design that keeps the system independent from external influences.

Each of these architectures is suited to specific needs depending on the application's size, complexity, and flexibility requirements.

This is a great outline of key system design concepts, progressing from fundamentals to more advanced topics. Here's a breakdown with explanations and some additional points to consider:

**I. Fundamental Concepts:**

1.  **System Design Basics:**

    *   **Client-Server Models:** Understanding the basic interaction where clients request services or resources from servers. Key aspects include request/response cycles, protocols (HTTP, TCP), and different client types (web browsers, mobile apps).
    *   **Database Basics:** Knowledge of relational databases (SQL) and NoSQL databases. Understanding data modeling, schemas, indexes, and basic operations (CRUD).
    *   **CAP Theorem:** This theorem states that in a distributed system, you can only guarantee two out of three of the following:
        *   **Consistency:** All nodes see the same data at the same time.
        *   **Availability:** Every request receives a response, without guarantee that it contains the most recent version of the data.
        *   **Partition Tolerance:** The system continues to operate despite network partitions (nodes being unable to communicate with each other).
        Most web applications choose AP (Availability and Partition Tolerance), sacrificing strict consistency for better user experience.
    *   **Load Balancing:** Distributing traffic across multiple servers to prevent overload on a single server. Techniques include:
        *   **DNS Load Balancing:** Distributing traffic at the DNS level.
        *   **HTTP Load Balancing:** Using load balancers (e.g., Nginx, HAProxy) to distribute traffic at the HTTP level.
        *   **Software Load Balancers:** Load balancing implemented within the application itself.
    *   **Caching:** Storing frequently accessed data in memory (e.g., using Redis, Memcached) to reduce database load and improve response times.
    *   **Proxies:** Acting as intermediaries between clients and servers.
        *   **Forward Proxies:** Used by clients to access external resources.
        *   **Reverse Proxies:** Used by servers to protect internal resources and perform tasks like load balancing, SSL termination, and caching.
    *   **CDNs (Content Delivery Networks):** Distributing static content (images, videos, CSS, JavaScript) across geographically distributed servers to reduce latency for users around the world.

2.  **Scalability and Reliability:**

    *   **Scaling Techniques:**
        *   **Vertical Scaling (Scaling Up):** Increasing the resources (CPU, RAM, storage) of a single server. This has limits and can become expensive.
        *   **Horizontal Scaling (Scaling Out):** Adding more servers to distribute the load. This is more scalable and fault-tolerant.
    *   **Fault Tolerance:** The ability of a system to continue operating even if some components fail. Techniques include redundancy, replication, and failover mechanisms.
    *   **Redundancy:** Having multiple instances of critical components to prevent single points of failure.
    *   **Availability:** The percentage of time a system is operational and accessible. High availability is achieved through redundancy, failover, and monitoring.

3.  **Data Partitioning and Sharding:**

    *   **Partitioning Methods:** Dividing data across multiple servers (shards). Common methods include:
        *   **Horizontal Partitioning (Sharding):** Dividing data based on a key (e.g., user ID).
        *   **Vertical Partitioning:** Dividing data based on functionality (e.g., separating user data from product data).
    *   **Data Consistency Across Shards:** Ensuring data consistency in a sharded environment is challenging. Techniques like two-phase commit or eventual consistency are used.

**II. Advanced Components:**

1.  **Database Selection:**

    *   **SQL vs. NoSQL:** Choosing the right database depends on the use case.
        *   **SQL (Relational):** Best for structured data, transactions, and complex queries.
        *   **NoSQL:** Best for unstructured data, high scalability, and simple queries.
    *   **Database Replication and Consistency Models:** Replicating data across multiple servers for redundancy and availability. Different consistency models (strong, eventual) offer trade-offs between consistency and performance.

2.  **Caching Strategies:**

    *   **Cache-Aside:** Application is responsible for reading from the cache first and then fetching from the database if there is a cache miss.
    *   **Read-Through:** Cache fetches data from the database automatically when there is a cache miss.
    *   **Write-Through:** Data is written to both the cache and the database simultaneously.
    *   **Eviction Policies:** Strategies for removing data from the cache when it's full (e.g., LRU - Least Recently Used, FIFO - First In First Out).
    *   **Caching Tiers:** Using multiple levels of caching (e.g., CPU cache, in-memory cache, distributed cache) to further improve performance.

3.  **Messaging and Queueing Systems:**

    *   **Message Brokers:** Software that facilitates asynchronous communication between applications (e.g., Kafka, RabbitMQ).
    *   **Event-Driven Architecture:** A software architecture where components communicate through events.
    *   **Asynchronous Communication:** Components communicate without waiting for immediate responses.
    *   **Pub-Sub Models:** A messaging pattern where publishers send messages to topics, and subscribers receive messages from topics they have subscribed to.
    *   **Real-Time Data Processing:** Processing data as it is generated, often using stream processing frameworks.

**III. Distributed System Patterns:**

1.  **Microservices Architecture:**

    *   **Service Decomposition:** Breaking down a large application into smaller, independent services.
    *   **Inter-Service Communication:** Services communicate with each other using APIs (REST, gRPC).
    *   **Service Discovery:** Mechanisms for services to find each other (e.g., using a service registry like Eureka or Consul).
    *   **API Gateway:** A single entry point for all client requests, handling routing, authentication, and other cross-cutting concerns.
    *   **Circuit Breaker:** A pattern to prevent cascading failures by stopping requests to a failing service.

2.  **Event-Driven Architecture:**

    *   **Event Sourcing:** Storing all changes to the application state as a sequence of events.
    *   **CQRS (Command Query Responsibility Segregation):** Separating read and write operations to optimize performance and scalability.
    *   **Eventual Consistency:** A consistency model where data is eventually consistent across all nodes, but there might be temporary inconsistencies.

3.  **Data Consistency and Transactions:**

    *   **Distributed Transactions:** Transactions that span multiple databases or services.
    *   **Two-Phase Commit (2PC):** A protocol for ensuring atomicity in distributed transactions.
    *   **BASE (Basically Available, Soft state, Eventually consistent):** A consistency model often used in NoSQL databases.
    *   **ACID (Atomicity, Consistency, Isolation, Durability):** Properties of traditional database transactions.

**IV. Diagrams and Practice:**

1.  **Component Diagram:** Shows the different components of a system and their dependencies.

2.  **Sequence and Interaction Diagrams:** Shows the sequence of messages exchanged between components in a system.

3.  **Practice Real-World Scenarios:** This is the most important part. Designing systems like URL shorteners, social media feeds, chat applications, and file storage helps you apply the concepts you've learned.

This expanded explanation should provide a more comprehensive understanding of the topics you've outlined. Remember that system design is a vast field, and continuous learning and practice are essential.


