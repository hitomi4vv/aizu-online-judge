use std::io;
fn main() {
  let mut input = String::new();
  io::stdin().read_line(&mut input).unwrap();
  let abc:Vec<i32> = input.trim().split(" ").map(|s| s.parse().unwrap()).collect();
  println!("{:?}", abc);
}
