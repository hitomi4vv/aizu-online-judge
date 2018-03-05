use std::io;
fn main() {
  let mut input = String::new();
  io::stdin().read_line(&mut input).unwrap();
  for i in 1.. {
    if i == 10 { break; }
    println!("Case {}: {}", i, i);
  }
}
