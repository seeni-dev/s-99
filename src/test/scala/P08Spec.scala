import org.scalatest.flatspec.AnyFlatSpec

class P08Spec extends AnyFlatSpec with P08 {
  "P08Spec" should "return P08Spec list" in {
      assert(
        compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ==
          List('a, 'b, 'c, 'a, 'd, 'e)
      )
  }
}
