package SecondTen

import org.scalatest.flatspec.AnyFlatSpec

class P17Spec extends AnyFlatSpec with P17 {
  "P17" should "behave as it should" in {
      assert(
        split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
          == (List('a, 'b, 'c), List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    )
  }
}
