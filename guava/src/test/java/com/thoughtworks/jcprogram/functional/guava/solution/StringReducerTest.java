package com.thoughtworks.jcprogram.functional.guava.solution;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StringReducerTest {

    private List<String> strings;
    private StringReducer reducer;

    @Before
    public void setUp() throws Exception {
        reducer = new StringReducer();
        strings = newArrayList();
    }

    @Test
    public void shouldReduceToFirstLetterWhenStringIsLength4() {
        strings.add("1234");
        String result = reducer.reduceToFirstLetterOfLengthFourStrings(strings);

        assertThat(result, is("1"));
    }

    @Test
    public void shouldReduceToNothingWhenStringIsNotLength4() {
        strings.add("12345");
        String result = reducer.reduceToFirstLetterOfLengthFourStrings(strings);

        assertThat(result, is(""));
    }

    @Test
    public void shouldReduceMoreThanOneString() {
        strings.add("1234");
        strings.add("2345");
        String result = reducer.reduceToFirstLetterOfLengthFourStrings(strings);

        assertThat(result, is("12"));
    }
}