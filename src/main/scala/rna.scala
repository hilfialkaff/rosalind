class RNA {
  def replace(s: String) = {
    s.map {
      case 'T' => 'U'
      case x => x
    }
  }
}
