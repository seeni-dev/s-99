package ThirdTen

import org.scalatest.flatspec.AnyFlatSpec

class P25Spec extends AnyFlatSpec with P25 {
  "P25" should "behave as it should" in {
    val inputArray = List('a, 'b, 'c, 'd, 'e, 'f)
    val random = randomPermute(inputArray)
    assert(random.length == inputArray.length)
    random.foreach(u => assert(inputArray.contains(u)))
  }
}
