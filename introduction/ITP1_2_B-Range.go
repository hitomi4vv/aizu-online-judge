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
  abc := strings.Split(sc.Text(), " ")
  var a, _ = strconv.Atoi(abc[0])
  var b, _ = strconv.Atoi(abc[1])
  var c, _ = strconv.Atoi(abc[2])
  if a < b && b < c {
    fmt.Println("Yes")
  } else {
    fmt.Println("No")
  }
}
