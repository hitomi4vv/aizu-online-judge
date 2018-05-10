fun main(args:Array<String>) {
  val line = readLine()!!.split(" ").map{it.toInt()}
  var n = 0
  for (i in line[0]..line[1]) {
    if (line[2] % i == 0) n++
  }
  println(n)
}
