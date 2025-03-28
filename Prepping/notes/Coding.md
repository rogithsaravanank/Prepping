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

## 34. Wipro 

```
You are given an array A of N integers, representing the maximum heights of N skyscrapers to be built.

Your task is to specify the actual heights of the skyscrapers, given that:

the height of the K-th skyscraper should be positive and not bigger than A(K];

no two skyscrapers should be of the same height;

the total sum of the skyscrapers' heights should be the maximum possible.

Write a function: class Solution { public int[] solution(int[] A); }

that, given an array A of N integers, returns an array B of N integers where B[K] is the assigned height of the K-th skyscraper satisfying the above conditions.

If there are several possible answers, the function may return any of them. You may assume that it is always possible to build all skyscrapers while fulfilling all the requirements. Examples:

Given A = [1, 2, 3], your function should return [1, 2, 3], as all of the skyscrapers may be built to their maximum height.

Given A = [9, 4, 3, 7, 7], your function may return [9, 4, 3, 7, 6]. Note that [9, 4, 3, 6, 7] is also a valid answer. It is not possible for the last two skyscrapers to have the same height. The of height of one of them should be 7 and the other should be 6.

Given A [2, 5, 4, 5, 5], your function should return [1, 2, 3, 4, 5]

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..50,000];

each element of array A is an integer within the range [1..1,000,000,000];

there is always a solution for the given input.

What I did: Couldn’t think of anything but brute force. Used a set to check if a height is a duplicate. If it isn’t a duplicate use that height, else try every number below till we find an unused one.
```

```
package com.example.interview;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Wipro {

    public static int[] solution(int[] A) {
        int N = A.length;
        int[] B = new int[N];
        Set<Integer> usedHeights = new HashSet<>();

        for (int i = N - 1; i >= 0; i--) {
            int height = A[i];
            while (height > 0 && usedHeights.contains(height)) {
                height--;
            }
            if (height == 0) {
                throw new IllegalArgumentException("Input array has no solution"); //Should not happen according to prompt
            }
            B[i] = height;
            usedHeights.add(height);
        }

        return B;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3}))); // [1, 2, 3]
        System.out.println(Arrays.toString(solution(new int[]{9, 4, 5, 7, 7}))); // [9, 4, 5, 6, 7]
        System.out.println(Arrays.toString(solution(new int[]{2, 5, 3, 5, 5}))); // [2, 3, 4, 5]
        // System.out.println(Arrays.toString(transformArray(new int[]{1, 5, 2, 6}))); // [1, 2, 3, 4, 5, 2, 3, 4, 5, 6]
        // System.out.println(Arrays.toString(transformArray(new int[]{1,1,1,1,1}))); // [1]
        // System.out.println(Arrays.toString(transformArray(new int[]{5,4,3,2,1}))); // [5,4,3,2,1]
    }
}


```

---
## 33. Comcast - Explain binary tree with simple traversal.
```
public class BinaryTree {

    private Node root;

    private static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    private Node insertRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = insertRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = insertRecursive(current.right, data);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    public boolean contains(int data) {
        return containsRecursive(root, data);
    }

    private boolean containsRecursive(Node current, int data) {
        if (current == null) {
            return false;
        }
        if (data == current.data) {
            return true;
        }
        return data < current.data
                ? containsRecursive(current.left, data)
                : containsRecursive(current.right, data);
    }



    public void inOrderTraversal() {
        inOrderTraversalRecursive(root);
        System.out.println(); // Newline for better output formatting
    }

    private void inOrderTraversalRecursive(Node node) {
        if (node != null) {
            inOrderTraversalRecursive(node.left);
            System.out.print(node.data + " ");
            inOrderTraversalRecursive(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal of the given tree");
        tree.inOrderTraversal(); // Output: 20 30 40 50 60 70 80

        System.out.println("Contains 40: " + tree.contains(40)); // Output: true
        System.out.println("Contains 90: " + tree.contains(90)); // Output: false

    }
}
```
---
## 34.Inmedical Coding
```
import java.util.Scanner;

public class NumbersWithExactlyTwoZeroes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of digits
        System.out.print("Enter the number of digits (e.g., 3 for 999, 4 for 9999): ");
        int digits = scanner.nextInt();

        // Calculate the maximum value based on the number of digits
        int max = (int) Math.pow(10, digits) - 1;

        // Counter for numbers with exactly two zeroes
        int count = 0;

        // Loop through all numbers up to the max
        for (int i = 100; i <= max; i++) {
            // Convert number to string and count zeroes
            String numberStr = Integer.toString(i);
            int zeroCount = 0;

            // Count the number of zeroes in the number's string representation
            for (char c : numberStr.toCharArray()) {
                if (c == '0') {
                    zeroCount++;
                }
            }

            // If there are exactly two zeroes, increment the count
            if (zeroCount == 2) {
                count++;
            }
        }

        // Output the result
        System.out.println("Count of numbers with exactly two zeroes: " + count);
    }
}
```
---

## 33. Samsung [Ques](coding/Samsung.md)

---

## 34. MedNet

```java
  int[] arr = {1, 2, 3, 4, 5, 6, 7}; // Example with 7 elements
        int n = 4; // Example n = 2

        int len = arr.length;
        int[] res = new int[len];

        int xIndex = 0;
        int yIndex = n;

        for (int i = 0; i < len; i++) {
            if (xIndex < n) { // Still elements in the 'x' section
                if (i % 2 == 0) {
                    res[i] = arr[xIndex++];
                } else if (yIndex < len) { // Check if yIndex is within bounds
                    res[i] = arr[yIndex++];
                } else { // No more 'y' elements, take from 'x' if available
                  res[i] = arr[xIndex++];
                }
            } else if (yIndex < len) { // No more 'x' elements
                res[i] = arr[yIndex++];
            }
        }
        System.out.println(Arrays.toString(res));

```

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
## Coding Questions: [Solution](Basic_Programs.md)
```
1. Reverse a String:
 Write a Java program to reverse a given string.
2. Find the Largest Element in an Array:
 Find and print the largest element in an array.
3. Check for Palindrome:
 Determine if a given string is a palindrome (reads the same backward as forward).
4. Factorial Calculation:
 Write a function to calculate the factorial of a number.
5. Fibonacci Series:
 Generate the first n numbers in the Fibonacci sequence.
6. Check for Prime Number:
 Write a program to check if a given number is prime.
7. String Anagrams:
 Determine if two strings are anagrams of each other.

8. Array Sorting:
 Implement sorting algorithms like bubble sort, merge sort, or quicksort.

- Arrays.sort(). It uses a highly optimized dual-pivot quicksort algorithm and is usually the most efficient choice.
- Merge Sort: Use merge sort if you need a stable sort (elements with equal values maintain their relative order) or if you need guaranteed O(n log n) time complexity in all cases.
- Quick Sort: Quick sort is often the fastest in practice, but its worst-case time complexity is O(n^2). Use it when you need high performance and don't need a stable sort.
- Bubble Sort: Avoid bubble sort for anything other than very small datasets or educational purposes. It's extremely inefficient for larger datasets.

9. Binary Search:
 Implement a binary search algorithm to find an element in a sorted array.

10. Duplicate Elements in an Array:
 Find and print duplicate elements in an array.

11. Linked List Reversal:
 Reverse a singly-linked list.

12. Matrix Operations:
 Perform matrix operations like addition, multiplication, or transpose.

13. Implement a Stack:
 Create a stack data structure and implement basic operations (push, pop).

14. Implement a Queue:
 Create a queue data structure and implement basic operations (enqueue, dequeue).

15. Inheritance and Polymorphism:
 Implement a class hierarchy with inheritance and demonstrate polymorphism.

16. Exception Handling:
 Write code that demonstrates the use of try-catch blocks to handle exceptions.
17. File I/O:
 Read from and write to a file using Java's file I/O capabilities.
18. Multithreading:
 Create a simple multithreaded program and demonstrate thread synchronization.
19. Lambda Expressions:
 Use lambda expressions to implement functional interfaces.
20. Recursive Algorithms:
 Solve a problem using recursion, such as computing the factorial or Fibonacci sequence.

```
