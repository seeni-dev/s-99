package FirstTen

import org.scalatest.flatspec.AnyFlatSpec

class P02Spec extends AnyFlatSpec with P02 {
  "lastButOne" should "return lastButOne element" in {
      assert(lastButOne(List(1, 1, 2, 3, 5, 8)).get==5)
  }
}
