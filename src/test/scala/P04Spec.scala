import org.scalatest.flatspec.AnyFlatSpec

class P04Spec extends AnyFlatSpec with P04 {
  "numberOfElements" should "return numberOfElements" in {
      assert(numberOfElements(List(1, 1, 2, 3, 5, 8))==6)
  }
}
