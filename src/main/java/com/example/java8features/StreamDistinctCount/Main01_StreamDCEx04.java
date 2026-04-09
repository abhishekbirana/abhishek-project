package com.example.java8features.StreamDistinctCount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main01_StreamDCEx04 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "1", "2", "3");
        Object arr[] = list.stream().toArray();
        System.out.println(arr.length);
        for(Object o : arr){
            System.out.println(o);
        }
    }
}
