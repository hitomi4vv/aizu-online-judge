package main
import (
  "bufio"
  "fmt"
  "os"
  "strings"
  "strconv"
)

func main() {
  sc := bufio.NewScanner(os.Stdin)
  sc.Scan()
  ab := strings.Split(sc.Text(), " ")
  var a, _ = strconv.Atoi(ab[0])
  var b, _ = strconv.Atoi(ab[1])
  fmt.Println(a*b, (a+b)*2)
}
