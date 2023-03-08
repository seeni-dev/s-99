
trait P04 {
  def numberOfElements[A](l: Seq[A]): Int = {
    l match {
      case Nil => 0
      case a :: tail => 1+ numberOfElements(tail)
    }
  }
}
