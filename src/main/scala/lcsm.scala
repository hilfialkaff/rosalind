class LCSM {
  def compute(strings: List[String]): Option[String] = {
    val substrings = strings(0).inits.flatMap(_.tails).filter(_.nonEmpty).toList.sortWith(_.length > _.length)
    substrings.find(substr => strings.forall(_.contains(substr)))
  }
}
