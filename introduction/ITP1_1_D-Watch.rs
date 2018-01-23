use std::io;
fn main() {
  let mut input = String::new();
  io::stdin().read_line(&mut input).unwrap();
  let t:i32 = input.trim().parse().unwrap();
  println!("{}:{}:{}", t/3600, t/60%60, t%60);
}
