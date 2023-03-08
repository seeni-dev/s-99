package FirstTen

import org.scalatest.flatspec.AnyFlatSpec

class P05Spec extends AnyFlatSpec with P05 {
  "reverse" should "return reverse list" in {
      assert(reverse(List(1, 1, 2, 3, 5, 8))==List(8, 5, 3, 2, 1, 1))
  }
}
