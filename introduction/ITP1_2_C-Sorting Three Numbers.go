package main
import (
  "fmt"
  "sort"
)
func main() {
  abc := make([]int, 3)
  for i:=0;i<3;i++ {
    fmt.Scanf("%d",&abc[i])
  }
  sort.Ints(abc)
  fmt.Println(abc)
}
