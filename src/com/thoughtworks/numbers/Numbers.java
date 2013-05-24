package com.thoughtworks.numbers;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.addAll;

// Given a list of integers...
// Print the mean and standard deviation of the numbers
// Print out unique numbers and their frequency (number of times they occur. "[1, 1], [9, 1], [4, 2], [16, 1]"

public class Numbers {
    public static void main(String[] args) {
        Integer source[] = {1, 9, 4, 16, 4};
        List<Integer> numbers = new ArrayList<Integer>();
        addAll(numbers, source);

    }

}
