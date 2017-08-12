object Main extends App {
  var t,h=0
  io.Source.stdin.getLines.toList.tail.map(_.split(" ")).foreach{s => if(s(0) == s(1)){t+=1;h+=1;} else if(s(0) > s(1)) t+=3 else if(s(0) < s(1)) h+=3}
  println(t+" "+h)
}
