package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
    static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

    public static void main(String[] args) {

        //student name and their activities in a map
        Map<String, List<String>> studentsMap = StudentDataBase.getAllStudents().stream()
                .peek((student -> {
                    System.out.println(student);
                }))
                .filter(p1)
                .peek((student -> {
                    System.out.println("After 1 filter: " + student);
                }))
                .filter(p2)
                .peek((student -> {
                    System.out.println("After 2 filter: " + student);
                }))
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(studentsMap);
    }
}
