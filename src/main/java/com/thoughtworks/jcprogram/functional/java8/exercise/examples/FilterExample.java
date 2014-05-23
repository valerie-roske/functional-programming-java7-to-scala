package com.thoughtworks.jcprogram.functional.java8.exercise.examples;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterExample {
    public List<Integer> filterOutOddNumbers(List<Integer> numbers) {
        Predicate<Integer> isEvenPredicate = number -> number % 2 == 0;
        return numbers
                .stream()
                .filter(isEvenPredicate)
                .collect(Collectors.<Integer>toList());
    }
}
