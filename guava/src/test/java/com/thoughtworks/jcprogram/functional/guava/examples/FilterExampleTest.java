package com.thoughtworks.jcprogram.functional.guava.examples;


import org.junit.Test;

import java.util.Collection;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class FilterExampleTest {

    private final FilterExample filterExample = new FilterExample();
    private Collection<Integer> empty = newArrayList();

    @Test
    public void shouldRemoveOddNumber(){
        List<Integer> someNumbers = newArrayList(3);
        List<Integer> numbersWithoutOdds = filterExample.filterOutOddNumbers(someNumbers);

        assertThat(numbersWithoutOdds, is(empty));
    }

    @Test
    public void shouldLeaveEvenNumber(){
        List<Integer> someNumbers = newArrayList(2);
        List<Integer> numbersWithoutOdds = filterExample.filterOutOddNumbers(someNumbers);

        assertThat(numbersWithoutOdds, is(someNumbers));
    }

    @Test
    public void shouldFilterListWithMoreThanOneElement(){
        List<Integer> someNumbers = newArrayList(1, 2, 3, 4);
        List<Integer> numbersWithoutOdds = filterExample.filterOutOddNumbers(someNumbers);

        List<Integer> onlyEvenNumbers = newArrayList(2, 4);
        assertThat(numbersWithoutOdds, is(onlyEvenNumbers));
    }
}
