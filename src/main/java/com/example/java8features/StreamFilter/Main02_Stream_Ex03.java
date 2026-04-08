package com.example.java8features.StreamFilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main02_Stream_Ex03 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cup", null, "forest", "sky", "book", null, "theatre");

        List<String> newWords = words.stream()
                .filter(word -> word != null)
                .collect(Collectors.toList());
        System.out.println(newWords);
    }
}
