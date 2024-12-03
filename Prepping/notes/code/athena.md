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


