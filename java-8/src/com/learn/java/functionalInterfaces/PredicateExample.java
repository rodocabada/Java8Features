package com.learn.java.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> predicate1 = (i) -> i % 2 == 0;
    static Predicate<Integer> predicate2 = (i) -> i % 5 == 0;

    public static void main(String[] args) {

        System.out.println(predicate1.test(4));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }

    public static void predicateAnd(){
        System.out.println("Predicate And Result is: " + predicate1.and(predicate2).test(10)); //predicate chaining
        System.out.println("Predicate And Result is: " + predicate1.and(predicate2).test(8));
    }

    public static void predicateOr(){
        System.out.println("Predicate Or Result is: " + predicate1.or(predicate2).test(10)); //predicate chaining
        System.out.println("Predicate Or Result is: " + predicate1.or(predicate2).test(9));
    }

    public static void predicateNegate(){
        System.out.println("Predicate Negate Result is: " + predicate1.or(predicate2).negate().test(10)); //predicate chaining
    }
}
