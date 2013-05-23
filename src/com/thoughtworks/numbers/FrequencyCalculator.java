package com.thoughtworks.numbers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCalculator {
    public Map<Integer, Integer> findFrequencies(List<Integer> numbers) {
        final HashMap<Integer, Integer> frequencies = new HashMap<Integer, Integer>();
        for(Integer number : numbers){
            Integer newValue = 1;
            if (frequencies.keySet().contains(number)){
                newValue = frequencies.get(number) + 1;
            }
            frequencies.put(number, newValue);
        }
        return frequencies;
    }
}
