
trait P03 {
  def kthElement[A](k: Int, l: Seq[A]): Option[A] = {
    l match {
      case Nil => None
      case a :: tail if k ==0 => Some(a)
      case a :: tail => kthElement(k-1, tail)
    }
  }
}
