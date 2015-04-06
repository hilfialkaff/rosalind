class TRAN {
  def compute(s1: String, s2: String): Double = {
    val compute = s1.zip(s2).foldLeft((0, 0)) {
      case ((transition, transversion), (c1, c2)) => (c1, c2) match {
        /* Purine to another purine or pyrimidine to another pyrimidine */
        case ('A', 'G') => (transition + 1, transversion)
        case ('G', 'A') => (transition + 1, transversion)
        case ('C', 'T') => (transition + 1, transversion)
        case ('T', 'C') => (transition + 1, transversion)

        /* Purine to pyrimidine and vice versa */
        case ('A', 'T') => (transition, transversion + 1)
        case ('T', 'A') => (transition, transversion + 1)
        case ('A', 'C') => (transition, transversion + 1)
        case ('C', 'A') => (transition, transversion + 1)
        case ('G', 'T') => (transition, transversion + 1)
        case ('T', 'G') => (transition, transversion + 1)
        case ('G', 'C') => (transition, transversion + 1)
        case ('C', 'G') => (transition, transversion + 1)

        case (_, _) => (transition, transversion)
      }
    }

    (1.0 * compute._1) / compute._2
  }
}
