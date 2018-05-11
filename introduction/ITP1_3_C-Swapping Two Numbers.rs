use std::io::*;
fn main() {
  let stdin = stdin();
  for line in stdin.lock().lines() {
    let l = line.unwrap();
    if l == "0 0" { break; }
    println!("{}", l);
  }
}
