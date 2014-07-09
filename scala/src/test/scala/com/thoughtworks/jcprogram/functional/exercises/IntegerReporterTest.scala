package com.thoughtworks.jcprogram.functional.examples

import com.thoughtworks.jcprogram.functional.exercises.IntegerReporter
import org.junit.Test
import org.scalatest.junit.AssertionsForJUnit

class IntegerReporterTest extends AssertionsForJUnit {

  @Test
  def shouldSomething() {
    example = Set(3, 4)

    result = IntegerReporter()

    assert( result == example)
  }

}