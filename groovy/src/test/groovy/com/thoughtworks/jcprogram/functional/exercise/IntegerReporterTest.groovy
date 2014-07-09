package com.thoughtworks.jcprogram.functional.exercise
import org.junit.Before
import org.junit.Test

import static org.hamcrest.CoreMatchers.both
import static org.hamcrest.CoreMatchers.containsString
import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertThat

class IntegerReporterTest {
    private IntegerReporter reporter

    @Before
    def void setUp() {
        reporter = new IntegerReporter()
    }

    @Test
    def void shouldTakeSquareRootOfNumbers() {
        def result = reporter.reportSquareRootsOfLargeNumbers([9, 16])
        assertThat result, both(containsString("3")).and(containsString("4"))
    }

    @Test
    def void shouldReportNothingWhenThereIsOneNumberAndItIsLessThan4() {
        assertEquals reporter.reportSquareRootsOfLargeNumbers([3]), ""
    }

    @Test
    def void shouldInsertCommaAndSpaceBetweenNumbers() {
        assertEquals reporter.reportSquareRootsOfLargeNumbers([9, 9]), "3, 3"
    }

}
