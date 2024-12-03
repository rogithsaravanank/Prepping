
## 1. Consecutive Substring - Vimeo [Code](coding/String.md#1)

- **Input**: `String s = "abcabd";`
- **Output**: `"abcab"`, `"d"`

- **Example**: `dxabxad = dxabxad`

---

## 2. Codility [Code](coding/Codility.md)

- Implement the method `changeDirectoryString` to take the current directory path and a `cd` command string, returning the updated directory path.

  ![codility](images/codility1.jpeg)
  ![codility](images/codility3.jpeg)
  ![codility](images/codility2.jpeg)

---

## 3. Codility [Code](coding/Codility.md)

- Task: Set up a Spring Framework configuration class (`SystemConfig`) for your e-commerce site.

---

## 4. Athena Health Care [Code](code/athena.md)

- Given an array `nums` containing `n + 1` integers where each integer is in the range `[1, n]` inclusive, find and return the repeated number.

  ![Leetcode](images/leetcode1.jpeg)

---

## 5. Athena Health Care [Code](images/leetcode2.jpeg)

---

## 6. Athena Health Care [Code](images/Athena-coding.jpeg)

---

## 7. Athena Health Care [Code](images/Athena-coding1.jpeg)

---

## 10. Goldman Sachs [Code](images/goldmansach1.jpeg)

---

## 11. Goldman Sachs [Code](images/goldmansach2.jpeg)

---

## 12. StarHealth [Code](images/starhealth1.jpeg)

---

## 13. StarHealth [Code](images/starhealth2.jpeg)

---

## 14. Gen Digital [Code](coding/GenDigital.md)

1. **ATM Logic**
   - **Input**: `Enter the amt: 2630`
   - **Output**:
     - `1000 - 2`
     - `500 - 1`
     - `100 - 1`
     - `20 - 1`
     - `10 - 1`

   Assume an infinite number of notes in the ATM machine.

2. **String Manipulation**:
   - **Input**: `String s = "TestABCDE"`
   - Find the max and min repeating characters (case-insensitive). If counts are the same:
     - For max: pick the first character alphabetically.
     - For min: pick the last character alphabetically.
   - **Output**: `seTsABCDE`

---

## 15. Avility (Full Remote) Question:

- Koko loves to eat bananas. There are N piles of bananas, and each pile `i` has `piles[i]` bananas. The guards will return in `H` hours. Koko can decide her bananas-per-hour eating speed of `K`. Each hour, she chooses a pile and eats `K` bananas from it.

  - **Input**: `piles = [30,11,23,4,20]`, `H = 6`
  - **Output**: `23`
  
  - **Input**: `piles = [3,6,7,11]`, `H = 8`
  - **Output**: `4`

  **Reference**: [GeeksforGeeks - Koko Eating Bananas](https://www.geeksforgeeks.org/koko-eating-bananas/)

---

## 16. Opentext 1st Round:
1. Twosum
2. Return unique elements in a sorted integer array without using a map. [Code](coding/opentext.md#1)

---

## 17. Opentext Round Two [Code](coding/opentext.md#2)

- **Input**: `{{4, 6}, {6, 5}, {7, 3}, {4, 5}}`
- **Output**: `{6, 5}`

  **Problem**: Given a 2D array where each index `i` represents a petrol bunk with `arr[i][0]` as the fuel and `arr[i][1]` as the distance to the next bunk, find the first bunk to start from such that you can complete the full circular trip with zero fuel at the end.

---

## 18. Tavant: Implement Heap Sort in Java [Code](coding/tavant.md#1)

---

## 19. Tavant: Implement Binary Search on a Sorted Array

---

## 20. Tavant: Find the Longest Substring with Unique Characters in a Given String

---

## 21. Stream of Numbers 1 to 1000: Find the Missing Numbers

---

## 22. Walmart: 
- **First Round**: Asked to merge intervals.
- **Second Round**: Design a Power BI reporting system. [Code](coding/Walmart.md)

---

## 24. Rotate Array

---

## 25. Use Generics in Your Code ![alt text](images/generics.png)

---

## 26. Caterpillar: 
This Java program demonstrates how to filter duplicate objects from a list using a Set and Java Streams. The program defines an `Order` class with fields for `orderId`, `name`, `product`, and `location`. Two `Order` objects are considered duplicates if they share the same `name`, `product`, and `location`, regardless of their `orderId`. [Code](coding/Caterpillar.md)

---

## 27. Colon Format [Code](coding/ColonFormat.md)

---

## 28. Digit Occurrence [Code](coding/DigitCount.md)

---

## 29. Adjacent Elements Product [Code](coding/AdjacentProduct.md)

---

## 30. Azentio: 
This program demonstrates filtering entries from a map based on specific keys (2 to 4) and prints the results. It utilizes Java Streams to process the data. [Code](coding/Azentio.md)

---

## 31. Anthology: 
This program finds and prints the maximum value from a list of integers using Java Streams, utilizing the `max` method with a comparator to determine the largest number in the list. [Code](coding/Anthology.md)

---

## 32. Priority Queue [Code](coding/PriorityQueue.md)

---

## 33. Rotate Array [Code](coding/RotateArray.md)

---

## 34. Merge Sorted Arrays [Code](coding/MergeSortedArrays.md)

---

## 35. Move Zeroes [Code](coding/MoveZeroes.md)

---

## 36. IDFC ![alt text](images/IDFC_Code.png)

---

## 37. Shell ![alt text](images/shell.png)

---

## 38. Athena ![alt text](images/Athena_1.png)

---

## 39. Athena ![alt text](images/Athena_2.png)

---

## 40. Athena ![alt text](images/Athena_3.png)

---

## 41. Stream Problems Examples [Code](coding/Stream1.md)

1. **Sum of squares of all even numbers in Java:**
    ```java
    Arrays.stream(input)
        .filter(x -> x % 2 == 0)
        .map(x -> x * x)
        .forEach(System.out::println);
    ```

2. **Find the second max of student age in Java:**
    ```java
    int age = list.stream()
        .mapToInt(student::getAge)
        .skip(1)
        .max()
        .getAsInt();
    ```

3. **Find list of unique characters present in all strings in Java:**
    ```java
    Set<Character> uniqueChars = listOfStrings.stream()
        .flatMap(str -> str.chars().mapToObj(ch -> (char) ch))
        .collect(Collectors.toSet());
    ```

4. **Group students count by age in Java:**
    ```java
    list.stream()
        .collect(Collectors.groupingBy(Student::getAge, Collectors.counting()));
    ```

5. **Convert a list into a map in Java:**
    ```java
    list.stream()
        .collect(Collectors.toMap(Function.identity(), Function.identity()));
    ```

6. **Sort and reverse order in Java:**
    ```java
    Arrays.stream(arr)
        .boxed()
        .sorted(Comparator.reverseOrder())
        .limit(2);
    ```

7. **Get count of each character in Java:**
    ```java
    str.chars()
        .boxed()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    ```

8. **Sort by salary in Java:**
    ```java
    employeeList.stream()
        .sorted(Comparator.comparingInt(Employee::getSalary));
    ```

9. **Find employee with lowest salary in Java:**
    ```java
    employeeList.stream()
        .min(Comparator.comparingInt(Employee::getSalary));
    ```

10. **Join given list values with a comma in Java:**
    ```java
    Arrays.stream(names).collect(Collectors.joining(","));
    ```

11. **Combine array matrix values in a set in Java:**
    ```java
    Arrays.stream(matrixInput)
        .flatMapToInt(Arrays::stream)
        .boxed()
        .collect(Collectors.toList());
    ```
