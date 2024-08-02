## System Design

### Design a OrderBook (LLD)

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


### ![Bowling LLD ](images/lld.jpeg)

