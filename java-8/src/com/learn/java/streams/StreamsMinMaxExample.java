package com.learn.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(6,7,8,9,10);

        if (findMaxValue(integerList).isPresent()) {
            System.out.println(findMaxValue(integerList).get());
        }

        if (findMinValue(integerList).isPresent()) {
            System.out.println(findMinValue(integerList).get());
        }
    }

    private static Optional<Integer> findMaxValue(List<Integer> integerList) {
        return integerList.stream()
                .reduce(Integer::max);
    }

    private static Optional<Integer> findMinValue(List<Integer> integerList) {
        return integerList.stream()
                .reduce(Integer::min);
    }
}
