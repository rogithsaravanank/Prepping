## 1. Consecutive Substring - Vimeo

Input : String s = “abcabd”;
Output: “abcab”, “d” 

Example: “dxabxad” = “dxabxad”


## 2. ![codility](images/codility1.jpeg)


## 3. ![codility ](images/codility2.jpeg)


## 4. ![codility ](images/codility3.jpeg)


## 5. ![codility ](images/codility3.jpeg)


## 6. ![Leetcode ](images/leetcode1.jpeg) - Athena Health Care


## 7. ![Leetcode ](images/leetcode2.jpeg) - Athena Health Care


## 8. ![Leetcode ](images/Athena-coding.jpeg) - Athena Health Care


## 9. ![Leetcode ](images/Athena-coding1.jpeg) - Athena Health Care


## 10. ![Leetcode ](images/goldmansach1.jpeg) - GoldmanSach


## 11. ![Leetcode ](images/goldmansach2.jpeg) - GoldmanSach


## 12. ![Codeing ](images/starhealth1.jpeg) - StarHealth


## 13. ![Codeing ](images/starhealth2.jpeg) - StarHealth

## 14. Gen Digital
Gen Digital (Chennai) algorithm round questions:

- 1.Write Logic for ATM machine  

// Input: Enter the amt: 2630 

// Output:  
// 1000 - 2 
// 500 - 1 
// 100 - 1 
// 20 - 1 
// 10 - 1 
// Assume there are infinite number of notes in atm machine

``` import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();
        
        int[] denominations = {1000, 500, 100, 50, 20, 10, 5, 1};
        int[] notesCount = new int[denominations.length];
        
        for (int i = 0; i < denominations.length; i++) {
            if (amount >= denominations[i]) {
                notesCount[i] = amount / denominations[i];
                amount = amount % denominations[i];
            }
        }
        
        System.out.println("Output:");
        for (int i = 0; i < denominations.length; i++) {
            if (notesCount[i] != 0) {
                System.out.println(denominations[i] + " - " + notesCount[i]);
            }
        }
        
        scanner.close();
    }
}
```

- 2. String s = “TestABCDE”

Find max repeating character and min repeating character (both case insensitive). If there are same number of repeating characters:
For max -> pick the first character alphabetically
For min -> pick the last character alphabetically

For this given input T is repeating 2 times, so max is T
e, s, A, B, C, D, E are all repeating 1 time, so take s as it is the last in alphabetical order

And then invert max and min

Output: seTsABCDE


``` 
import java.util.*;

public class StringManipulation {
    public static void main(String[] args) {
        String s = "TestABCDE";
        System.out.println(invertMaxMinCharacters(s));
    }

    public static String invertMaxMinCharacters(String s) {
        // Convert string to lowercase to handle case insensitivity
        String lowerCaseStr = s.toLowerCase();
        
        // Use a TreeMap to maintain alphabetical order
        TreeMap<Character, Integer> frequencyMap = new TreeMap<>();
        
        // Count frequency of each character
        for (char ch : lowerCaseStr.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        
        // Find the max and min frequency characters
        char maxChar = '\0';
        char minChar = '\0';
        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;
        
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            char ch = entry.getKey();
            int freq = entry.getValue();
            
            // For max frequency character
            if (freq > maxFreq || (freq == maxFreq && ch < maxChar)) {
                maxFreq = freq;
                maxChar = ch;
            }
            
            // For min frequency character
            if (freq < minFreq || (freq == minFreq && ch > minChar)) {
                minFreq = freq;
                minChar = ch;
            }
        }
        
        // Invert the positions of maxChar and minChar in the original string
        char[] resultArray = s.toCharArray();
        char maxCharOriginal = Character.toUpperCase(maxChar);
        char minCharOriginal = Character.toUpperCase(minChar);
        
        for (int i = 0; i < resultArray.length; i++) {
            if (Character.toLowerCase(resultArray[i]) == maxChar) {
                resultArray[i] = Character.isUpperCase(resultArray[i]) ? minCharOriginal : minChar;
            } else if (Character.toLowerCase(resultArray[i]) == minChar) {
                resultArray[i] = Character.isUpperCase(resultArray[i]) ? maxCharOriginal : maxChar;
            }
        }
        
        return new String(resultArray);
    }
}
```

## 15. Availity (full remote) question:

Koko loves to eat bananas. There are N piles of bananas, the i-th pile has piles[i] bananas. The guards have gone and will come back in H hours.
Koko can decide her bananas-per-hour eating speed of K. Each hour, she chooses some pile of bananas, and eats K bananas from that pile.
 If the pile has less than K bananas, she eats all of them instead, and won't eat any more bananas during this hour.
Koko likes to eat slowly but still wants to finish eating all the bananas before the guards come back.
Return the minimum integer K such that she can eat all the bananas within H hours.

Input: piles = [30,11,23,4,20], H = 6
Output: 23

Input: piles = [3,6,7,11], H = 8
Output: 4"

**https://www.geeksforgeeks.org/koko-eating-bananas/**

## 16. Opentext 1st round:
1. Twosum
2. Return unique elements in a sorted integer array, without using map

## 17. Opentext round two

input: {{4, 6}, {6, 5}, {7, 3}, {4, 5}}
output: {6, 5}

Given a 2D array, where each index i is a petrol bunk. arr[i][0] is the fuel you can fill from the petrol bulk, and arr[i][1] is the distance to next petrol bunk. 

Find the first bunk where you have to start so that you can reach the same bunk after covering every bunk (assume first bunk comes after last one in a circular road). Also you start with 0 fuel and assume mileage to be 1 unit of fuel for 1 unit of distance.


## 18. Tavant:  Implement heap sort

## 19. Tavant: Implement binary search on a sorted array

## 20. Tavant: Find longest substring with unique characters in a given string

## 21. stream of numbers 1 to 1000 find the missing numbers
```
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public static void main(String[] args) {
        // Example input array with some numbers missing
        int[] inputArray = {1, 2, 4, 5, 7, 8, 10, 999, 1000};

        // Find missing numbers using Java Streams
        List<Integer> missingNumbers = findMissingNumbers(inputArray);

        // Print the missing numbers
        System.out.println("Missing numbers: " + missingNumbers);
    }

    public static List<Integer> findMissingNumbers(int[] inputArray) {
        // Convert input array to a Set for O(1) look-up times
        Set<Integer> numberSet = Arrays.stream(inputArray).boxed().collect(Collectors.toSet());

        // Find numbers from 1 to 1000 that are not in the set
        return IntStream.rangeClosed(1, 1000)
                        .filter(num -> !numberSet.contains(num))
                        .boxed()
                        .collect(Collectors.toList());
    }
}
```

## 22. Walmart - Asked merge intervals in first round and then asked to design power-bi reporting system

## 23. Stream problems examples  
1. find the sum of squares of all even numbers      
java 
Arrays.stream(input)
  .filter(x->x%2==0)
  .map(x->x*x)
  .forEach(System.out::println)


2. Find second max of student age.  
java 
int age = list.stream
            .mapToInt(student::getAge)
            .skip(1).max();


3. Find list of unique characters present in all the string.  
java
Set<Character> uniqueChars = listOfStrings.stream()
                              .flatMap(str -> str.chars().mapToObj(ch -> (char) ch))
                              .collect(Collectors.toSet());


4. Group students count by age.   
java
list.stream()
  .collect(
      Collectors.groupingBy(Student::getAge, Collectors.counting()));


5. Convert a list into map  
java
list.stream()
  .collect(
    Collection.toMap(Function.identity(),Function.identity()));

6. Sort and reverseorder
java
Arrays.stream(arr)
  .boxed()
  .sorted(Comparator.reverseOrder())
  .limit(2)

7. Get count of each char    
java 
str.chars()
  .boxed()
  .collect(
    Collectors.groupingBy(Function.identity(), Collectors.counting()));
 

8. Sort by salary  
employeeList.stream().sorted(Comparator.comparingInt(Employee::getSalary))
9. Find employee with lowest salary
employeeList.stream().min(Comparator.comparingInt(Employee::getSalary))
10. Join given list values with comma
Arrays.stream(names).collect(Collectors.joining(","));
11. Combine array matrix values in a set
Arrays.stream(matrixInput).flatMapToInt(Arrays::stream).boxed().collect(Collectors.toList())