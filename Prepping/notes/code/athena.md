## Athena


- ![alt text](images/Athena_1.png)
- ![alt text](images/Athena_2.png) 
- ![alt text](images/Athena_3.png)
- ![Athena_R2](https://github.com/user-attachments/assets/b13d7c55-23ba-49fc-928c-e278951dd778)
- ![Athena_R1](https://github.com/user-attachments/assets/e59da618-e4b1-452c-9c78-526dfcc6e534)
- ![Code](images/Athena-coding.jpeg) 
- ![Code](images/Athena-coding1.jpeg)
- ![Code](images/leetcode2.jpeg) 


---

### **1. The LeetCode problem "287. Find the Duplicate Number"**

You are given an array `nums` containing `n + 1` integers where each integer is in the range `[1, n]` inclusive. There is **exactly one repeated number** in the array. Your task is to return this repeated number.

**Constraints:**
1. You must not modify the array (`nums` is read-only).
2. You must use constant extra space (`O(1)`).
3. The runtime complexity must be less than `O(n^2)`.

---
### Given a set of coin denominations and a target amount, find the minimum number of coins that sum up to the target amount
```
import java.util.Arrays;

public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1); // Initialize with a value greater than the maximum possible result
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount]; // Return -1 if no solution is found
    }

    public static void main(String[] args) {
        CoinChange cc = new CoinChange();
        int[] coins = {1, 2, 5};
        int amount = 11;
        int minCoins = cc.coinChange(coins, amount);
        System.out.println("Minimum coins: " + minCoins); // Output: 3

        int amount2 = 2;
        int[] coins2 = {3, 5};
        int minCoins2 = cc.coinChange(coins2, amount2);
        System.out.println("Minimum coins: " + minCoins2); // Output: -1

        int amount3 = 0;
        int[] coins3 = {1,2,5};
        int minCoins3 = cc.coinChange(coins3, amount3);
        System.out.println("Minimum coins: " + minCoins3); // Output: 0

        int amount4 = 1;
        int[] coins4 = {1};
        int minCoins4 = cc.coinChange(coins4, amount4);
        System.out.println("Minimum coins: " + minCoins4); // Output: 1
    }
}
```

---

### **Approaches**

#### 1. **Floyd's Tortoise and Hare (Cycle Detection)**

This approach uses the idea that the problem can be reduced to detecting a cycle in a linked list. Here, the array values are treated as pointers to indices.

- **Algorithm:**
  1. Use two pointers, slow and fast:
      - `slow` moves one step at a time.
      - `fast` moves two steps at a time.
  2. Detect the cycle by checking when `slow == fast`.
  3. To find the entry point of the cycle (duplicate number), reset one pointer to the start and move both one step at a time until they meet.

- **Code (Java):**
```java
public int findDuplicate(int[] nums) {
    // Phase 1: Detect cycle
    int slow = nums[0];
    int fast = nums[0];
    
    do {
        slow = nums[slow];
        fast = nums[nums[fast]];
    } while (slow != fast);
    
    // Phase 2: Find the entrance to the cycle
    slow = nums[0];
    while (slow != fast) {
        slow = nums[slow];
        fast = nums[fast];
    }
    
    return slow; // Duplicate number
}
```

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

---

#### 2. **Binary Search on Value Range**

Use binary search on the range `[1, n]`. For each number `mid`, count how many elements in the array are ≤ `mid`. If this count is greater than `mid`, the duplicate is in the range `[1, mid]`; otherwise, it is in `[mid + 1, n]`.

- **Code (Java):**
```java
public int findDuplicate(int[] nums) {
    int left = 1, right = nums.length - 1;
    
    while (left < right) {
        int mid = left + (right - left) / 2;
        int count = 0;
        
        for (int num : nums) {
            if (num <= mid) count++;
        }
        
        if (count > mid) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }
    
    return left;
}
```

- **Time Complexity:** O(n log n)
- **Space Complexity:** O(1)

---

#### 3. **Using Set for Non-Constant Space (Alternative)**

This is an alternative that uses extra space (`O(n)`), violating one constraint but is simpler:

```java
public int findDuplicate(int[] nums) {
    Set<Integer> seen = new HashSet<>();
    
    for (int num : nums) {
        if (seen.contains(num)) {
            return num;
        }
        seen.add(num);
    }
    
    return -1; // Should never reach here
}
```

- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

---

### **Which Approach to Choose?**

- **Floyd's Tortoise and Hare**: Best if you need O(1) space and O(n) time.
- **Binary Search**: Best when constraints allow slightly more than O(n) time.
- **HashSet**: Simplest but not optimal (violates O(1) space constraint).

---

---
```
import java.util.*;

class Result {
    public static List<Integer> minChairs(List<String> simulations) {
        List<Integer> res = new ArrayList<>();

        for (String str : simulations) {
            int totalChairs = 0;
            int availableChairs = 0;

            for (char action : str.toCharArray()) {
                switch (action) {
                    case 'C': // New employee arrives
                    case 'U': // Employee returns from a meeting
                        if (availableChairs > 0) {
                            availableChairs--;
                        } else {
                            totalChairs++;
                        }
                        break;
                    case 'R': // Employee goes to a meeting
                    case 'L': // Employee leaves the workroom
                        availableChairs++;
                        break;
                }
            }

            res.add(totalChairs); // Add the result for this simulation
        }

        return res;
    }

    public static void main(String[] args) {
        // Example usage
        List<String> simulations = Arrays.asList("CRUL", "CCRUUL");
        List<Integer> result = minChairs(simulations);

        System.out.println(result); // Output: [1, 2]
    }
}
```
---
```
import java.util.*;

class Result {
    public static List<Long> mazeGame(List<Long> t, List<Integer> endpoint1, List<Integer> endpoint2, List<Integer> edgeLength) {
        int n = t.size(); // Number of vertices
        List<List<int[]>> graph = new ArrayList<>(); // Adjacency list to store edges
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // Build the graph
        for (int i = 0; i < endpoint1.size(); i++) {
            int u = endpoint1.get(i);
            int v = endpoint2.get(i);
            int len = edgeLength.get(i);
            graph.get(u).add(new int[]{v, len});
            graph.get(v).add(new int[]{u, len}); // Bidirectional edge
        }

        // Priority queue for Dijkstra's algorithm
        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[1])); // [vertex, time]
        pq.offer(new long[]{1, 0}); // Start at vertex 1 with time 0

        long[] earliestTime = new long[n + 1];
        Arrays.fill(earliestTime, Long.MAX_VALUE);
        earliestTime[1] = 0;

        while (!pq.isEmpty()) {
            long[] current = pq.poll();
            int vertex = (int) current[0];
            long currentTime = current[1];

            // If the current vertex is already gone, skip it
            if (currentTime >= t.get(vertex - 1)) {
                continue;
            }

            // Explore neighbors
            for (int[] neighbor : graph.get(vertex)) {
                int nextVertex = neighbor[0];
                long travelTime = neighbor[1];
                long nextTime = currentTime + travelTime;

                // Check if the next vertex is reachable and update time
                if (nextTime < t.get(nextVertex - 1) && nextTime < earliestTime[nextVertex]) {
                    earliestTime[nextVertex] = nextTime;
                    pq.offer(new long[]{nextVertex, nextTime});
                }
            }
        }

        // Prepare the result
        List<Long> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            result.add(earliestTime[i] == Long.MAX_VALUE ? -1 : earliestTime[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        // Example input
        int n = 4, m = 4;
        List<Long> t = Arrays.asList(1L, 2L, 7L, 9L);
        List<Integer> endpoint1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> endpoint2 = Arrays.asList(2, 3, 4, 1);
        List<Integer> edgeLength = Arrays.asList(2, 4, 1, 5);

        List<Long> result = mazeGame(t, endpoint1, endpoint2, edgeLength);
        System.out.println(result); // Output: [0, -1, 7, 9]
    }
}
```
---

