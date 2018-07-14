fun main(args:Array<String>) {
  val line = readLine()!!.split(" ").map{it.toInt()}.toTypedArray()
  val a = line[0]
  val b = line[1]
  println("${a/b} ${a%b} ${a/b}");
}
