package SecondTen

import org.scalatest.flatspec.AnyFlatSpec

class P11Spec extends AnyFlatSpec with P11 {
  "last" should "return last element" in {
      assert( encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ==
        List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e)))
  }
}
