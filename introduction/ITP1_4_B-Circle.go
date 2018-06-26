package main
import (
  "fmt"
  "math"
)

func main() {
  var r float64
  fmt.Scan(&r)
  fmt.Printf("%f %f", r*r*math.Pi, 2*math.Pi*r);
}
