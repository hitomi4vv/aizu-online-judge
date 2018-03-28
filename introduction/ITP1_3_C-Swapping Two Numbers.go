package main
import "fmt"

func main() {
  for {
    var x, y int
    fmt.Scan(&x)
    fmt.Scan(&y)
    if x + y == 0 { break }
    if x > y { x, y = y, x }
    fmt.Println(x, y)
  }
}
