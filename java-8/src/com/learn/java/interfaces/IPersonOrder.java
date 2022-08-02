package com.learn.java.interfaces;

import com.learn.java.data.Person;

import java.util.Comparator;

public interface IPersonOrder {
    static Comparator<Person> nameOrder(){
        return Comparator.comparing(Person::getName);
    }

    static Comparator<Person> lastNameOrder(){
        return Comparator.comparing(Person::getLastName);
    }

    static Comparator<Person> ageOrder(){
        return Comparator.comparing(Person::getAge);
    }
}
