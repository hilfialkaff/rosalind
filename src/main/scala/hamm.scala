class HAMM {
  def hammingDistance(s1: String, s2: String): Int = {
    s1.zip(s2).foldLeft(0) {
      case (distance, (c1, c2)) => distance + (if (c1 == c2) 0 else 1)
    }
  }
}
