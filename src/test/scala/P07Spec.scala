import org.scalatest.flatspec.AnyFlatSpec

class P07Spec extends AnyFlatSpec with P07 {
  "flatten" should "return flattened list" in {
      assert(flatten(List(List(1, 1), 2, List(3, List(5, 8))))==List(1, 1, 2, 3, 5, 8) )
  }
}
