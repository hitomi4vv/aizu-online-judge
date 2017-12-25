package main
import (
  "bufio"
  "fmt"
  "os"
  "strconv"
  "math"
)

func main() {
  sc := bufio.NewScanner(os.Stdin)
  sc.Scan()
  var n, _ = strconv.ParseFloat(sc.Text(), 64)
  fmt.Println(math.Pow(n, 3))
}
