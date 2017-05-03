object Main extends App {
  io.Source.stdin.getLines.toList.init
    .map(_.split(" ").map(_.toInt).toList)
    .map({case List(m, f, r) => if(m+f >= 80) "A" else if(m+f >= 65) "B" else if(m+f >= 50 || r >= 50) "C" else if(m != -1 && f != -1 && m+f >= 30) "D" else "F"})
    .map(println)
}
