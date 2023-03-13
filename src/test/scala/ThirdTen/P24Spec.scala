package ThirdTen

import org.scalatest.flatspec.AnyFlatSpec

class P24Spec extends AnyFlatSpec with P24 {
  "P24" should "behave as it should" in {
    val (n,m) = (6, 49)
    val lottery = lotto(n, m)
    assert(lottery.length==n)
    lottery.foreach( u => assert(u <= m))
  }
}
