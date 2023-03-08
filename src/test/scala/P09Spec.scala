import org.scalatest.flatspec.AnyFlatSpec

class P09Spec extends AnyFlatSpec with P09 {
  "P09Spec" should "return P09Spec list" in {
      assert(
        pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
          == List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
      )
  }
}
