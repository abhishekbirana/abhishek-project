package com.example.java8features.StreamDistinctCount;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main01_StreamDCEx03 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "1", "2", "3", "4");

        Optional<String> reducedValue = list.stream().reduce((value, combinedvalue) -> {
            return value + combinedvalue;
        });
        System.out.println(reducedValue.get());

        Optional<String> reducedValue2 = list.stream().reduce((value, combinedvalue) -> {
            return combinedvalue + value;
        });
        System.out.println(reducedValue2.get());

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> reducedValue3 = numbers.stream().reduce((a, b) -> {
            return a + b;
        });
        System.out.println(reducedValue3.get());
    }
}
