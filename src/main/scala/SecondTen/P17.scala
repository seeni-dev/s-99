package SecondTen

trait P17{
  def split[A](N: Int, l: Seq[A]): (Seq[A], Seq[A]) = {
    val r = l.zipWithIndex.groupBy(_._2 < N)
    (r.getOrElse(true, Seq.empty).map(_._1), r.getOrElse(false, Seq.empty).map(_._1))
  }
}
