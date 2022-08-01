package com.learn.java.exercises;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Exercise1 {
    static BiPredicate<String, String> startWithPredicate = Exercise1::startWithLetter;
    static Supplier<List<String>> listNameSupplier = Exercise1::getNameList;

    public static void main(String[] args) {

        List<String> resultList = listNameSupplier.get().stream()
                .filter(name -> startWithPredicate.test(name, "a"))
                .sorted()
                .collect(Collectors.toList());

        System.out.println(resultList);
    }
    private static List<String> getNameList(){
        return Arrays.asList("Antonio", "Jose", "Alma", "Daniel", "Rodolfo", "Alberto", "Eduardo", "Fernando", "Luis", "Francisco");
    }
    private static boolean startWithLetter(String name, String startLetter) {
        return name.toUpperCase().startsWith(startLetter.toUpperCase());
    }
}
