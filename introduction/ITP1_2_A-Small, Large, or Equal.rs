use std::io;
fn main() {
  let mut input = String::new();
  io::stdin().read_line(&mut input).unwrap();
  let ab:Vec<i32> = input.trim().split(" ").map(|s| s.parse().unwrap()).collect();
  let a = ab[0];
  let b = ab[1];
  if a == b {
    println!("a == b");
  } else if a > b {
    println!("a > b");
  } else {
    println!("a < b");
  }
}
