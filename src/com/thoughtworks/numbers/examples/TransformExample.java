package com.thoughtworks.numbers.examples;

import java.util.List;
import static java.util.stream.Collectors.toList;

public class TransformExample {
    private Integer numberToDivideBy;

    public TransformExample(Integer numberToDivideBy) {
        this.numberToDivideBy = numberToDivideBy;
    }

    public List<Integer> divide(List<Integer> numbersToDivide) {
        return numbersToDivide.stream().map(integer -> integer/numberToDivideBy).collect(toList());
    }
}
