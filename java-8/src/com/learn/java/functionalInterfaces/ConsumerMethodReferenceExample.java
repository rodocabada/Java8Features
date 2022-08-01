package com.learn.java.functionalInterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {
    static Consumer<Student> consumerLambda = p -> System.out.println(p);
    static Consumer<Student> consumerMethodReference = System.out::println;
    static Consumer<Student> consumerActivities = Student::printActivities;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(consumerLambda);
        StudentDataBase.getAllStudents().forEach(consumerMethodReference);
        StudentDataBase.getAllStudents().forEach(consumerActivities);
    }
}
