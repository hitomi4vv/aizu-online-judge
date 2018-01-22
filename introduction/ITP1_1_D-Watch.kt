fun main(args:Array<String>) {
  val t = readLine()!!.toInt()
  val h = t/3600
  val m = t/60%60
  val s = t%60
  println("${h}:${m}:${s}")
}
