package SecondTen

import FirstTen.P10

trait P12{
  def decode[A](l: Seq[(Int,A)]): Seq[A] = {
    l.flatMap(t => (1.to(t._1).map(_ => t._2)))
  }
}
