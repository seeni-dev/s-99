package ThirdTen

import org.scalatest.flatspec.AnyFlatSpec

class P22Spec extends AnyFlatSpec with P22 {
  "P22" should "behave as it should" in {
      assert(
        range(4, 9) == List(4, 5, 6, 7, 8, 9)
    )
  }
}
