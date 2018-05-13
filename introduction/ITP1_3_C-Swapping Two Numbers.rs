use std::io::*;
fn main() {
  let stdin = stdin();
  for line in stdin.lock().lines() {
    let mut l: Vec<_> = line.unwrap().split_whitespace().map(|s| s.parse::<i32>().unwrap()).collect();
    if l == [0, 0] { break; }
    l.sort();
    println!("{} {}", l[0], l[1]);
  }
}
