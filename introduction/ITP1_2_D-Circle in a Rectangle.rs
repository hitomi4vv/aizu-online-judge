use std::io;
fn main() {
  let mut input = String::new();
  io::stdin().read_line(&mut input).unwrap();
  let mut line:Vec<_> = input.split_whitespace().map(|s| s.parse::<i32>().unwrap()).collect();
  println!("{}", line[0]);
}
