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
  fmt.Println(line)
}
