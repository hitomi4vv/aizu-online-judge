package main
import "fmt"
func main() {
  var w, h, x, y, r int
  fmt.Scan(&w, &h, &x, &y, &r)
  if r <= x && x <= w - r && r <= y && y <= h - r {
    fmt.Println("Yes")
  } else {
    fmt.Println("No")
  }
}
