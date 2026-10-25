package org.example;

import java.util.*;

public class DriverClass {
    public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("Kanak");
    list.add("Sanket");
    list.add("Mohan");
    list.add("Shshank");
    list.add("Sanket");
    System.out.println("List of names: " + list);

    Set<String> set = new HashSet<>();
    set.add("Kanak");
    set.add("Sanket");
    set.add("Mohan");
    set.add("Shshank");
    set.add("Sanket");
    System.out.println("Set of names: " + set);

    List<Student> students = new ArrayList<>();
    students.add(new Student("Kanak", 20));
    students.add(new Student("Sanket", 22));
    students.add(new Student("Mohan", 21));
    students.add(new Student("Kanak", 20));
    System.out.println("List of students: " + students);

        Set<Student> setOfStudents = new HashSet<>();
        setOfStudents.add(new Student("Kanak", 20));
        setOfStudents.add(new Student("Sanket", 22));
        setOfStudents.add(new Student("Mohan", 21));
        setOfStudents.add(new Student("Kanak", 20));
        System.out.println("Set of students: " + setOfStudents);

        Map<String, Integer> studentAgeMap = new HashMap<>();
        studentAgeMap.put("Kanak", 20);
        studentAgeMap.put("Sanket", 20);
        studentAgeMap.put("Mohan", 21);
        studentAgeMap.put("Kanak", 20); // Duplicate key, will overwrite the previous value
        System.out.println("Map of student ages: " + studentAgeMap);

    }
}
