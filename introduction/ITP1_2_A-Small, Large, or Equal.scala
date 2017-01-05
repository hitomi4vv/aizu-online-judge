object Main {
  def main(args:Array[String]) = {
    val sc = new java.util.Scanner(System.in)
    val a = sc.nextInt
    val b = sc.nextInt
    if (a == b) {
      println("a == b")
    } else if (a > b) {
      println("a > b")
    } else {
      println("a < b")
    }
  }
}
