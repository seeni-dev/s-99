package SecondTen

import org.scalatest.flatspec.AnyFlatSpec

class P20Spec extends AnyFlatSpec with P20 {
  "P20" should "behave as it should" in {
      assert(
        removeAt(1, List('a, 'b, 'c, 'd))
        == (List('a, 'c, 'd), 'b)
    )
  }
}
