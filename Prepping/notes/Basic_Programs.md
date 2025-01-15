```
package com.example.interview;

import java.lang.StackWalker.Option;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Employee employee = new Employee();

        HashSet<Employee> set = new HashSet<>();

        employee.setAge(23);
        employee.setName("Alice");
        Employee employee1 = new Employee();
        set.add(employee);
        employee1.setAge(25);
        employee1.setName("dolice");
        set.add(employee1);

        System.out.println(set);

        List<Employee> lst = new ArrayList<>();

        lst.add(employee1);
        lst.add(employee);

        Optional<Employee> e = lst.stream().skip(1).max(Comparator.comparingInt(Employee::getAge));

        System.out.println(e.toString());

        HashSet<Alien> alienSet = new HashSet<>();

        alienSet.add(new Alien(21, "Alien 1"));
        alienSet.add(new Alien(24, "Alien 2"));
        alienSet.add(new Alien(24, "Alien 2"));

        alienSet.forEach(a -> System.out.println(a));

        // select * from employee order by salary desc OFFSET 1 FETCH FIRST 1 ROW ONLY
        reverseString("terenes");

        int[] arr = { 1, 9, 3, 4, 5, 6, 2, 2, 4 };

        // Find and print the largest element in an array
        largestElementInArray(arr);

        // Check for Palindrome ,Determine if a given string is a palindrome (reads the
        // same backward as forward)
        String pString = "test";
        System.out.println(checkPalindrome(pString));

        // Factorial Calculation: Write a function to calculate the factorial of a
        // number.
        int factorial = 5;
        factorialFunction(factorial);

        // Fibonacci Series:Generate the first n numbers in the Fibonacci sequence.

        fibonacciFunction(9);

        // Check for Prime Number: Write a program to check if a given number is prime.

        checkPrime(9);

        // String Anagrams: Determine if two strings are anagrams of each other.

        checkAnagram("bosb");

        // Binary Search: Implement a binary search algorithm to find an element in a
        // sorted array.
        
        binarySearch(arr, 5);

        // Duplicate Elements in an Array:Find and print duplicate elements in an array.
        findDuplicates(arr);

        // Reverse a singly Linked list
        // LinkedListReversalRecursive

        // Exception Handling: Write code that demonstrates the use of try-catch blocks
        // to handle exceptions.
        // 1. Handling ArithmeticException (division by zero)
        // try {
        // int result = 10 / 0; // This will throw an ArithmeticException
        // System.out.println("Result: " + result); // This line won't be executed
        // } catch (ArithmeticException e) {
        // System.err.println("Error: Division by zero - " + e.getMessage());
        // }

        // 4. Multiple catch blocks and a more general exception
        // try {
        // int[] numbers = {1, 2, 3};
        // System.out.println(numbers[5]); // This will throw
        // ArrayIndexOutOfBoundsException
        // String str = null;
        // System.out.println(str.length()); // This will throw NullPointerException
        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.err.println("Error: Array index out of bounds - " + e.getMessage());
        // } catch (NullPointerException e) {
        // System.err.println("Error: Null pointer exception - " + e.getMessage());
        // } catch (Exception e){ // Catch any other exception
        // System.err.println("A general exception occurred: "+e.getMessage());
        // }

        // Lambda Expressions: Use lambda expressions to implement functional
        // interfaces.

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running without Lambda");
            }
        };

        Runnable runnable2 = () -> System.out.println("Running with lambda");
        // FunctionalInterface -> has only one abstract method
        // lambda expressions are anonymous functions which enables functional
        // programming in java
        // Runnable: void run()
        // Comparator: int compare(T o1, T o2)
        // Consumer<T>: void accept(T t)
        // Function<T, R>: R apply(T t)
        // Predicate<T>: boolean test(T t)

        System.out.println(fibonacciFunctionRecursive(4));

        // find the smallest positive integer missing from array

        getMin();
        getN();

        // Given an array of strings, find all groups of anagrams. Anagrams are words
        // that contain the same characters, but in a different order (e.g., "listen"
        // and "silent"). Group the anagrams together into a list of lists (a list where
        // each element is a list of anagram

        groupAnagrams();

        // frequnecy of each character

        frequencyMap();

        getArr1();

        longestSubstringNonRepeatingChar("abcabcbb");
        
        // Write a single statement using java to fetch 3 highest elements from an unsorted array.

        int[] arr1 = { 1, 9, 3, 4, 5, 6, 2, 2, 4 };
        System.out.println(Arrays.toString(arr1));

        List<Integer> lst1= Arrays.stream(arr1).boxed().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        System.out.println(lst1);
            }
        
            private static void longestSubstringNonRepeatingChar(String str) {

                int i=0,j=0;
                int n=str.length();

                int maxLen=0;
                int longestStart=0,longestEnd=0;

                Set<Character> set=new HashSet<>();

                while(i<n&&j<n){

                if(!set.contains(str.charAt(j))){
                    set.add(str.charAt(j));
                    j++;
                    if(j-i>maxLen){
                        maxLen=j-i;
                        longestStart=i;
                        longestEnd=j;
                    }
                }
                else{
                    set.remove(str.charAt(i));
                    i++;
                }
                
                }

                System.out.println(str.substring(longestStart,longestEnd));

            }
        
            private static void getArr1() {
        // first more than one character
        String res="rogithsaravanank";

        HashMap<Character,Integer> map=new HashMap<>();
        char[] arr1=res.toCharArray();
        for(char a:arr1){
           map.put(a, map.getOrDefault(a, 0)+1);
        }

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>1) {System.out.println(entry.getKey());break;}
        }
        // first non repeating character

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==1) {System.out.println(entry.getKey());break;}
        }
    }

    private static void frequencyMap() {
        String[] arrStrings= {"a","r","r","c","a","r","z","y"};

        Map<String,Long> map=Arrays.stream(arrStrings).filter(e1->e1!=null).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(map);

        String res="rogithsaravanank";

        Map<Character,Long> map1=res.chars().mapToObj(a1->(char)a1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map1);

    }

    private static void groupAnagrams() {
        String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : arr) {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String strSorted = new String(charArr);

            map.computeIfAbsent(strSorted, k -> new ArrayList<>()).add(str);
        }

        System.out.println(map);

    }

    private static void getN() {
        int[] nums = { 1, 3, 9, 6, 4, 8, 1, 2, 7 };
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            if (num <= n && nums[num - 1] > 0) {
                nums[num - 1] = -nums[num - 1];
            }
        }

        for (int j = 0; j < n; j++) {
            if (nums[j] > 0)
                System.out.println(j + 1);
        }

        // System.out.println(Arrays.toString(nums));
    }

    private static void getMin() {
        int[] arr2 = { 1, 3, 6, 4, 1, 2 };

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        int min = 1;

        // Set<Integer> set2=Arrays.stream(arr2).boxed().collect(Collectors.toSet());

        for (int num : arr2) {
            if (num > min)
                System.out.println(min);

            if (num == min)
                min++;
        }
    }

    private static int fibonacciFunctionRecursive(int factorial) {
        if (factorial <= 1)
            return factorial;
        return fibonacciFunctionRecursive(factorial - 1) + fibonacciFunctionRecursive(factorial - 2);
    }

    public class LinkedListReversalRecursive {

        static class Node {
            int data;
            Node next;

            Node(int d) {
                data = d;
                next = null;
            }
        }

        public static Node reverseList(Node head) {
            if (head == null || head.next == null) {
                return head; // Base case: empty list or single node
            }

            Node newHead = reverseList(head.next); // Recursive call

            head.next.next = head; // Reverse the link
            head.next = null; // Important: Set the original next to null

            return newHead;
        }

        public static void printList(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);

            System.out.print("Original List: ");
            printList(head); // Output: 1 2 3 4

            head = reverseList(head);

            System.out.print("Reversed List: ");
            printList(head); // Output: 4 3 2 1
        }
    }

    private static void findDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> setDuplicates = new HashSet<>();

        for (int a : arr) {
            if (set.contains(a))
                setDuplicates.add(a);
            else
                set.add(a);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(setDuplicates);
    }

    private static void binarySearch(int[] arr, int target) {
        // int index = Arrays.binarySearch(arr, target);
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (target == arr[mid]) {
                System.out.println(mid);
                break;
            } else if (target > arr[mid])
                left = mid;
            else
                right = mid;
        }

        // System.out.println(index);

    }

    private static void checkAnagram(String string) {
        int len = string.length() - 1;
        char[] arr = string.toCharArray();
        String res = "Anagram";
        for (int i = 0; i < string.length() / 2; i++) {
            if (arr[i] != arr[len--])
                res = "Not a Anagram";
        }
        System.out.println(res);

    }

    private static void checkPrime(int num) {
        String res = "Prime";
        if (num <= 1)
            res = "Not a Prime";
        else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    res = "Not a Prime";
                    break;
                }
            }
        }

        System.out.println(res);
    }

    private static void fibonacciFunction(int i) {
        int num1 = 0;
        int num2 = 1;

        for (int j = 1; j <= i; ++j) {
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
        System.out.println();

    }

    private static void factorialFunction(int factorial) {
        int a = IntStream.rangeClosed(1, factorial).reduce(1, (t, b) -> t * b);
        System.out.println("Factorial " + a);
    }

    private static boolean checkPalindrome(String pString) {
        char[] pStringArray = pString.toCharArray();
        int len = pString.length() - 1;

        for (int i = 0; i < pString.length() / 2; i++) {
            if (pStringArray[i] != pStringArray[len--])
                return false;
        }
        return true;
    }

    private static void largestElementInArray(int[] arr) {
        // Arrays.sort(arr);
        Optional max = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).findFirst();

        Optional min = Arrays.stream(arr).boxed().sorted().findFirst();

        Optional max1 = Arrays.stream(arr).boxed().min(Comparator.reverseOrder());

        Optional max2 = Arrays.stream(arr).boxed().max(Integer::compareTo);

        System.out.println("max " + max + " min " + min);
    }

    public static void reverseString(String str) {
        char[] strChar = str.toCharArray();
        int len = str.length() - 1;
        for (int i = 0; i < str.length() / 2; i++) {
            char a = strChar[i];
            strChar[i] = strChar[len];
            strChar[len--] = a;
        }

        System.out.println(Arrays.toString(strChar));

        System.out.println(new StringBuilder(str).reverse().toString());

    }

}
```
