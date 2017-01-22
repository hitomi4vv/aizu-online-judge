object Main {
  def main(args: Array[String]):Unit = {
    var count = 1
    for(line <- scala.io.Source.stdin.getLines() if line.toInt != 0) {
      println("Case " + count + ": " + line)
      count += 1
    }
  }
}
