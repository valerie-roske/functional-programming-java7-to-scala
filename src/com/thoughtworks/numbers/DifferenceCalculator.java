package com.thoughtworks.numbers;

import java.util.ArrayList;
import java.util.List;

public class DifferenceCalculator {
    public List<Integer> findDifferences(List<Integer> numbers) {
        List<Integer> differences = new ArrayList<Integer>();
        Integer currentItem = numbers.get(0);
        List<Integer> remainingItems = numbers.subList(1, numbers.size());
        for (Integer nextItem : remainingItems){
            differences.add(currentItem - nextItem);
            currentItem = nextItem;
        }
        return differences;
    }
}
