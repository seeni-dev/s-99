package SecondTen

import org.scalatest.flatspec.AnyFlatSpec

class P15Spec extends AnyFlatSpec with P15 {
  "P15" should "behave as it should" in {
      assert(
        duplicateN(3, List('a, 'b, 'c, 'c, 'd))
          == List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
    )
  }
}
