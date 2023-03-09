package SecondTen

trait P18{
  def slice[A](I: Int, K: Int, l: Seq[A]): Seq[A] = {
   l drop I take (K-I)
  }
}
