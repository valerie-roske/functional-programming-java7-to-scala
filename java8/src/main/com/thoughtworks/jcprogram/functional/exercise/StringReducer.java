package com.thoughtworks.jcprogram.functional.exercise;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

// Given a list of strings like {"Bill", "Archer", "Lana"}
// Print the first letter of each of the string that have a length of 4.
// For example, "BL"

public class StringReducer {

    public static void main(String[] args) {
        List<String> strings = asList("Bill", "Archer", "Lana");
        System.out.println(new StringReducer().reduceToFirstLetterOfLengthFourStrings(strings));
    }

    public String reduceToFirstLetterOfLengthFourStrings(List<String> strings) {
        Predicate<String> stringLengthPredicate = str -> str.length() == 4;
        Function<String, String> firstLetterMapper = str -> str.substring(0, 1);
        String delimiter = "";

        return strings
                .stream()
                .filter(stringLengthPredicate)
                .map(firstLetterMapper)
                .collect(Collectors.joining(delimiter));
    }
}
