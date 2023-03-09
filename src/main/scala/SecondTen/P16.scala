package SecondTen

trait P16{
  def dropV2[A](res: Seq[A],n: Int, N: Int, remaining: Seq[A]): Seq[A] = {
    if(remaining.isEmpty)
      return res
    if(n == 1)
      return dropV2(res, N, N, remaining.tail)
    dropV2(res :+ remaining.head, n-1, N, remaining.tail)
  }
  def drop[A](N: Int, l: Seq[A]): Seq[A] = {
    dropV2(Seq.empty, N, N, l)
  }
}
