#### stream of numbers 1 to 1000 find the missing numbers

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

#### Streams

```
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamQA {
    //This program demonstrates various operations using Java Streams on a list of Student objects. 
    //It includes filtering, sorting, grouping, and aggregating data, such as finding the average age and the highest rank in each department.
    public static void main(String[] args) {


        List<Student> studentList = Stream.of(
                        new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122, Arrays.asList("+912632632782", "+1673434729929")),
                        new Student(2, "Pulkit", 56, "Male", "Computer Engineering", "Delhi", 67, Arrays.asList("+912632632762", "+1673434723929")),
                        new Student(3, "Ankit", 25, "Female", "Mechanical Engineering", "Kerala", 164, Arrays.asList("+912632633882", "+1673434709929")),
                        new Student(4, "Satish Ray", 30, "Male", "Mechanical Engineering", "Kerala", 26, Arrays.asList("+9126325832782", "+1671434729929")),
                        new Student(5, "Roshan", 23, "Male", "Biotech Engineering", "Mumbai", 12, Arrays.asList("+012632632782")),
                        new Student(6, "Chetan", 24, "Male", "Mechanical Engineering", "Karnataka", 90, Arrays.asList("+9126254632782", "+16736784729929")),
                        new Student(7, "Arun", 26, "Male", "Electronics Engineering", "Karnataka", 324, Arrays.asList("+912632632782", "+1671234729929")),
                        new Student(8, "Nam", 31, "Male", "Computer Engineering", "Karnataka", 433, Arrays.asList("+9126326355782", "+1673434729929")),
                        new Student(9, "Sonu", 27, "Female", "Computer Engineering", "Karnataka", 7, Arrays.asList("+9126398932782", "+16563434729929", "+5673434729929")),
                        new Student(10, "Shubham", 26, "Male", "Instrumentation Engineering", "Mumbai", 98, Arrays.asList("+912632646482", "+16734323229929")))
                .collect(Collectors.toList());

        // 1. Find the list of students whose rank is in between 50 and 100

        List<Student> students = studentList.stream().filter(student -> (student.getRank() >= 50 && student.getRank() <= 100)).collect(Collectors.toList());

        System.out.println(students);
        //2. Find the Students who stays in Karnataka and sort them by their names
        List<Student> karnatakaStudent = studentList.stream().filter(student -> student.getCity().equalsIgnoreCase("Karnataka")).sorted(Comparator.comparing(Student::getFirstName, Comparator.reverseOrder())).collect(Collectors.toList());
        System.out.println(karnatakaStudent);
        // 3. Find all departments names
        List<String> deptNames = studentList.stream().collect(Collectors.groupingBy(Student::getDept)).entrySet().stream().map(value -> value.getKey()).distinct().collect(Collectors.toList());
        System.out.println(deptNames);
        //4.  Find all the contact numbers
        List<String> contactList = studentList.stream().flatMap(student -> student.getContacts().stream()).collect(Collectors.toList());
        System.out.println(contactList);
        //5.  Group The Student By Department Names
        Map<String, List<Student>> groupByStudent = studentList.stream().collect(Collectors.groupingBy(Student::getDept));
        groupByStudent.forEach((k,v)->System.out.println(k+" -> "+v));
        //6. Find the department who is having maximum number of students
        Map.Entry<String, Long> maxDept = studentList.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(maxDept);
        //7. Find the average age of male and female students
        Map<String,Double> deptWiseStudentAge = studentList.stream().collect(Collectors.groupingBy(Student::getDept,Collectors.averagingInt(Student::getAge)));
        deptWiseStudentAge.forEach((k,v)->System.out.println(k+" -> "+v));
        //8. Find the highest rank in each department
        Map<String, Optional<Student>> highestRank =studentList.stream().collect(Collectors.groupingBy(Student::getDept,Collectors.maxBy(Comparator.comparing(Student::getDept))));
        highestRank.forEach((k,v)-> System.out.println(k + " -> " + v.get()));
        //9 .Find the student who has second rank
        Optional<Student> secondHighestRankHolder =studentList.stream().sorted(Comparator.comparing(Student::getRank,Comparator.reverseOrder())).skip(1).limit(1).findFirst();
        System.out.println(secondHighestRankHolder.get().getFirstName());
    }
}

```


#### 3. Streams

```
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    //This program demonstrates various operations with arrays using Java Streams, including reversing an array, 
    //finding the maximum and second maximum values, and calculating the sum of elements.
    public static void main(String[] args) {
            int[] arr1 = new int[]{1, 3, 5, 7};
            int[] b = new int[]{6, 7, 8};

            //Reverse Order
        List<Integer> reversedList =Stream.of(arr1,b).flatMapToInt(Arrays::stream).boxed().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList());
        System.out.println(reversedList);

        int max = reversedList.stream().findFirst().get();
        System.out.println(max);

        int secondMax = reversedList.stream().skip(1).limit(1).findFirst().get();
        System.out.print(secondMax);

        //naturalOrder

        int[] naturalOrderArray = Stream.of(arr1,b).flatMapToInt(Arrays::stream).sorted().toArray();
        Arrays.stream(naturalOrderArray).forEach(value -> System.out.println(value));

        //sum

        List<Integer> list = Arrays.asList(1,2,3,4,6,5,9,8,7);
        System.out.print(list.stream().mapToInt(Integer::intValue).sum());
    }
}

```

### 4. Streams
```
// Source code is decompiled from a .class file using FernFlower decompiler.
package Practice1;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractice {
   public StreamPractice() {
   }

   public static void main(String[] args) {
      List<Integer> list = (List)IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
      List<Integer> list1 = (List)IntStream.rangeClosed(11, 20).boxed().collect(Collectors.toList());
      Collections.reverse(list);
      PrintStream var10001 = System.out;
      list.forEach(var10001::println);
      Collections.reverse(list);
      System.out.println("Sum is " + list.stream().reduce(0, Integer::sum));
      System.out.println("Sum is " + list.stream().mapToLong(Integer::intValue).sum());
      System.out.println("Min is " + list.stream().min(Comparator.naturalOrder()).get());
      System.out.println("Max is " + list.stream().max(Comparator.naturalOrder()).get());
      System.out.println("Second Min is " + list.stream().sorted(Comparator.naturalOrder()).skip(1L).findFirst().get());
      System.out.println("Second Max is " + list.stream().sorted(Collections.reverseOrder()).skip(1L).findFirst().get());
      System.out.println("Count of list is " + list.stream().count());
      System.out.println(Stream.of(list, list1).flatMap(Collection::stream).count());
      System.out.println(Stream.of(list, list1).flatMap(Collection::stream).mapToLong(Integer::intValue).sum());
      Collection<Integer> combineSet = (Collection)Stream.of(list, list1).flatMap(Collection::stream).sorted().collect(Collectors.toCollection(LinkedHashSet::new));
      System.out.println(combineSet);
      combineSet.stream().filter((value) -> {
         return value % 2 == 0;
      }).forEach((value) -> {
         System.out.print(value + " ");
      });
      System.out.println();
      System.out.println("-------------------------------------");
      combineSet.stream().filter((value) -> {
         return value % 2 == 0;
      }).map((value) -> {
         return value + 1;
      }).forEach((value) -> {
         System.out.print(value + " ");
      });
      System.out.println();
      System.out.println(list.stream().allMatch((value) -> {
         return value % 2 == 0;
      }));
      System.out.println(list.stream().anyMatch((value) -> {
         return value % 2 == 0;
      }));
      System.out.println(list.stream().anyMatch((value) -> {
         return value % 2 == 0;
      }));
      System.out.println(list.stream().noneMatch((value) -> {
         return value > 100;
      }));
      List<String> mobileNumbers = Arrays.asList("+91 9912345678", "+1234567", "+91 9086543", "+24623476");
      Stream var10000 = mobileNumbers.stream().filter((value) -> {
         return value.startsWith("+91");
      });
      var10001 = System.out;
      var10000.forEach(var10001::println);
   }
}

```