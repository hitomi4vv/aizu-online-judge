package main
import "fmt"
func main() {
  c := 1
  for {
    var x int
    fmt.Scan(&x)
    if x == 0 { break }
    fmt.Printf("Case %d: %d\n", c, x)
    c++
  }
}
