package com.example.java8features.StreamMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Convert all String into uppercase
public class Main01_StreamMapEx01 {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");

        List<String> updatedVehicles = vehicles.stream()
                .map(vehicle -> vehicle.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(updatedVehicles);

        vehicles.stream()
                .map(vehicle -> vehicle.length())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squareNumber = numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());
        System.out.println(squareNumber);

    }
}
