package com.thoughtworks.jcprogram.functional.guava.solution;

import com.google.common.base.Function;
import com.google.common.base.Predicate;

import java.util.Collection;
import java.util.List;

import static com.google.common.collect.Collections2.filter;
import static com.google.common.collect.Collections2.transform;
import static com.google.common.collect.Lists.newArrayList;

// Given a list of strings like {"Bill", "Archer", "Lana"}
// Print the first letter of each of the string that have a length of 4.
// For example, "BL"

public class Names {
    public static void main(String[] args) {
        List<String> names = newArrayList("Bill", "Archer", "Lana");

        Collection<String> namesWithLengthOf4 = filter(names, new Predicate<String>() {
            public boolean apply(String name) {
                return name.length() == 4;
            }
        });

        Collection<Character> firstLetters = transform(namesWithLengthOf4, new Function<String, Character>() {
            public Character apply(String string) {
                return string.charAt(0);
            }
        });

        for (Character letter : firstLetters) {
            System.out.print(letter);
        }
        System.out.println();
    }
}