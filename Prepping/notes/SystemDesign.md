## System Design

### 1. Design a OrderBook (LLD)

Orderbook
Order 3 = User B : SELL | STOCK X | qty 2 units | Rs 100
Order 1 = User A : Buy | STOCK X | qty 4 units | Rs 100 -> ORDER
Order 2 = User X : Buy | STOCK X | qty 2 units | Rs 100
Order 3 = User B : SELL | STOCK Y | qty 1 units | Rs 100
Order 4 = User C : Sell Stock X 4 units Rs 500
 
Order 1 matches Order 3 -> transaction performed
 
Criteria for matching orders:
1 - Sell <= Buy price
2 - FIFO is used to match competing orders (Order 1 matches first before Order 2)

#### Answer - https://leetcode.com/discuss/interview-question/2079858/stock-exchange-lld


### 2 . ![Bowling LLD ](images/lld.jpeg)

### 3 . ![Athena LLD ](images/lld-Athena.jpeg)

### 4 . Design a Short URL like bit.ly (Do not use special characters)
- base236 encoding 
- 302 redirecting
- memcached

### 5. Design a restaurants reservation system
- Restaurant table and Customer table , Reservation table.
- Horizontal scaling with load balancer and geo routing 
- NO SQL database(Mongo db due to nedd of high availability ) --> sms notification
- Cached to cutomer data in memcached

### 6. Design a Web Crawler
- entire web or few sites
- need to store every images/html
- Normally web servers are verties on a directed graph
- So basically it is a graph traversal (bfs) all the paths will be covered here
- Queue of URL's to crawl --> PageDownloader(Distributed storage)(content hashes to avoid duplication) -->URL Extraction --> URL Filter --> URL processed

### 7. Design a Top seller systems
- Always try to ask questions up top for the basic desigining of the system then when we get deep into it get some feedback and improvise the system.
- Purchases(Amazon s3) --> Top seller job (Apache spark job) -->  Top server --> distributes cache --> webserver 

### 8. Design a video sharing service(Youtube)
- handling Upload, transcode and view the video
- webservers to return video URL --> Video meta data (NoSQL)
- (CDN) Transcoded Video --> use direct servers of your own servers --> message queues
-  video meta data -->  Raw video --> Transcoding fleet --> Transcoded fleet

### 9. Design a search engine
- how relevant the page is to keywords within it
- What algorithm to use to map keywords to pages and sort them
- what architecture wouldallow you to do all this in the ludicrous scale
- term frequency /document frequnecy in entire web it is not feasible 
- backlinks, terms in doc , their position, Titles, length of documnet, Meta data , 
- web respository --> Indexer -->  index(keept it sorted)
- indexer --> backlinks --> URL normalizer --> links --> page rank algo
- index--> scoring ,ranking,sorting --> inverted index--> front end user 
- Scaling --> DB NOsQL, CLoud , many data cneters with the front end 


### 10. Simplified gift delivery system and asks for a Low-Level Design (LLD) including classes and database tables. Here's a possible LLD - Samsung
- To be concise when describing the LLD of a gift delivery system in an interview, focus on the key components and their relationships, avoiding unnecessary details. Here's a concise way to present the LLD based on the previous extended response:

**Concise Answer Structure:**

1.  **Overview:** Briefly state the system's purpose (facilitating gift delivery).
2.  **Core Entities/Tables:** Quickly name the main entities/tables and their primary purpose.
3.  **Key Relationships:** Briefly describe the important relationships between the entities.
4.  **Key Classes/Components:** Briefly mention the main classes and their roles.
5.  **Technology (If asked):** Briefly mention relevant technologies used (e.g., Spring Boot, relational database).

**Example Concise Answer:**

"This system manages gift deliveries from shops to customers. The core entities are:

*   **Customer:** Stores customer information.
*   **Item:** Stores details about gift items.
*   **Shop:** Stores information about shops selling items.
*   **Inventory:** Tracks item availability in each shop.
*   **Order:** Represents a customer's order, including order items, status, and delivery address.
*   **OrderItem:** A junction table linking orders and items, storing quantity and price at the time of order.
*   **Carrier:** Stores information about delivery carriers.
*   **Shipment:** Tracks the delivery process, linking orders to carriers.

Key relationships include: a customer can place multiple orders; an order can contain multiple items; and an order has one shipment handled by one carrier.

The main classes mirror these entities, with controllers handling requests and services containing business logic. We'd likely use a relational database like PostgreSQL and a framework like Spring Boot to implement this. This design ensures efficient tracking of orders, inventory, and deliveries."

**Even More Concise (If time is extremely limited):**

"This system manages gift deliveries. Key entities include Customer, Item, Shop, Inventory, Order, OrderItem, Carrier, and Shipment. Orders link customers to items and shipments, which are handled by carriers. We'd use a relational database and a framework like Spring Boot."

**Key Strategies Used for Conciseness:**

*   **Grouped Information:** Instead of listing every field in every table, the answer focuses on the purpose of each table/entity.
*   **High-Level Relationships:** Only the most important relationships are mentioned.
*   **Simplified Class Description:** The answer mentions the existence of classes mirroring entities and the presence of controllers and services without going into detail about each method or field.
*   **Omitted Implementation Details:** Details like specific data types, primary/foreign keys, or detailed class structures are omitted unless explicitly asked.

**How to Adapt to Interviewer's Questions:**

*   If the interviewer asks for more details about a specific table (e.g., "What fields would the Order table have?"), then you can provide more specific information.
*   If the interviewer asks about specific classes or interactions, you can elaborate on those areas.

**Example Follow-Up Questions and Concise Answers:**

*   **Interviewer:** "What would the relationship between Order and Item be?"
*   **Concise Answer:** "It's a many-to-many relationship. An order can contain multiple items, and an item can be part of multiple orders. We'd implement this using an OrderItem junction table."

*   **Interviewer:** "What's the purpose of the Inventory table?"
*   **Concise Answer:** "The Inventory table tracks the quantity of each item available in each shop. This allows us to check stock levels before placing an order."

By using this structured approach and focusing on the essential information, you can effectively and concisely communicate the LLD of your gift delivery system in an interview. Remember to listen carefully to the interviewer's questions and tailor your answers accordingly.



