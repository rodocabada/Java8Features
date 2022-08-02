package com.learn.java.exercises;

import com.learn.java.data.Employee;
import com.learn.java.data.EmployeeDatabase;
import com.learn.java.factory.FactoryEmployeeFilter;

import java.util.stream.Collectors;

public class Exercise4 {

    public static void main(String[] args) {
        printFilteredEmployees("a", "e");
    }

    public static void printFilteredEmployees(String nameLetter, String streetLetter) {
        EmployeeDatabase.getEmployeeList.get().stream()
                .filter(FactoryEmployeeFilter.getEmployeeNameFilter(nameLetter))
                .filter(FactoryEmployeeFilter.getEmployeeStreetFilter(streetLetter))
                .map((employee -> employee.getAddress().getExteriorNumber()))
                .forEach(System.out::println);
    }
}
