package ThirdTen

import scala.collection.immutable.{AbstractSeq, LinearSeq}

trait P21 {
  def insertAt[A](e: A, i: Int, l: Seq[A]): Seq[A] = {
    if(i == 0)
      return e +: l
    else
      l match {
        case Nil => Nil
        case a :: tail => a +: insertAt(e, i-1, tail)
      }
  }
}
