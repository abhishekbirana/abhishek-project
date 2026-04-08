package com.example.java8features.StreamFilter;

import java.util.Arrays;
import java.util.List;

/**
 * Collection: To represent group of data/objects as single entity.
 * Stream: To process the data from collection we use streams concept.
 *
 * 1. filter()
 * Purpose: Select elements from the stream that match a condition.
 * Returns: A stream containing only the elements that pass the test.
 * Input → Output: Same type of elements as the original stream.
 *
 * 2. map()
 * Purpose: Transform each element in the stream into something else.
 * Returns: A stream of transformed elements.
 * Input → Output: Can be a different type from the original stream.
 */

public class Main02_Stream_1_Intro {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> evens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println(evens); // Output: [2, 4]

        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .toList();
        System.out.println(squares); // Output: [1, 4, 9, 16, 25]

    }
}
