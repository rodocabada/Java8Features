package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {

    public static void main(String[] args) {
        filterStudents().forEach(System.out::println);
    }

    public static List<Student> filterStudents() {
       return StudentDataBase.getAllStudents().stream()
                .filter((student -> student.getGender().equals("female")))
                .collect(Collectors.toList());
    }
}
