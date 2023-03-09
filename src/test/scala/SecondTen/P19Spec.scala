package SecondTen

import org.scalatest.flatspec.AnyFlatSpec

class P19Spec extends AnyFlatSpec with P19 {
  "P19" should "behave as it should" in {
      assert(
        rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
        ==List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
    )
    assert(
      rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
       == List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
    )
  }
}
