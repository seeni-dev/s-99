import org.scalatest.flatspec.AnyFlatSpec

class P03Spec extends AnyFlatSpec with P03 {
  "kthElement" should "return kth element" in {
      assert(kthElement(2, List(1, 1, 2, 3, 5, 8)).get==2)
  }
}
