object Main extends App {
  val s = readLine.trim
  println(if((s+s).contains(readLine.trim)) "Yes" else "No")
}
