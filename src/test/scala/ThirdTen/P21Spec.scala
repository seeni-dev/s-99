package ThirdTen

import org.scalatest.flatspec.AnyFlatSpec

class P21Spec extends AnyFlatSpec with P21 {
  "P21" should "behave as it should" in {
      assert(
        insertAt('new, 1, List('a, 'b, 'c, 'd))
          == List('a, 'new, 'b, 'c, 'd)
    )
  }
}
