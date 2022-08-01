package com.learn.java.exercises;

import java.util.HashMap;
import java.util.Map;

public class Exercise2 {


    public static void main(String[] args) {
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 8};
        int target = 13;

        findPairToTarget(intArray, target);
    }

    private static void findPairToTarget(int[] intArray, int target){
        Map<Integer, Integer> mapNumbers = new HashMap<>();
        for (int i = 0; i < intArray.length; i++) {
            if(mapNumbers.containsKey(target - intArray[i])) {
                System.out.println("Numbers are: " + (target - intArray[i]) + "," + intArray[i]);
                return;
            }
            mapNumbers.put(intArray[i], i);
        }
        System.out.println("No pair of numbers were found.");
    }
}
