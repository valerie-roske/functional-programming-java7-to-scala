package com.thoughtworks.numbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Collections.addAll;

// User stories
// Print the differences between each pair of numbers that are neighbors. For instance, "-8, 5, -12, 12"
// Print out unique numbers and their frequency (number of times they occur. "[1, 1], [9, 1], [4, 2], [16, 1]"
// Print the square root of unique numbers in ascending order

public class Numbers {
    public static void main(String[] args) {
        Integer source[] = {1, 9, 4, 16, 4};
        List<Integer> numbers = new ArrayList<Integer>();
        addAll(numbers, source);

        reportDifferences(numbers);
        reportFrequencies(numbers);
    }

    private static void reportFrequencies(List<Integer> numbers) {
        Map<Integer, Integer> numberToFrequencyMap = new FrequencyCalculator().findFrequencies(numbers);

        List<String> frequenciesAsStrings = new ArrayList<String>();
        for (Integer uniqueNumber : numberToFrequencyMap.keySet()){
            frequenciesAsStrings.add("[" + uniqueNumber + ", " + numberToFrequencyMap.get(uniqueNumber) + "]");
        }

        printList(frequenciesAsStrings);
    }

    private static void reportDifferences(List<Integer> numbers) {
        List<Integer> differences = new DifferenceCalculator().findDifferences(numbers);
        List<String> numbersAsStrings = new ArrayList<String>();
        for (Integer number : differences){
            numbersAsStrings.add(number.toString());
        }
        printList(numbersAsStrings);
    }

    private static void printList(List<String> items) {
        System.out.println(join(items, ", "));
    }

    private static String join(List<String> items, String delimiter) {
        String result = items.get(0);
        List<String> itemsRemainingToAdd = items.subList(1, items.size());
        for (String item : itemsRemainingToAdd){
            result += delimiter + item;
        }
        return result;
    }
}
