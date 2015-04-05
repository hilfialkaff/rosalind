class GC {
  def computeGC(s: String): Double = {
    val numGC = s.foldLeft(0) {
      case (sum, c) => sum + (if (c == 'C' || c == 'G') 1 else 0)
    }

    numGC.toDouble / s.length * 100
  }

  def findHighest(lines: String): (String, Double) = {
    lines.split(">").tail.map{entry =>
      val tmp = entry.split(' ')
      (tmp.head, computeGC(tmp.tail.mkString("")))
    }.foldLeft(("", 0.0)) {
      case (bestPair, curPair) => {
        if (curPair._2 > bestPair._2) curPair else bestPair
      }
    }
  }
}
