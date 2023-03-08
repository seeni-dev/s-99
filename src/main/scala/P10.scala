

trait P10 extends P09{
  def runlenthEncoding[A](l: Seq[A]): Seq[(Int, A)] = {
   pack(l).map(t => ( t.length, t.head))
  }
}

