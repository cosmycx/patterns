package foo.bar

object Patterns extends App {

  def isNumeric(toMatch: String): Boolean = {
    val numeric = """([0-9]+)""".r
    val alphabetic = """([a-zA-Z]+)""".r
    val alphanumeric = """([a-zA-Z0-9]+)""".r

   toMatch match {
      case numeric(value) => true
      case alphabetic(value) => false
      case alphanumeric(value) => false
      case _ => false
    } // .toMatch
    
  } // isNumeric

} // .Paterns 






