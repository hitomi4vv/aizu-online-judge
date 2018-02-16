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
  fmt.Println(w, h, x, y, r)
}
