package com.thoughtworks.jcprogram.functional.exercise

import org.junit.Before
import org.junit.Ignore
import org.junit.Test

import static org.hamcrest.CoreMatchers.is
import static org.junit.Assert.assertThat

class IntegerReporterTest {
    private IntegerReporter reporter

    @Before
    def void setUp() {
        reporter = new IntegerReporter()
    }

    @Ignore
    @Test
    def void shouldReportSquareRootWhenThereIsOneNumberAndItIsGreaterThan4() {
        assertThat reporter.reportSquareRootsOfLargeNumbers([9]), is("3");
    }

    @Ignore
    @Test
    def void shouldReportNothingWhenThereIsOneNumberAndItIsLessThan4() {
        assertThat reporter.reportSquareRootsOfLargeNumbers([3]), is("");
    }

    @Ignore
    @Test
    def void shouldReportWhenThereIsMoreThanOneNumber() {
        assertThat reporter.reportSquareRootsOfLargeNumbers([9, 16]), is("3, 4");
    }
}
