package FirstTen

trait P07  {
  def flatten(l: Seq[Any]): Seq[Any] = {
    l.map {
      case e: Seq[Any] => flatten(e)
      case e => Seq(e)
    }.reduce(_ ++ _)
  }
}
