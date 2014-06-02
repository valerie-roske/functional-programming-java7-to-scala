package com.thoughtworks.jcprogram.functional.java8.solution;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

// Given a list of strings like {"Bill", "Archer", "Lana"}
// Print the first letter of each of the string that have a length of 4.
// For example, "BL"

public class Names {
    public static void main(String[] args) {
        List<String> names = asList("Bill", "Archer", "Lana");

        String firstLetters = names.stream()
                .filter(name -> name.length() == 4)
                .map(name -> name.charAt(0))
                .map(character -> character.toString())
                .collect(Collectors.<String>joining());

        System.out.println(firstLetters);
    }
}