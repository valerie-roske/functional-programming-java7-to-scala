package com.thoughtworks.numbers;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.addAll;

// Given a list of numbers like {1, 9, 4, 16, 4}
// Print the square root of all of the numbers larger than 4.
// For example, "3, 4"

// Given a list of strings like {"Bill", "Archer", "Lana"}
// Print the first letter of each of the string that have a length of 4.
// For example, "BL"

public class Numbers {
    public static void main(String[] args) {
        Integer source[] = {1, 9, 4, 16, 4};
        List<Integer> numbers = new ArrayList<Integer>();
        addAll(numbers, source);

        printList(asStrings(squareRoots(numbersGreaterThanFour(numbers))));
    }

    private static List<String> asStrings(List<Double> doubles) {
        List<String> strings = new ArrayList<String>();
        for (Double aDouble : doubles){
            strings.add(aDouble.toString());
        }
        return strings;
    }

    private static List<Double> squareRoots(List<Integer> numbers) {
        List<Double> squareRoots = new ArrayList<Double>();
        for (Integer number : numbers){
            squareRoots.add(Math.sqrt(number.floatValue()));
        }
        return squareRoots;
    }

    private static List<Integer> numbersGreaterThanFour(List<Integer> numbers) {
        List<Integer> numbersGreaterThanFour = new ArrayList<Integer>();
        for (Integer number : numbers){
            if (number > 4){
                numbersGreaterThanFour.add(number);
            }
        }
        return numbersGreaterThanFour;
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
