class FIB {
  def count(n: Int, k: Int): Long = {
    (1L to (n - 1)).foldLeft(1 : Long, 1 : Long) {
      case ((a, b), _) => (b, (a * k) + b)
    }._1
  }
}
