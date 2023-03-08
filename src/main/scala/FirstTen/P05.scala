package FirstTen


trait P05 {
  def reverse[A](l: Seq[A]): Seq[A] = {
    l match {
      case Nil => Nil
      case a :: tail => reverse(tail) :+ a
    }
  }
}
