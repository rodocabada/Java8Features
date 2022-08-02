package com.learn.java.data;

import com.learn.java.enums.PersonOrderTypeEnum;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class PersonDataBase {

    public static Supplier<List<Person>> getPersonList = () -> {
        Person person1 = new Person("Rodolfo", "Cabada", 34);
        Person person2 = new Person("Daniel", "Fernandez", 35);
        Person person3 = new Person("Eduardo", "Ochoa", 30);
        Person person4 = new Person("Fernando", "Colon", 40);
        Person person5 = new Person("Cesar", "Gonzalez", 38);
        Person person6 = new Person("Luis", "Ramirez", 31);

        return Arrays.asList(person1, person2, person3, person4, person5, person6);
    };
}
