package com.thoughtworks.numbers;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.addAll;

// User stories
// Print the differences between each pair of numbers that are neighbors. For instance, "1 - 9 = -8; 9 - 4 = 5; 4 - 16 = -12"
// Print out unique numbers and their frequency (number of times they occur. "[1, 1], [9, 1], [4, 2], [16, 1]"
// Print the square root of unique numbers in ascending order

public class Numbers {
    public static void main(String[] args) {
        Integer source[] = {1, 9, 4, 16, 4};
        List<Integer> numbers = new ArrayList<Integer>();
        addAll(numbers, source);
    }
}
