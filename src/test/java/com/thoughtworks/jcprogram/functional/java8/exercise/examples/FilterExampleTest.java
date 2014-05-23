package com.thoughtworks.jcprogram.functional.java8.exercise.examples;


import org.junit.Test;

import java.util.Collection;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FilterExampleTest {

    private final FilterExample filterExample = new FilterExample();
    private Collection<Integer> empty = asList();

    @Test
    public void shouldRemoveOddNumber(){
        List<Integer> someNumbers = asList(3);
        List<Integer> numbersWithoutOdds = filterExample.filterOutOddNumbers(someNumbers);

        assertThat(numbersWithoutOdds, is(empty));
    }

    @Test
    public void shouldLeaveEvenNumber(){
        List<Integer> someNumbers = asList(2);
        List<Integer> numbersWithoutOdds = filterExample.filterOutOddNumbers(someNumbers);

        assertThat(numbersWithoutOdds, is(someNumbers));
    }

    @Test
    public void shouldFilterListWithMoreThanOneElement(){
        List<Integer> someNumbers = asList(1, 2, 3, 4);
        List<Integer> numbersWithoutOdds = filterExample.filterOutOddNumbers(someNumbers);

        List<Integer> onlyEvenNumbers = asList(2, 4);
        assertThat(numbersWithoutOdds, is(onlyEvenNumbers));
    }
}
