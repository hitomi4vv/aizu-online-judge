use std::io::*;
fn main() {
  let stdin = stdin();
  for (i, line) in stdin.lock().lines().enumerate() {
    let x = line.unwrap();
    if x == "0" { break; }
    println!("Case {}: {}", i+1, x);
  }
}
