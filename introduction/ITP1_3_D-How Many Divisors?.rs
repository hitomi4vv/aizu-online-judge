use std::io;
fn main() {
  let mut input = String::new();
  io::stdin().read_line(&mut input).unwrap();
  let mut line:Vec<_> = input.split_whitespace().map(|s| s.parse::<i32>().unwrap()).collect();
  let (a, b, c) = (line[0], line[1], line[2]);
  println!("{} {} {}", a, b, c);
}
