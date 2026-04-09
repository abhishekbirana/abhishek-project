package com.example.java8features.StreamDistinctCount;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main01_StreamDCEx01 {
    public static void main(String[] args) {
        List<String> vehicleList = Arrays.asList("bus", "car", "bicycle", "bus", "car", "car", "bike");

        // distinct()
        List<String> distinctVehicle = vehicleList.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctVehicle);

        // count
        long count = vehicleList.stream().distinct().count();
        System.out.println(count);

        // limit()
        List<String> limitedVehicle = vehicleList.stream().limit(3).collect(Collectors.toList());
        System.out.println("Limited Vehicles: "+limitedVehicle);

        vehicleList.stream().forEach(vehicle -> System.out.println(vehicle));
    }
}
