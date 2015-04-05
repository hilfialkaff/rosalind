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

    /* Computing GC Content */
    {
      val gc = new GC()
      val lines = Source.fromURL(getClass().getResource("gc.txt")).getLines().mkString(" ")
      println("GC: " + gc.findHighest(lines))
    }

    /* Translating RNA into Protein */
    {
      val prot = new PROT()
      val lines = Source.fromURL(getClass().getResource("prot.txt")).getLines().next()
      println("PROT: " + prot.translate(lines))
    }

    /* Rabbits and Recurrence Relations */
    {
      val fib = new FIB()
      val lines = Source.fromURL(getClass().getResource("fib.txt")).getLines().next().split(' ')
      println("FIB: " + fib.count(lines(0).toInt, lines(1).toInt))
    }

    /* Rearrangements Power Large-Scale Genomic Changes */
    {
      val perm = new PERM()
      val i = Source.fromURL(getClass().getResource("perm.txt")).getLines().next().toInt
      /* Commented out due to too much output. */
      // println("PERM: " + perm.enumerate(i) + " " + perm.factorial(i))
    }

    /* Calculating Protein Mass */
    {
      val prtm = new PRTM()
      val line = Source.fromURL(getClass().getResource("prtm.txt")).getLines().next()
      println("PRTM: " + prtm.compute(line))
    }

    /* Mendel's First Law */
    {
      val iprb = new IPRB()
      val line = Source.fromURL(getClass().getResource("iprb.txt")).getLines().next().split(' ')
      println("IPRB: " + iprb.compute(line(0).toDouble, line(1).toDouble, line(2).toDouble))
    }


    /* Overlap Graphs */
    {
      val grph = new GRPH()
      val fasta = new FASTA()
      val line = Source.fromURL(getClass().getResource("grph.txt")).getLines().mkString(" ")
      val strings = fasta.parse(line)
      println("GRPH: ")
      grph.compute(strings).foreach{ case (dna1, dna2) => println(dna1 + " " + dna2)}
    }
  }
}
