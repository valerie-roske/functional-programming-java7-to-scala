package com.thoughtworks.jcprogram.functional.java7.solution;

import java.util.List;

import static java.util.Arrays.asList;

// Given a list of strings like {"Bill", "Archer", "Lana"}
// Print the first letter of each of the string that have a length of 4.
// For example, "BL"

public class Names {
    public static void main(String[] args) {
        List<String> names = asList("Bill", "Archer", "Lana");
        for (String name : names) {
            if (name.length() == 4){
                System.out.print(name.charAt(0));
            }
        }
        System.out.println();
    }
}
