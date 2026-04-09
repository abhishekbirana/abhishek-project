package com.example.java8features.StreamDistinctCount;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main01_StreamDCEx02 {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // count()
        long countOfEvenNumbers = numberList.stream().filter(n -> n%2 == 0).count();
        System.out.println(countOfEvenNumbers);

        // min()
        Optional<Integer> min = numberList.stream().min((n1, n2) -> {return n1.compareTo(n2);});
        System.out.println(min.get());
        // or
        int minNumber = numberList.stream().min(Integer::compareTo).get();
        System.out.println(minNumber);

        // max()
        Optional<Integer> max = numberList.stream().max((n1, n2) -> {return n1.compareTo(n2);});
        System.out.println(max.get());
        // or
        int maxNumber = numberList.stream().max(Integer::compareTo).get();
        System.out.println(maxNumber);

    }
}
