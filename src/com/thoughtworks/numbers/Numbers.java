package com.thoughtworks.numbers;

import java.util.List;
import java.util.stream.Collectors;

import static java.lang.String.join;
import static java.util.Arrays.asList;

// Given a list of numbers like {1, 9, 4, 16, 4}
// Print the square root of all of the numbers larger than 4.
// For example, "3^2 = 9, 4^2 = 16"

// Given a list of strings like {"Bill", "Archer", "Lana"}
// Print the first letter of each of the string that have a length of 4.
// For example, "BL"

public class Numbers {
    public static void main(String[] args) {
        List<Integer> numbers = asList(1, 9, 4, 16, 4);

        List<String> numbersAsStrings = numbers.stream()
                .filter(number -> number > 4)
                .map(number -> Math.sqrt(number))
                .map(number -> number.toString())
                .collect(Collectors.<String>toList());

        System.out.println("[ " + join(", ", numbersAsStrings) + "]");
    }
}