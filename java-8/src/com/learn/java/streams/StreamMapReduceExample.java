package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Optional;

public class StreamMapReduceExample {

    public static void main(String[] args) {
        System.out.println(numberOfNoteBooks());
        if (studentWithMaxNoteBooks().isPresent()) {
            System.out.println(studentWithMaxNoteBooks().get());
        }
    }

    private static int numberOfNoteBooks() {
        return StudentDataBase.getAllStudents().stream()
                .filter((s) -> s.getGradeLevel() >= 3)
                .filter((s) -> s.getGender().equals("female"))
                .map(Student::getNoteBooks)
                /*.reduce(0, (a, b) -> a + b);*/
                .reduce(0, Integer::sum);
    }

    private static Optional<Student> studentWithMaxNoteBooks() {
        return StudentDataBase.getAllStudents().stream()
                .filter((s) -> s.getGradeLevel() >= 3)
                .filter((s) -> s.getGender().equals("female"))
                .reduce((s1, s2) -> (s1.getNoteBooks() > s2.getNoteBooks()) ? s1 : s2);
    }
}
