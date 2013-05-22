package com.thoughtworks.numbers.examples;

import java.util.List;
import static java.util.stream.Collectors.toList;

public class FilterExample {
    public List<Integer> filterOutOddNumbers(List<Integer> numbers) {
        return numbers.stream().filter(number -> number % 2 == 0).collect(toList());
    }
}
