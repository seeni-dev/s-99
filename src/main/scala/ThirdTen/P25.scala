package ThirdTen

trait P25 extends P23 {
  def randomPermute[A](l: Seq[A]): Seq[A] = {
   randomSelect(l.length, l)
  }
}
