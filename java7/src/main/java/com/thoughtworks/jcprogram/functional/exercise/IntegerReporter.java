package com.thoughtworks.jcprogram.functional.exercise;

import java.util.List;

import static java.lang.String.*;
import static java.util.Arrays.asList;

// Given a list of numbers like {1, 9, 4, 16, 4}
// Print the square root of all of the numbers larger than 4.
// For example, "3, 4"

public class IntegerReporter {
    public static void main(String[] args) {
        List<Integer> numbers = asList(1, 9, 4, 16, 4);

        System.out.println(new IntegerReporter().reportSquareRootsOfLargeNumbers(numbers, ", "));

    }

    public String reportSquareRootsOfLargeNumbers(List<Integer> numbers, String delimiter) {
        String result = "";

        for (Integer number : numbers){
            if (number.intValue() > 4) {
                result = result.concat(getStringValueof(number, delimiter));
            }
        }
        return getStringWithoutEndingDelimiter(result, delimiter.length());
    }

    private String getStringWithoutEndingDelimiter(String result, int delimiterLength) {
        if (result.isEmpty()) {
            return result;
        }

        return result.substring(0, result.length() - delimiterLength);
    }

    private String getStringValueof(Integer number, String delimiter) {
        return format("%s%s", valueOf(sqrt(number)), delimiter);
    }

    private int sqrt(Integer number) {
        return (int) Math.sqrt(number);
    }

}
