package com.example.java8features.StreamFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main02_Stream_Ex02 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Melisandre", "Sansa", "Jon", "Daenerys", "Joffery");

        List<String> longNames = new ArrayList<>();

        longNames = names.stream()
                .filter(name -> name.length() > 6 && name.length() < 8)
                .collect(Collectors.toList());

        System.out.println(longNames); // [Joffery]
    }
}
