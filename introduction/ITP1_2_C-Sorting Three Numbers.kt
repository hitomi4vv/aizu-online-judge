fun main(args:Array<String>) {
  val abc = readLine()!!.split(" ").map{it.toInt()}
//   abc.sort()
  println(abc.joinToString(separator = " "))
}
