object Main extends App {
  println(" " + (3 to scala.io.StdIn.readInt()).filter(x => x%3 == 0 || x.toString.contains("3")).mkString(" "))
}
