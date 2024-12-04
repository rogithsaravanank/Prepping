package org.example;

import java.util.List;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStudent {
    public static void main(String[] args) {
        // Sample List of Students
        List<Student> students = Arrays.asList(
            new Student("Alice", 20),
            new Student("Bob", 22),
            new Student("Charlie", 21),
            new Student("David", 21),
            new Student("Eve", 22), 
            new Student("Frank", 20)
        );

        // Group students by age and count the occurrences
Map<Integer, Long> ageCounts = students.stream().collect(Collectors.groupingBy(Student::getAge,Collectors.counting()));

        // Print the results
        ageCounts.forEach((age, count) -> 
            System.out.println("Age: " + age + ", Count: " + count)
        );

        Optional<Student> lowestAge=students.stream().min(Comparator.comparingInt(Student::getAge));
        System.out.println(lowestAge.get().getName());

        List<Student> Age=students.stream().sorted(Comparator.comparingInt(Student::getAge)).collect(Collectors.toList());
        Age.forEach(System.out::println);


        

    }
}
