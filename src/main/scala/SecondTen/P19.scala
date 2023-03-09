package SecondTen

trait P19{
  def rotate[A](I: Int, l: Seq[A]): Seq[A] = {
    // TODO simplify
    if(I > 0)
      (l drop I) ++ (l take I)
    else
      (l drop (l.length+I)) ++ (l take l.length+I)
  }
}
