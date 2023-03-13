package ThirdTen

import SecondTen.P20

trait P24 extends P23 {
  def lotto(n: Int, m:Int): Seq[Int] = {
    randomSelect(
      n,
      (1 to m)
    )
  }
}
