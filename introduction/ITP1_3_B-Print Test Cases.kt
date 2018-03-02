fun main(args:Array<String>) {
  var count = 1
  while (true) {
    val line = readLine()!!.toInt()
    if (line == 0) break
    println("Case $count: $line")
    count++
  }
}
