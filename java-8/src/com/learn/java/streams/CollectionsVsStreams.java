package com.learn.java.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStreams {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Jim");
        names.add("Jenny");

        for (String name: names) {
            System.out.println(name);
        }

        names.remove(0);

        System.out.println(names);

        Stream<String> nameStream =  names.stream();

        nameStream.forEach(System.out::println);


    }
}
