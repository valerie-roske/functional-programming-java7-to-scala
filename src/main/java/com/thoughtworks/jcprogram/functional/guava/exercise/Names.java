package com.thoughtworks.jcprogram.functional.guava.exercise;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

// Given a list of strings like {"Bill", "Archer", "Lana"}
// Print the first letter of each of the string that have a length of 4.
// For example, "BL"

public class Names {
    public static void main(String[] args) {
        List<String> names = newArrayList("Bill", "Archer", "Lana");
    }
}