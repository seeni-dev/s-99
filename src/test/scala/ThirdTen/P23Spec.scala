package ThirdTen

import org.scalatest.flatspec.AnyFlatSpec

class P23Spec extends AnyFlatSpec with P23 {
  "P23" should "behave as it should" in {
    val inputArray =  List('a, 'b, 'c, 'd, 'f, 'g, 'h)
    val random = randomSelect(3, inputArray)
    assert(random.length==3)
    random.foreach( u => assert(inputArray.contains(u)))
  }
}
