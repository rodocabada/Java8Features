package com.learn.java.data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class EmployeeDatabase {

    public static Supplier<List<Employee>> getEmployeeList = () -> {
        Employee employee1 = new Employee("Rodolfo", "Cabada", new Address("Corona Real", "N/A", "1537"));
        Employee employee2 = new Employee("Daniel", "Fernandez", new Address("Vialidad Sacramento", "15", "1030"));
        Employee employee3 = new Employee("Eduardo", "Ochoa", new Address("Villa Juarez", "N/A", "3456-A"));
        Employee employee4 = new Employee("Fernando", "Colon", new Address("Av. Tecnologico", "25", "1523"));
        Employee employee5 = new Employee("Cesar", "Gonzales", new Address("Av. Dostoyevsky", "N/A", "7485"));
        Employee employee6 = new Employee("Luis", "Ramirez", new Address("Granjas", "N/A", "35614"));

        return Arrays.asList(employee1, employee2, employee3, employee4, employee5, employee6);
    };
}
