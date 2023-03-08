package SecondTen

import org.scalatest.flatspec.AnyFlatSpec

class P13Spec extends AnyFlatSpec with P13 {
  "P13" should "behave as it should" in {
      assert(
        encodeDirect(
          List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ==
          List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
    )
  }
}
