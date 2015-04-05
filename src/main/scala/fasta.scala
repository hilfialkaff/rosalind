
/* Utility class that returns a list of (FASTA file name, dna string) */
class FASTA {
  def parse(line: String): List[(String, String)] = {
    line.split(">").tail.map { entry =>
      val tmp = entry.split(' ')
      (tmp.head, tmp.tail.mkString(""))
    }.toList
  }
}
