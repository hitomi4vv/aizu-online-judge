fun main(args:Array<String>) {
  val abc = readLine()!!.split(" ").map{it.toInt()}
  println(if(abc[0] < abc[1] && abc[1] < abc[2]) "Yes" else "No")
}
