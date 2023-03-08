package SecondTen

trait P13{
  def encodeDirectInternal[A](
                               forgottenRes: Seq[(Int,A)],
                               lastRes: Option[(Int,A)],
                               remaining: Seq[A]
                             ): Seq[(Int, A)] = {
    remaining match {
      case Nil if lastRes.nonEmpty => forgottenRes :+ lastRes.get
      case Nil  => forgottenRes
      case a :: tail if(lastRes.isEmpty) => encodeDirectInternal(
        forgottenRes,
        Some((1, a)),
        tail
      )
      case a :: tail if(lastRes.get._2 == a) => encodeDirectInternal(
        forgottenRes,
        Some((lastRes.get._1+1, a)),
        tail
      )
      case a :: tail => encodeDirectInternal(
        forgottenRes :+ lastRes.get,
        Some((1,a)),
        tail
      )
    }
  }
  def encodeDirect[A](l: Seq[A]): Seq[(Int,A)] = {
    l match {
      case Nil => Nil
      case a :: remaining => {
        val (head, tail) = l.span(_==a)
        (head.length, a) +: encodeDirect(tail)
      }
    }
  }
}
