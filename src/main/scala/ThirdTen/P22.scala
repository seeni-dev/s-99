package ThirdTen

trait P22 {
  def range(s: Int, e: Int): Seq[Int] = {
    (1 to e) drop s-1
  }
}
