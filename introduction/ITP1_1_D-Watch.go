package main
import (
  "bufio"
  "fmt"
  "os"
  "strconv"
)

func main() {
  sc := bufio.NewScanner(os.Stdin)
  sc.Scan()
  t, _ := strconv.Atoi(sc.Text())
  h, m, s := t/3600, t/60%60, t%60
  fmt.Printf("%d:%d:%d\n", h, m, s)
}
