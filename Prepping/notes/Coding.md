## 1. Consecutive Substring - Vimeo [Code](coding/String.md#1)

- **Input**: `String s = "abcabd";`
- **Output**: `"abcab"`, `"d"`

- **Example**: `dxabxad = dxabxad`
---

## 2. Codility [Code](coding/Codility.md) 

- Implement the method `changeDirectoryString` to take the current directory path and a `cd` command string, returning the updated directory path.

---

## 3. Codility [Code](coding/Codility.md) 

- This new task involves setting up a Spring Framework configuration class (`SystemConfig`) for your e-commerce site. Here's a summary of what is required:

---

## 4. Athena Health Care [Code](code/athena.md) 

 - You are given an array nums containing n + 1 integers where each integer is in the range [1, n] inclusive. There is exactly one repeated number in the array. Your task is to return this repeated number. ![Leetcode ](images/leetcode1.jpeg) 

---

## 5. GoldmanSach [Code](code/Goldmansach.md#2)

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

---

## 6. GoldmanSach [Code](code/Goldmansach.md#1)

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

---

## 7. StarHealth ![Code](images/starhealth1.jpeg) 

---


## 8. StarHealth ![Code](images/starhealth2.jpeg) 

---

## 9. Gen Digital - [Code](coding/GenDigital.md)

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

## 10. Avility (full remote) question:

 - Koko loves to eat bananas. There are N piles of bananas, and each pile `i` has `piles[i]` bananas. The guards will return in `H` hours. Koko can decide her bananas-per-hour eating speed of `K`. Each hour, she chooses a pile and eats `K` bananas from it.

  - **Input**: `piles = [30,11,23,4,20]`, `H = 6`
  - **Output**: `23`
  
  - **Input**: `piles = [3,6,7,11]`, `H = 8`
  - **Output**: `4`

  **Reference**: [GeeksforGeeks - Koko Eating Bananas](https://www.geeksforgeeks.org/koko-eating-bananas/)

## 11. Opentext 1st round:
    1. Twosum
    2. Return unique elements in a sorted integer array, without using map [Code](coding/opentext.md#1)

---

## 12. Opentext round two [Code](coding/opentext.md#2)

- **Input**: `{{4, 6}, {6, 5}, {7, 3}, {4, 5}}`
- **Output**: `{6, 5}`

  **Problem**: Given a 2D array where each index `i` represents a petrol bunk with `arr[i][0]` as the fuel and `arr[i][1]` as the distance to the next bunk, find the first bunk to start from such that you can complete the full circular trip with zero fuel at the end.

---

## 13. Tavant:  Implement heap sort in java [Code](coding/tavant.md#1)

---

## 14. Tavant: Implement binary search on a sorted array

---

## 15. Tavant: Find longest substring with unique characters in a given string

---

## 16. stream of numbers 1 to 1000 find the missing numbers 

---

## 17. Walmart - Asked merge intervals in first round and then asked to design power-bi reporting system [Code](coding/Walmart.md)

---

## 18. Rotate Array

---

## 19. Use generics in your code ![alt text](images/generics.png)

---

## 20. Caterpillar:
This Java program demonstrates how to filter duplicate objects from a list using a Set and Java Streams. The program defines an `Order` class with fields for `orderId`, `name`, `product`, and `location`. Two `Order` objects are considered duplicates if they share the same `name`, `product`, and `location`, regardless of their `orderId`. [Code](coding/Caterpillar.md)

---

## 21. Colon format [Code](coding/ColonFormat.md)

---

## 22. Digit Occurence [Code](coding/DigitCount.md)

---

## 23. Adjacent Elements Product [Code](coding/AdjacentProduct.md)

---

## 24. Azentio : This program demonstrates filtering entries from a map based on specific keys (2 to 4) and prints the results. It utilizes Java Streams to process the data. [Code](coding/Azentio.md)

---

## 25. Anthology :his program finds and prints the maximum value from a list of integers using Java Streams. It utilizes the max method with a comparator to determine the largest number in the list. [Code](coding/Anthology.md)

---

## 26. Priority Queue [Code](coding/PriorityQueue.md)

---

## 27. Rotate Array [Code](coding/RotateArray.md)

---

## 28. Merge Sorted Arrays [Code](coding/MergeSortedArrays.md)

---

## 29. Move Zeroes [Code](coding/MoveZeroes.md)

---

## 30. IDFC ![alt text](images/IDFC_Code.png)

---

## 31. Shell [Code](coding/ShellSort.md)

---

## 32. ThoughtWorks [Process](code/ThoughtWorks.md)

---

## Stream problems examples  [Code](coding/Stream1.md)

1. **Sum of squares of all even numbers in Java:**
    ```java
    Arrays.stream(input)
        .filter(x -> x % 2 == 0)
        .map(x -> x * x)
        .forEach(System.out::println);
    ```
    ```java
    Arrays.stream(numbers)
        .filter(i->i%2==0)
        .map(i->i*i)
        .reduce(0,Integer::sum);
    ```

2. **Find the second max of student age in Java:**
    ```java
    int age = list.stream()
        .mapToInt(student::getAge)
        .skip(1)
        .max()
        .getAsInt();
    ```
    ```
        Optional<Integer> r=lst.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
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
    ```java
    Map<Integer, Long> ageCounts = students.stream()
    .collect(Collectors.groupingBy(Student::getAge,Collectors.counting()));

    ageCounts.forEach((age,count)-> System.out.println(age+" "+count));
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
    ```java
    Map<Character,Long> map2=stringsa.stream()
        .flatMap(str->str.chars()
        .mapToObj(ch->(char)ch))
        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
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
    ```java
    System.out.println(stringsa.stream().collect(Collectors.joining(",")));
    ```

11. **Combine array matrix values in a set in Java:**
    ```java
    Arrays.stream(matrixInput)
        .flatMapToInt(Arrays::stream)
        .boxed()
        .collect(Collectors.toList());
    ```