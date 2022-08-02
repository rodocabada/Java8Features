package com.learn.java.exercises;

import com.learn.java.data.PersonDataBase;
import com.learn.java.enums.PersonOrderTypeEnum;
import com.learn.java.factory.FactoryPersonOrder;

import java.util.stream.Collectors;

public class Exercise3 {

    public static void main(String[] args) {

        System.out.println("Persons ordered by name.");
        printOrderedList(PersonOrderTypeEnum.Name);

        System.out.println("Persons ordered by last name.");
        printOrderedList(PersonOrderTypeEnum.LastName);

        System.out.println("Persons ordered by age.");
        printOrderedList(PersonOrderTypeEnum.Age);

        System.out.println("Persons ordered by address.");
        printOrderedList(PersonOrderTypeEnum.Address);
    }

    private static void printOrderedList(PersonOrderTypeEnum orderType) {
        if (FactoryPersonOrder.getPersonOrder(orderType).isPresent()) {
            PersonDataBase.getPersonList.get().stream()
                    .sorted(FactoryPersonOrder.getPersonOrder(orderType).get())
                    .collect(Collectors.toList())
                    .forEach(System.out::println);
        } else {
            System.out.println(String.format("Order type: " + orderType + " does not exist."));
        }
    }
}
