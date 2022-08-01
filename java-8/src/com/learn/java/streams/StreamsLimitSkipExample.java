package com.learn.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        if (limit(integerList, 3).isPresent()) {
            System.out.println(limit(integerList, 3).get());
        }

        if (skip(integerList, 3).isPresent()) {
            System.out.println(skip(integerList, 3).get());
        }
    }

    public static Optional<Integer> limit(List<Integer> integerList, int limit) {
        return integerList.stream()
                .limit(limit)
                .reduce((x, y) -> x + y);
    }

    public static Optional<Integer> skip(List<Integer> integerList, int skip) {
        return integerList.stream()
                .skip(skip)
                .reduce((x, y) -> x + y);
    }


}
