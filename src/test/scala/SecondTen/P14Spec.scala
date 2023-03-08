package SecondTen

import org.scalatest.flatspec.AnyFlatSpec

class P14Spec extends AnyFlatSpec with P14 {
  "P14" should "behave as it should" in {
      assert(
        duplicate(List('a, 'b, 'c, 'c, 'd))
          == List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
    )
  }
}
