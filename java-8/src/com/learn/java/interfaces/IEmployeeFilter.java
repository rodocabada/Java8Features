package com.learn.java.interfaces;

import com.learn.java.data.Employee;

import java.util.function.Predicate;

public interface IEmployeeFilter {

    static Predicate<Employee> nameFilter(String containsLetter) {
        return employee -> employee.getName().toUpperCase().contains(containsLetter.toUpperCase());
    }

    static Predicate<Employee> streetFilter(String containsLetter) {
        return employee -> employee.getAddress().getStreet().toUpperCase().contains(containsLetter.toUpperCase());
    }
}
