package com.thoughtworks.jcprogram.functional.guava.examples;

import com.google.common.base.Function;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Lists.transform;
import static org.junit.Assert.assertThat;

public class TransformExample {
    private static class DivideFunction implements Function<Integer, Integer> {
        private int numberToDivideBy;

        public DivideFunction(int numberToDivideBy) {
            this.numberToDivideBy = numberToDivideBy;
        }

        public Integer apply(Integer integer) {
            return integer/numberToDivideBy;
        }
    }

    @Test
    public void shouldDivideAllNumbers(){
        List<Integer> result = transform(newArrayList(3, 6, 9), new DivideFunction(3));
        assertThat(result, CoreMatchers.<List<Integer>>is(newArrayList(1, 2, 3)));
    }

}
