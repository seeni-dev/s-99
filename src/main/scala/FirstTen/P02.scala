package FirstTen


trait P02 {
  def lastButOne[A](l: Seq[A]): Option[A] = {
    l match {
      case Nil => None
      case a :: Nil => None
      case a :: b :: Nil => Some(a)
      case a :: b :: tail => lastButOne(tail)
    }
  }
}
