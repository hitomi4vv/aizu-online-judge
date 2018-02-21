fun main(args:Array<String>) {
  val line = readLine()!!.split(" ").map{it.toInt()}.toTypedArray()
  val w = line[0]
  val h = line[1]
  val x = line[2]
  val y = line[3]
  val r = line[4]
  if (r <= x && x <= w - r && r <= y && y <= h - r) {
    println("Yes")
  } else {
    println("No")
  }
}
