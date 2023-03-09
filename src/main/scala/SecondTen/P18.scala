package SecondTen

trait P18{
  def slice[A](I: Int, K: Int, l: Seq[A]): Seq[A] = {
    if(l.isEmpty)
      return Nil
    if (I > 0) {
      return slice(I-1, K-1, l.tail)
    }else if (K > 0){
      l.head +: slice(I, K-1, l.tail)
    }else {
     Nil
    }
  }
}
