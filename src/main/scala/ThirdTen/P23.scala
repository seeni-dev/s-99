package ThirdTen

import SecondTen.P20

trait P23 extends P20 {
  def randomSelect[A](n: Int, s: Seq[A]): Seq[A] = {
    if(n<=0)
      return Nil
    else {
      val index = (new util.Random).between(0, s.length)
      val (newS, e) = removeAt(index, s)
      e +: randomSelect(n-1, newS)
    }
  }
}
