package com.thoughtworks.jcprogram.functional.guava.exercise;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Predicate;

import java.util.Collection;
import java.util.List;

import static com.google.common.collect.Collections2.filter;
import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Lists.transform;

// Given a list of numbers like {1, 9, 4, 16, 4}
// Print the square root of all of the numbers larger than 4.
// For example, "3, 4"

public class IntegerReporter {
    public static void main(String[] args) {
        List<Integer> numbers = newArrayList(1, 9, 4, 16, 4);

        System.out.println(new IntegerReporter().reportSquareRootsOfLargeNumbers(numbers, ", "));

    }

    public String reportSquareRootsOfLargeNumbers(List<Integer> numbers, String delimiter) {
        Collection<Integer> filteredNumbers = filter(numbers, new IsGreaterThanFourPredicate());
        List<Integer> sqrtList = transform(newArrayList(filteredNumbers), new SquareRootFunction());

        return Joiner.on(delimiter).join(sqrtList);
    }

    private static class SquareRootFunction implements Function<Integer, Integer> {
        @Override
        public Integer apply(Integer integer) {
            return (int) Math.sqrt(integer);
        }
    }

    private class IsGreaterThanFourPredicate implements Predicate<Integer> {
        @Override
        public boolean apply(Integer integer) {
            return integer > 4;
        }
    }
}
