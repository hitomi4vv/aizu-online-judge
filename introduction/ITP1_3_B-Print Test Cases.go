package main
import "fmt"
func main() {
  count := 1
  for {
    if count == 1 { break }
    count++
  }
  fmt.Println(count)
}
