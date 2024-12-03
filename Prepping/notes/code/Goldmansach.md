1. ![Code](images/goldmansach2.jpeg)
### Problem Explanation:
- **N**: The number of kids at the party, each kid is numbered from 1 to N.
- **T**: The total number of toys to be distributed.
- **D**: The random starting point for the distribution, indicating which kid gets the first toy.

The toys are distributed sequentially, with the toys being distributed starting from kid D, and continuing in a cyclic manner until all T toys are given out. The task is to determine which child gets the last (damaged) toy.

### Example:
- Input: 
  - N = 5 (5 kids)
  - T = 1 (1 toy)
  - D = 2 (starting from the 2nd kid)

The output should be `2` because the toy goes to the 2nd child in this case.

### Solution Approach:
We need to figure out the last toy's recipient. Given that the toys are distributed cyclically, the modulo operation will help us determine the correct child.

### Java Code:

```java
import java.io.*;

class Result {
    /*
     * Complete the 'findDamagedToy' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER N
     *  2. INTEGER T
     *  3. INTEGER D
     */
    public static int findDamagedToy(int N, int T, int D) {
        // Calculate the last toy's recipient using modulo
        int res = (D + T - 1) % N;
        return res == 0 ? N : res; // if remainder is 0, the last toy goes to the N-th kid
    }
}

public class Solution {
    public static void main(String[] args) {
        // Test case
        int N = 5; // Number of kids
        int T = 1; // Number of toys
        int D = 2; // Starting kid

        // Find and print the result
        int result = Result.findDamagedToy(N, T, D);
        System.out.println("The last kid to receive the damaged toy is: " + result);
    }
}
```

### Explanation of Code:
1. **findDamagedToy Function**:
   - This function calculates the recipient of the last toy by adding `T - 1` (because the first toy is given to the `D`-th kid, and then `T-1` more toys are distributed).
   - The modulo operation (`% N`) is used to ensure that if the calculation exceeds `N` kids, it wraps around to the beginning of the kids list.
   - If the result is 0, it means the last toy goes to the N-th kid (since 0 modulo N corresponds to the N-th position).
   
2. **main Function**:
   - Here, we provide sample input values (`N = 5`, `T = 1`, and `D = 2`) and output the result using the `findDamagedToy` function.

### Example Run:
For the input:
```
N = 5
T = 1
D = 2
```
The output will be:
```
The last kid to receive the damaged toy is: 2
```

2. ![Code](images/goldmansach1.jpeg) 

### Problem Explanation:
- **N** represents ascending order (the number increases as you move to the right).
- **M** represents descending order (the number decreases as you move to the right).

You need to find the smallest possible numeric value that satisfies this pattern, where:
- The sequence must follow the ascending and descending rules.
- The digits used in the sequence must be from 1 to 9, with no repetition.

### Example:
- **Input**: `"M"`
  - **Output**: `21` (since 2 is smaller than 1, and 'M' indicates descending).
  
- **Input**: `"NMN"`
  - **Output**: `2143` (this is the smallest numeric value that satisfies the 'ascending' and 'descending' pattern).

### Code Analysis:
1. **`findPossibleSmallestNumberMatchingPattern` Function**: 
   - Takes the string pattern as input and tries to generate the smallest number.
   - Uses a priority queue to select the smallest available digits as it parses through the string pattern.
   
2. **`parseString` Function**:
   - Reads the input string character by character.
   - Adds digits based on whether the character is 'M' (descending) or 'N' (ascending).
   
3. **Helper Functions**:
   - `getMc`: Returns the number of 'M's and 'N's in the pattern.
   - `getCount`: A helper function to count the number of digits based on specific conditions.

### Java Code Outline:

```java
import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'findPossibleSmallestNumberMatchingPattern' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts a string pattern.
     */
    static int findPossibleSmallestNumberMatchingPattern(String pattern) {
        if (pattern == null || pattern.isEmpty() || getMc(pattern) != pattern.length()) {
            return -1;
        }
        return Integer.parseInt(parseString(pattern));
    }

    private static String parseString(String input) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        String res = "";
        int n = input.length();
        int mc = 0, nc = 0;
        for (int i = 0; i < n; i++) {
            if (input.charAt(i) == 'M') {
                mc++;
            } else {
                nc++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (input.charAt(i) == 'M') {
                pq.add(mc);
            } else {
                pq.add(nc);
            }
        }
        res = pq.poll();
        return res;
    }

    private static int getMc(String pattern) {
        int mc = 0;
        int n = pattern.length();
        for (int i = 0; i < n; i++) {
            if (pattern.charAt(i) == 'M') mc++;
        }
        return mc;
    }
}
```

### Explanation:
1. **`findPossibleSmallestNumberMatchingPattern`**: This function will take the string pattern, calculate the smallest number based on the given 'M' and 'N' pattern.
2. **`parseString`**: This function helps in generating the final numeric value by prioritizing the smallest available digit to satisfy the ascending/descending conditions.
