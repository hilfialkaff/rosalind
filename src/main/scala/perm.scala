class PERM {
  def factorial(i: Int): Int = {
    (1 to i).product
  }

  def enumerate(i : Int): String = {
    val permutations = (1 to i).permutations.map(x => x.mkString(" "))
    permutations.mkString("\n")
  }
}
