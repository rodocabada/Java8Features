package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    static Comparator<Student> comparatorNameAlphabetical = Comparator.comparing(Student::getName);
    static Comparator<Student> gpaAscending = Comparator.comparing(Student::getGpa);
    static Comparator<Student> gpaDescending = Comparator.comparing(Student::getGpa).reversed();

    public static void main(String[] args) {
        System.out.println("Students sorted by name: ");
        sortStudentsByName().forEach(System.out::println);

        System.out.println("Students sorted by gpa Ascending: ");
        sortStudentsByGpaAscending().forEach(System.out::println);

        System.out.println("Students sorted by gpa Descending: ");
        sortStudentsByGpaDescending().forEach(System.out::println);
    }

    public static List<Student> sortStudentsByName() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(comparatorNameAlphabetical)
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentsByGpaAscending() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(gpaAscending)
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentsByGpaDescending() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(gpaDescending)
                .collect(Collectors.toList());
    }

}
