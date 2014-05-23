package com.thoughtworks.jcprogram.functional.java8.solution.examples;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TransformExampleTest {

    @Test
    public void shouldGetOneWhenDividingANumberByItself(){
        Integer numberToDivideBy = 3;
        TransformExample numberDivider = new TransformExample(numberToDivideBy);
        List<Integer> expected = asList(1);
        assertThat(numberDivider.divide(asList(3)), is(expected));
    }

    @Test
    public void shouldTruncateAnyRemainderFromDivision(){
        Integer numberToDivideBy = 4;
        TransformExample numberDivider = new TransformExample(numberToDivideBy);
        List<Integer> expected = asList(0);
        assertThat(numberDivider.divide(asList(3)), is(expected));
    }

    @Test
    public void shouldDivideMoreThanOneNumber(){
        Integer numberToDivideBy = 3;
        TransformExample numberDivider = new TransformExample(numberToDivideBy);
        List<Integer> expected = asList(1, 2, 3);
        assertThat(numberDivider.divide(asList(3, 6, 9)), is(expected));
    }

}
