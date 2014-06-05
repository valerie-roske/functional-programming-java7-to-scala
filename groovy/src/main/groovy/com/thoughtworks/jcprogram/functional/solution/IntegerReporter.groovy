package com.thoughtworks.jcprogram.functional.solution

import static java.lang.Math.sqrt

// Given a list of numbers like {1, 9, 4, 16, 4}
// Print the square root of all of the numbers larger than 4.
// For example, "3, 4"

List numbers = [1, 9, 4, 16, 4]

println new IntegerReporter().reportSquareRootsOfLargeNumbers(numbers)

def reportSquareRootsOfLargeNumbers(numbers){
    numbers.
            findAll{it > 4}.
            collect{sqrt(it).intValue().toString()}.
            join(", ")
}