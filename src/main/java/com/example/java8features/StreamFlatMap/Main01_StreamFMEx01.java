package com.example.java8features.StreamFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * map → transforms each element into one element
 * flatMap → transforms each element into multiple elements and flattens the result(stream of object)
 */
public class Main01_StreamFMEx01 {
    public static void main(String[] args) {
        //map
         List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
         List<Integer> numbers2 = numbers.stream().map(x -> x+10).collect(Collectors.toList());
         System.out.println(numbers2); // [11, 12, 13, 14, 15, 16, 17, 18, 19, 20]

         //flatmap
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(5, 6, 7, 8);
        List<Integer> list3 = Arrays.asList(9, 10, 11, 12);

        List<List<Integer>> finalList = Arrays.asList(list1,list2,list3);

        List<Integer> result = finalList.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
        System.out.println(result); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]

        List<Integer> result2 = finalList.stream().flatMap(x -> x.stream().map(y -> y*y)).collect(Collectors.toList());
        System.out.println(result2); // [1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144]


    }
}
