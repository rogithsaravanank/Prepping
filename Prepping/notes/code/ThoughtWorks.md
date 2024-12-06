**Interview Process Documentation**

**First Round**

**Objective:**
* Follow TDD, SOLID principles, and clean code practices.
* Complete the given user story by pairing with another ThoughtWorks programmer.
* Interviewers will provide guidance but expect solutions for each point.

**User Story:**
As an electricity consumer, I want to be able to view my usage cost of the last week so that I can monitor my spending.

**Acceptance Criteria:**

**With Price Plan:**
* Given a smart meter ID with a price plan attached and usage data stored,
* When I request the usage cost,
* Then I am shown the correct cost of last week's usage.

**Without Price Plan:**
* Given a smart meter ID without a price plan attached and usage data stored,
* When I request the usage cost,
* Then an error message is displayed.

**How to Calculate Usage Cost:**

* Unit of Meter Readings: kW (Kilowatt)
* Unit of Time: Hour (h)
* Unit of Energy Consumed: kW x Hour = kWh
* Unit of Tariff: $ per kWh (e.g., 0.2 $ per kWh)
* Formula:
   * Average reading in kW = (er1.reading + er2.reading + ... + erN.reading) / N
   * Usage time in hours = Duration (D) in hours
   * Energy consumed in kWh = average reading x usage time
   * Cost = tariff unit price x energy consumed

**Example Response:**
```json
// ...
```

**Second Round (1.5 hours)**

**Project Understanding:**
* Discuss current or previous projects in detail, covering front-end calls to DB inserts and full data flow with authentication.

**Architecture Whiteboarding:**
* Explain the current project architecture involving:
  * S3, CloudFront, EC2 for front-end hosting
  * MSAL authentication
  * Lambda authorizer, API Gateway
  * S3, SNS, SQS triggers for Lambda
  * Connection with RDS instances

**Alternative Architecture:**
* Propose alternatives, such as:
  * Spring Boot app hosting as ECS container with ALB to distribute traffic to APIs.
* Explain scaling mechanisms for this architecture.

**Java Hands-On:**
* Java 8, 17, 21 features and their benefits (e.g., sealed classes, switch expressions, record type).
* Predicate in Streams: Discuss and solve predicate-related questions in Java streams.
* Circuit Breaker in Microservices: Explain circuit breaker patterns and alternatives like global exception handlers.
* Calling Third-Party APIs in Spring Boot: Describe methods to call third-party APIs using Spring Boot.
* Concurrent API Calls: Explain how to call 10 APIs concurrently without much delay, ensuring the frontend has only one exposed API.
* Efficient API Calls: Discuss strategies to call multiple APIs in the backend efficiently (e.g., using threads, CompletableFuture in Java).
* Performance Monitoring: Methods to identify slow parts in API calls (e.g., using logs, wrapper function calls, proper logging statements).
