object Main extends App {
  println(scala.io.StdIn.readLine.map(s => if(s.isLower) s.toUpper else s.toLower))
}
