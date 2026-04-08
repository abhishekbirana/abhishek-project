package com.example.java8features;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * 1. Predicate<T>
 * Purpose: Tests a condition on an object and returns a boolean.
 * Type: Predicate<T> is a functional interface.
 * Method: boolean test(T t)
 *
 * 2. Function<T, R>
 * Purpose: Transforms an object of type T into another object of type R.
 * Type: Function<T, R> is a functional interface.
 * Method: R apply(T t)
 */
public class Main01_FI_Intro {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(4)); // true
        System.out.println(isEven.test(5)); // false

        Function<String, Integer> parse = Integer::parseInt;
        System.out.println(parse.apply("4")); // 4
        System.out.println(parse.apply("5").getClass()); // class java.lang.Integer

        Function<Integer, Integer> square = n -> n * n;
        System.out.println(square.apply(4)); // 16
    }
}
