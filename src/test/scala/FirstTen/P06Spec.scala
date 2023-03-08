package FirstTen

import org.scalatest.flatspec.AnyFlatSpec

class P06Spec extends AnyFlatSpec with P06 {
  "isPalindrome" should "return isPalindrome" in {
      assert(isPalindrome(List(1, 2, 3, 2, 1)))
  }
}
