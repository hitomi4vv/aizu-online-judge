use std::io;
fn main() {
  let mut input = String::new();
  io::stdin().read_line(&mut input).ok().expect("error");
  let ab: Vec<i32> = input.trim().split(" ").map(|s| s.parse().unwrap()).collect();
  println!("{0} {1}", ab[0]*ab[1], (ab[0]+ab[1])*2);
}
