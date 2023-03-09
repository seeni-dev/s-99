package SecondTen

import org.scalatest.flatspec.AnyFlatSpec

class P16Spec extends AnyFlatSpec with P16 {
  "P16" should "behave as it should" in {
      assert(
        drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
          == List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
    )
  }
}
