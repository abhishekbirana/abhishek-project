package com.example.java8features.StreamFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main02_Stream_Ex01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbersList = new ArrayList<Integer>();

        // without using stream
        for (int n : list) {
            if (n % 2 == 0) {
                evenNumbersList.add(n);
            }
        }
        System.out.println(evenNumbersList);

        // with stream
        list.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
