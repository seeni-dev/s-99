import scala.collection.immutable.{AbstractSeq, LinearSeq}

trait P09 {
  def pack[A](l: Seq[A]): Seq[Seq[A]] = {
    l match {
      case Nil => Nil
      case a :: tail => {
          (a +: tail.takeWhile(_==a)) +:
          pack(tail.dropWhile(_==a))
      }
    }
  }
}

