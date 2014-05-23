package com.thoughtworks.jcprogram.functional.guava.solution;

import com.google.common.base.Function;
import com.google.common.base.Predicate;

import java.util.Collection;
import java.util.List;

import static com.google.common.collect.Collections2.filter;
import static com.google.common.collect.Collections2.transform;
import static com.google.common.collect.Lists.newArrayList;

// Given a list of numbers like {1, 9, 4, 16, 4}
// Print the square root of all of the numbers larger than 4.
// For example, "3, 4"

// Given a list of strings like {"Bill", "Archer", "Lana"}
// Print the first letter of each of the string that have a length of 4.
// For example, "BL"


public class Numbers {
    public static void main(String[] args) {
        List<Integer> numbers = newArrayList(1, 9, 4, 16, 4);

        Collection<Integer> numbersGreaterThanFour = filter(numbers, new IsGreaterThanFour());
        Collection<Double> squareRoots = transform(numbersGreaterThanFour, new squareRoot());
        Collection<String> squareRootsAsStrings = transform(squareRoots, new toString());

        for (String result : squareRootsAsStrings){
            System.out.println(result);
        }
    }

    private static class IsGreaterThanFour implements Predicate<Integer> {
        public boolean apply(Integer integer) {
            return integer > 4;
        }
    }

    private static class squareRoot implements Function<Integer, Double> {
        public Double apply(Integer integer) {
            return Math.sqrt(integer.doubleValue());
        }
    }

    private static class toString implements Function<Double, String> {
        public String apply(Double aDouble) {
            return aDouble.toString();
        }
    }
}