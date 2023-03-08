
trait P06 extends P05 {
  def isPalindrome[A](l: Seq[A]): Boolean = {
    l == reverse(l)
  }
}
