
1. Return unique elements in a sorted integer array, without using map

public int[] getUniqueElementsInPlace(int[] nums) {
    if (nums == null || nums.length == 0) {
        return new int[0];
    }

    int uniqueIndex = 0; // Index to store unique elements

    for (int i = 1; i < nums.length; i++) {
        if (nums[i] != nums[uniqueIndex]) {
            uniqueIndex++;
            nums[uniqueIndex] = nums[i]; // Move unique element to the correct position
        }
    }

    // Create a new array with the unique elements
    int[] uniqueArray = new int[uniqueIndex + 1];
    for (int i = 0; i <= uniqueIndex; i++) {
        uniqueArray[i] = nums[i];
    }
    return uniqueArray;
}

2. To solve this problem, we need to find the **starting petrol bunk** from where we can complete the circular journey. The problem boils down to checking whether at any point in the circular traversal, we run out of fuel. If so, we need to start the journey from another petrol bunk.

### **Key Observations:**
1. For a successful journey, the total fuel provided (`sum(fuel)`) must be greater than or equal to the total distance (`sum(distance)`).
2. If the total fuel is sufficient, the journey can start from a specific petrol bunk (let's call it `start`).
3. The `start` can be found by iterating through the petrol bunks. Whenever the fuel in the tank becomes negative during the journey, it means the starting bunk is incorrect, and we need to set the next bunk as the new starting point.

---

### **Approach:**
1. Calculate the **net fuel balance** at each petrol bunk, i.e., `fuel[i] - distance[i]`.
2. If the running fuel balance becomes negative during traversal, reset the starting index to the next bunk and reset the tank to zero.
3. After one full traversal:
   - If the total fuel is greater than or equal to the total distance, return the starting index.
   - Otherwise, the journey is not possible.

---

### **Algorithm:**
1. Initialize:
   - `totalFuel = 0` (to check if the journey is possible).
   - `currentFuel = 0` (to track the running balance of fuel during traversal).
   - `start = 0` (initial starting index).
2. Traverse the array:
   - Add `arr[i][0] - arr[i][1]` to `totalFuel` and `currentFuel`.
   - If `currentFuel` becomes negative, reset `start = i + 1` and `currentFuel = 0`.
3. At the end, check if `totalFuel >= 0`. If yes, return `start`, otherwise return `-1` (journey not possible).

---

### **Code Implementation (Java):**
```java
public int findStartingBunk(int[][] arr) {
    int totalFuel = 0; // Total fuel balance for the journey
    int currentFuel = 0; // Current running balance of fuel
    int start = 0; // Starting bunk index

    for (int i = 0; i < arr.length; i++) {
        int fuel = arr[i][0];
        int distance = arr[i][1];
        totalFuel += fuel - distance;
        currentFuel += fuel - distance;

        // If current fuel balance is negative, reset the start point
        if (currentFuel < 0) {
            start = i + 1; // Move start to the next bunk
            currentFuel = 0; // Reset running fuel
        }
    }

    // If total fuel is sufficient, return the start index, otherwise return -1
    return totalFuel >= 0 ? start : -1;
}
```

---

### **Explanation with Input:**
**Input:** `arr = {{4, 6}, {6, 5}, {7, 3}, {4, 5}}`

**Steps:**
1. Compute net fuel for each bunk:
   - Bunk 0: `4 - 6 = -2`
   - Bunk 1: `6 - 5 = 1`
   - Bunk 2: `7 - 3 = 4`
   - Bunk 3: `4 - 5 = -1`
2. Traverse:
   - Total fuel after all bunks = `(-2) + 1 + 4 + (-1) = 2` (sufficient to complete journey).
   - Running balance:
     - Bunk 0: `currentFuel = -2` → Reset `start = 1`, `currentFuel = 0`.
     - Bunk 1: `currentFuel = 1`.
     - Bunk 2: `currentFuel = 5`.
     - Bunk 3: `currentFuel = 4`.
3. Since `totalFuel >= 0`, the starting bunk is `1`.

**Output:** `1` (Start at the second bunk, `{6, 5}`).

---

### **Time Complexity:**
- O(n): Single traversal of the array.

### **Space Complexity:**
- O(1): No extra space is used.