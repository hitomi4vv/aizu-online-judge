fun main(args:Array<String>) {
  val abc = readLine()!!.split(" ").map{it.toInt()}.toTypedArray()
  abc.sort()
  println(abc.joinToString(separator = " "))
}
