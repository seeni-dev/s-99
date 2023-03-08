package FirstTen

import org.scalatest.flatspec.AnyFlatSpec

class P10Spec extends AnyFlatSpec with P10 {
  "P10Spec" should "return P10Spec list" in {
      assert(
        runlenthEncoding(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
          == List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
      )
  }
}
