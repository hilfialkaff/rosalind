import scala.io.Source

object Main {
  def main(args: Array[String]) {
    println("Rosalind problems")

    /* Counting DNA Nucleotides */
    {
      val dna = new DNA()
      val line = Source.fromURL(getClass().getResource("dna.txt")).getLines().next()
      println("DNA: " + dna.count(line))
    }

    /* Transcribing DNA into RNA */
    {
      val rna = new RNA()
      val line = Source.fromURL(getClass().getResource("rna.txt")).getLines().next()
      println("RNA: " + rna.replace(line))
    }

    /* Complementing a Strand of DNA */
    {
      val revc = new REVC()
      val line = Source.fromURL(getClass().getResource("revc.txt")).getLines().next()
      println("REVC: " + revc.reverseComplement(line))
    }

    /* Counting Point Mutations */
    {
      val hamm = new HAMM()
      val lines = Source.fromURL(getClass().getResource("hamm.txt")).getLines()
      val s1 = lines.next()
      val s2 = lines.next()
      println("HAMM: " + hamm.hammingDistance(s1, s2))
    }

    /* Finding a Motif in DNA */
    {
      val subs = new SUBS()
      val lines = Source.fromURL(getClass().getResource("subs.txt")).getLines()
      val s1 = lines.next()
      val s2 = lines.next()
      println("SUBS: " + subs.find(s1, s2))
    }
  }
}
