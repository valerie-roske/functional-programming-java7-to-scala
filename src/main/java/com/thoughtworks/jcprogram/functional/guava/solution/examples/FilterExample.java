package com.thoughtworks.jcprogram.functional.guava.solution.examples;

import java.util.List;

import static com.google.common.collect.Collections2.filter;
import static com.google.common.collect.Lists.newArrayList;

public class FilterExample {
    public List<Integer> filterOutOddNumbers(List<Integer> numbers) {
        return newArrayList(filter(numbers, new IsEvenPredicate()));
    }

}
