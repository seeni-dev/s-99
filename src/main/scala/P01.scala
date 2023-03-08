import scala.collection.immutable.{AbstractSeq, LinearSeq}

trait P01 {
  def last[A](l: Seq[A]): Option[A] = {
    l match {
      case Nil => None
      case a :: Nil => Some(a)
      case a :: tail => last(tail)
    }
  }
}
