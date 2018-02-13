use std::io;
fn main() {
  let mut input = String::new();
  io::stdin().read_line(&mut input).unwrap();
  let mut abc:Vec<_> = input.split_whitespace().map(|s| s.parse::<i32>().unwrap()).collect();
  abc.sort();
  println!("{} {} {}", abc[0], abc[1], abc[2]);
}
