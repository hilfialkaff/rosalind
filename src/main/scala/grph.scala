class GRPH {
  def compute(s: List[(String, String)]): List[(String, String)] = {
    val prefixes = s.groupBy(_._2.substring(0, 3)).mapValues(_.map(_._1))
    s.flatMap{ case (name, dna) =>
      prefixes.getOrElse(dna.substring(dna.length - 3), Nil)
        .filter(_ != name)
        .map((name, _))
    }
  }
}
