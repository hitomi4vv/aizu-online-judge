package main
import "fmt"
func main() {
  abc := make([]int, 3)
  for i:=0;i<3;i++ {
    fmt.Scanf("%d",&abc[i])
  }
  if abc[0] < abc[1] && abc[1] < abc[2] {
    fmt.Println("Yes")
  } else {
    fmt.Println("No")
  }
}
