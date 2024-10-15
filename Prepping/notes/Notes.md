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

