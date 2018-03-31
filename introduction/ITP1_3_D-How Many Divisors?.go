package main
import "fmt"

func main() {
  var a, b, c int
  fmt.Scan(&a)
  fmt.Scan(&b)
  fmt.Scan(&c)
  fmt.Println(a, b, c)
  n := 0
  for i:=a;i<b;i++ {
    n++
  }
  fmt.Println(n);
}
