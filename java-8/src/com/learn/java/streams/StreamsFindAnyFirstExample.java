package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {

    public static void main(String[] args) {

        if (findAnyStudent().isPresent()) {
            System.out.println(findAnyStudent().get());
        }

        if (findFirstStudent().isPresent()) {
            System.out.println(findFirstStudent().get());
        }

    }

    public static Optional<Student> findAnyStudent() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() >= 3.9)
                .findAny();
    }

    public static Optional<Student> findFirstStudent() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() >= 4.1)
                .findFirst();
    }
}
