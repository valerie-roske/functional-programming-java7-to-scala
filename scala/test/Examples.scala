import org.junit.Test
import org.scalatest.junit.{JUnitSuite}

class Examples extends JUnitSuite {

  @Test
  def shouldGetOneWhenDividingANumberByItself() {
    val number = 5
    val divisor = 5
    assert(Seq(number).map(n => n/divisor) == Seq(1))
  }

  @Test
  def shouldRoundDown() {
    val number = 8
    val divisor = 3
    assert(Seq(number).map(n => n/divisor) == Seq(2))
  }


  def isEven: (Int) => Boolean = {
    n => n % 2 == 0
  }

  @Test
  def shouldRemoveOddNumbers() {
    assert(Set(3).filter(isEven) == Set())
  }

  @Test
  def shouldLeaveEvenNumbers() {
    assert(Set(4).filter(isEven) == Set(4))
  }

  @Test
  def shouldFilterListWithMoreThanOneElement() {
    assert(Set(1, 2, 3, 4).filter(isEven) == Set(2, 4))
  }
}
