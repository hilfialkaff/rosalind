class IPRB {
  def compute(k: Double, m: Double, n: Double): Double = {
    val sum = k + m + n
    val denominator = sum * (sum - 1)

    val kk = (k * (k-1)) / denominator
    val km = (k * m) / denominator
    val kn = (k * n) / denominator

    val mk = (m * k) / denominator
    val mm = (m * (m-1)) / denominator
    val mn = (m * n) / denominator

    val nk = (n * k) / denominator
    val nm = (n * m) / denominator
    // nn not included since it doesn't produce dominant allele

    kk + km + kn + mk + (mm * 0.75) + (mn * 0.5) + nk + (nm * 0.5)
  }
}
