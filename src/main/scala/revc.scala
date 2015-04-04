class REVC {
  def reverseComplement(s: String) = {
    s.reverse.map {
      case 'A' => 'T'
      case 'T' => 'A'
      case 'C' => 'G'
      case 'G' => 'C'
    }.mkString("")
  }
}
