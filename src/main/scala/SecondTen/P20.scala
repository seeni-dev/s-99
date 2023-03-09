package SecondTen

trait P20{
  def removeAt[A](K: Int, l: Seq[A]): (Seq[A], A) = {
    ((l take K) ++ (l drop K+1), l(K))
  }
}
