package com.example.java8features.StreamFlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main01_StreamFMEx02 {
    public static void main(String[] args) {
        List<String> teamA = Arrays.asList("A1", "A2", "A3");
        List<String> teamB = Arrays.asList("B1", "B2", "B3");
        List<String> teamC = Arrays.asList("C1", "C2", "C3");
        
        List<List<String>> playersInWorldcup = new ArrayList<>();
        playersInWorldcup.add(teamA);
        playersInWorldcup.add(teamB);
        playersInWorldcup.add(teamC);
        
        //Before Java8
        for (List<String> players : playersInWorldcup) {
            for (String player : players) {
                System.out.println(player);
            }
        }
        
        //Using Java8

        List<String> result = playersInWorldcup.stream().flatMap(player -> player.stream()).collect(Collectors.toList());
        
        System.out.println(result); // [A1, A2, A3, B1, B2, B3, C1, C2, C3]
        
    }
}
