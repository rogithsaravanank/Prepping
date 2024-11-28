Here is the organized breakdown of the code examples and their purposes:

---

### **1. Find Missing Numbers in a Range**

**Code Snippet:**
```java
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 4, 5, 7, 8, 10, 999, 1000};
        List<Integer> missingNumbers = findMissingNumbers(inputArray);
        System.out.println("Missing numbers: " + missingNumbers);
    }

    public static List<Integer> findMissingNumbers(int[] inputArray) {
        Set<Integer> numberSet = Arrays.stream(inputArray).boxed().collect(Collectors.toSet());
        return IntStream.rangeClosed(1, 1000)
                        .filter(num -> !numberSet.contains(num))
                        .boxed()
                        .collect(Collectors.toList());
    }
}
```

**Purpose:**
This program identifies missing numbers from a specified range (1 to 1000) based on the given input array.

---

### **2. Student Stream Operations**

**Code Snippet:**
```java
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamQA {
    public static void main(String[] args) {
        List<Student> studentList = Stream.of(
                new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122, Arrays.asList("+912632632782", "+1673434729929")),
                // ... (remaining students omitted for brevity)
        ).collect(Collectors.toList());

        // 1. Students with ranks between 50 and 100
        List<Student> students = studentList.stream()
                .filter(student -> student.getRank() >= 50 && student.getRank() <= 100)
                .collect(Collectors.toList());

        // 2. Students from Karnataka, sorted by name
        List<Student> karnatakaStudents = studentList.stream()
                .filter(student -> student.getCity().equalsIgnoreCase("Karnataka"))
                .sorted(Comparator.comparing(Student::getFirstName, Comparator.reverseOrder()))
                .collect(Collectors.toList());

        // 3. All department names
        List<String> deptNames = studentList.stream()
                .map(Student::getDept)
                .distinct()
                .collect(Collectors.toList());

        // 4. All contact numbers
        List<String> contactList = studentList.stream()
                .flatMap(student -> student.getContacts().stream())
                .collect(Collectors.toList());

        // 5. Group students by department
        Map<String, List<Student>> groupByDept = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept));

        // 6. Department with the maximum number of students
        Map.Entry<String, Long> maxDept = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get();

        // 7. Average age of students per department
        Map<String, Double> avgAgeByDept = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept, Collectors.averagingInt(Student::getAge)));

        // 8. Highest rank in each department
        Map<String, Optional<Student>> highestRankByDept = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept, Collectors.maxBy(Comparator.comparing(Student::getRank))));

        // 9. Second-highest rank student
        Optional<Student> secondHighestRank = studentList.stream()
                .sorted(Comparator.comparing(Student::getRank).reversed())
                .skip(1)
                .findFirst();
    }
}
```

**Purpose:**
This code demonstrates advanced Java Streams operations for filtering, sorting, grouping, and aggregating data related to students.

---

### **3. Array Stream Operations**

**Code Snippet:**
```java
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] b = {6, 7, 8};

        // Reverse order
        List<Integer> reversedList = Stream.of(arr1, b)
                .flatMapToInt(Arrays::stream)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(reversedList);

        // Maximum and second maximum
        int max = reversedList.get(0);
        int secondMax = reversedList.get(1);
        System.out.println("Max: " + max + ", Second Max: " + secondMax);

        // Natural order
        int[] naturalOrderArray = Stream.of(arr1, b)
                .flatMapToInt(Arrays::stream)
                .sorted()
                .toArray();

        // Sum of list elements
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 6, 5, 9, 8, 7);
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum: " + sum);
    }
}
```

**Purpose:**
Performs operations on arrays such as reversing, finding max values, sorting, and summing using Java Streams.

---

### **4. Stream Practice with Numbers**

**Code Snippet:**
```java
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> list = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
        List<Integer> list1 = IntStream.rangeClosed(11, 20).boxed().collect(Collectors.toList());

        // Reverse and display list
        Collections.reverse(list);
        list.forEach(System.out::println);

        // Sum, Min, Max, Second Min/Max
        int sum = list.stream().reduce(0, Integer::sum);
        int min = list.stream().min(Comparator.naturalOrder()).get();
        int max = list.stream().max(Comparator.naturalOrder()).get();
        int secondMin = list.stream().sorted().skip(1).findFirst().get();
        int secondMax = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

        // Combine and filter lists
        Collection<Integer> combinedSet = Stream.of(list, list1)
                .flatMap(Collection::stream)
                .sorted()
                .collect(Collectors.toCollection(LinkedHashSet::new));

        combinedSet.stream().filter(value -> value % 2 == 0).forEach(value -> System.out.print(value + " "));
    }
}
```

**Purpose:**
Demonstrates combined operations on multiple lists, including reversing, filtering, and computing aggregate values like sum, min, and max.

---

This organization groups the programs by functionality and ensures clarity for each section. Let me know if you'd like further refinements!