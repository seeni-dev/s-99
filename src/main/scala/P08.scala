import scala.collection.immutable.{AbstractSeq, LinearSeq}

trait P08 {
  def compress[A](l: Seq[A]): Seq[A] = {
    l.foldLeft(Seq[A]())((res, e) => {
      if(res.nonEmpty && res.last == e)
        res
      else
        res :+ e
    })
  }
}
