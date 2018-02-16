package main
import (
  "bufio"
  "fmt"
  "os"
  "strings"
)
func main() {
  sc := bufio.NewScanner(os.Stdin)
  sc.Scan()
  line := strings.Split(sc.Text(), " ")
  w, h, x, y, r := line[0], line[1], line[2], line[3], line[4]
  if r <= x && x <= w - r && r <= y && y <= h - r {
    fmt.Println("Yes")
  } else {
    fmt.Println("No")
  }
}
