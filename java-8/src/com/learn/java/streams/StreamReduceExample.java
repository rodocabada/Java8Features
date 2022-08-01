package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,3,5,7);

        System.out.println(performMultiplication(integerList));

        if (performMultiplicationWithoutIdentity(integerList).isPresent()) {
            System.out.println(performMultiplicationWithoutIdentity(integerList).get());
        }

        if (getHighestGpaStudent().isPresent()) {
            System.out.println(getHighestGpaStudent());
        }
    }

    public static int performMultiplication(List<Integer> integerList) {
        return integerList.stream()
                .reduce(1, (a, b) -> a * b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList) {
        return integerList.stream()
                .reduce((a, b) -> a * b);
    }

    public static Optional<Student> getHighestGpaStudent() {
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1, s2) -> (s1.getGpa() > s2.getGpa()) ? s1 : s2);
    }
}
