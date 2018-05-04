fun main(args:Array<String>) {
  while (true) {
    val line = readLine()!!
    if (line == "0 0") break
    println(line.split(" ").sorted().joinToString(separator = " "))
  }
}
