package com.thoughtworks.collections

// Given a list of numbers like {1, 9, 4, 16, 4}
// Print the square root of all of the numbers larger than 4.
// For example, "3, 4"
// Given a list of strings like {"Bill", "Archer", "Lana"}
// Print the first letter of each of the string that have a length of 4.
// For example, "BL"

object CollectionsMain {

  def printSquareRootOfNumbersLargerThan4(numbers: Seq[Int]){
    numbers.foreach(number => println(number))
  }

  def printFirstLetterOfStringsLongerThan4(names: Set[String]){
    names.foreach(name => println(name))
  }


  def main(args: Array[String]) {
    val numbers = Seq(1, 9, 4, 16, 4)
    printSquareRootOfNumbersLargerThan4(numbers)

    val names = Set("Bill", "Archer", "Lana")

    printFirstLetterOfStringsLongerThan4(names)
  }

}
