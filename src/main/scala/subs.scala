class SUBS {
  def find(str: String, substr: String): String = {
    def _find(i: Int): List[Int] = {
      str.indexOf(substr, i) match {
        case -1 => Nil
        case x => x :: _find(x + 1)
      }
    }

    _find(0).mkString(" ")
  }
}
