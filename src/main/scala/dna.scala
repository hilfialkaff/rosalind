class DNA {
  def count(s : String) = {
    s.foldLeft((0, 0, 0, 0)) {
      case (acc, x) => x match {
        case 'A' => acc.copy(_1 = acc._1 + 1)
        case 'C' => acc.copy(_2 = acc._2 + 1)
        case 'G' => acc.copy(_3 = acc._3 + 1)
        case 'T' => acc.copy(_4 = acc._4 + 1)
      }
    }
  }
}
