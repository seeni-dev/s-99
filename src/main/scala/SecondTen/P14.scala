package SecondTen

trait P14{

  def duplicate[A](l: Seq[A]): Seq[A] = {
    l.flatMap(e => Seq(e,e))
  }
}
