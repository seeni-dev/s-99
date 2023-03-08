package SecondTen

import org.scalatest.flatspec.AnyFlatSpec

class P12Spec extends AnyFlatSpec with P12 {
  "P12" should "behave as it should" in {
      assert(decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) ==
        List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      )
  }
}
