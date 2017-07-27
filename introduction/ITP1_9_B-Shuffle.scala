object Main extends App {
  io.Source.stdin.getLines.toList.takeWhile(_!="-").map(println)
}
