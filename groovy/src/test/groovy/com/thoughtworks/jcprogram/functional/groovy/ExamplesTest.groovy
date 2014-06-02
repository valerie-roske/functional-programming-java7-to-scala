package com.thoughtworks.jcprogram.functional.groovy

import org.junit.Test

class ExamplesTest {

    @Test
    void shouldGetOneWhenDividingANumberByItself() {
        def number = 5
        def divisor = 5
        assert [number].collect {it/divisor} == [1]
    }

    @Test
    void shouldRoundDown() {
        def number = 8
        def divisor = 3
        assert([number].collect {(int)it/divisor} == [2])
    }

    @Test
    void shouldRemoveOddNumbers() {
        assert([3].findAll {it%2==0} == [])
    }

    @Test
    void shouldLeaveEvenNumbers() {
        assert([4].findAll {it%2==0} == [4])
    }

    @Test
    void shouldFilterListWithMoreThanOneElement() {
        assert([1, 2, 3, 4].findAll {it%2==0} == [2, 4])
    }
}
