package SecondTen

import FirstTen.{P09, P10}

trait P11 extends P10{
  def encodeModified[A](l: Seq[A]): Seq[Any] = {
    runlenthEncoding(l).map {
      case (1, e) => e
      case e => e
    }
  }
}
