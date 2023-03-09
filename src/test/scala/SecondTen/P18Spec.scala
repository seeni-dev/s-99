package SecondTen

import org.scalatest.flatspec.AnyFlatSpec

class P18Spec extends AnyFlatSpec with P18 {
  "P18" should "behave as it should" in {
      assert(
        slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
          == List('d, 'e, 'f, 'g)
    )
  }
}
