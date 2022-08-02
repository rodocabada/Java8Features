package com.learn.java.factory;

import com.learn.java.data.Employee;
import com.learn.java.interfaces.IEmployeeFilter;

import java.util.Optional;
import java.util.function.Predicate;

public class FactoryEmployeeFilter {

    public static Predicate<Employee> getEmployeeNameFilter(String containsLetter) {
        return IEmployeeFilter.nameFilter(containsLetter);
    }

    public static Predicate<Employee> getEmployeeStreetFilter(String containsLetter) {
        return IEmployeeFilter.streetFilter(containsLetter);
    }
}
