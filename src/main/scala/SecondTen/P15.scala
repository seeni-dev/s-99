package SecondTen

trait P15{
  def duplicateN[A](n: Int, l: Seq[A]): Seq[A] = {
    l.flatMap(e => (1.to(n).map(_ => e)))
  }
}
