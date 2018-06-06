use std::io;
fn main() {
  let mut input = String::new();
  io::stdin().read_line(&mut input).unwrap();
  let r:f64 = input.trim().parse().unwrap();
  println!("{} {}", r*r*PI, 2*PI*r);
}
