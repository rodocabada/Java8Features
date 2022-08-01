package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {

    public static void main(String[] args) {
        System.out.println(printActivities());
        System.out.println(printDistinctActivities());
        System.out.println(printDistinctCountActivities());
        System.out.println(printDistinctSortedActivities());

    }

    public static List<String> printActivities() {
       return StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
               .flatMap(List::stream) //Stream<String>
                .collect(Collectors.toList());
    }

    public static List<String> printDistinctActivities() {
        return StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //Stream<String>
                .distinct() //Stream<String> distinct
                .collect(Collectors.toList());
    }

    public static long printDistinctCountActivities() {
        return StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //Stream<String>
                .distinct() //Stream<String> distinct
                .count(); // long with the count of distinct activities
    }

    public static List<String> printDistinctSortedActivities() {
        return StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //Stream<String>
                .distinct() //Stream<String> distinct
                .sorted() //Stream<String> in natural order
                .collect(Collectors.toList());
    }

}
