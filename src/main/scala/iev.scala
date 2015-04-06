class IEV {
  def compute(nums: List[Int]): Double = {
    val prob = List(2.0, 2.0, 2.0, 1.5, 1.0, 0.0)
    (0 to 5).foldLeft(0.0)((sum, i) => sum + (nums(i) * prob(i)))
  }
}
