package FirstTen

import org.scalatest.flatspec.AnyFlatSpec

class P01Spec extends AnyFlatSpec with P01 {
  "last" should "return last element" in {
      assert(last(List(1, 1, 2, 3, 5, 8)).get==8)
  }
}
