fun main(args:Array<String>) {
  val ab = readLine()!!.split(" ")
  val a = ab[0].toInt()
  val b = ab[1].toInt()
  if (a == b) {
    println("a == b")
  } else if (a > b) {
    println("a > b")
  } else {
    println("a < b")
  }
}
