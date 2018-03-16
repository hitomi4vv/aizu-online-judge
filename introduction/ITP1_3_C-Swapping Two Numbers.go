package main
import (
  "bufio"
  "fmt"
  "os"
  "strings"
)

func main() {
  sc := bufio.NewScanner(os.Stdin)
  for {
    sc.Scan()
    ab := strings.Split(sc.Text(), " ")
    fmt.Println(ab)
    if ab[0] == "0" { break }
  }
}
