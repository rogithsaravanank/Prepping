## Athena


- ![alt text](images/Athena_1.png)
- ![alt text](images/Athena_2.png) 
- ![alt text](images/Athena_3.png)
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


