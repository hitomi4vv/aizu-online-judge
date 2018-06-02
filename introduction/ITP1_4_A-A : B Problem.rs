use std::io;
fn main() {
  let mut input = String::new();
  io::stdin().read_line(&mut input).unwrap();
  let l:Vec<_> = input.split_whitespace().map(|s| s.parse::<i32>().unwrap()).collect();
  let (a, b) = (l[0], l[1]);
  println!("{} {} {}", a/b, a%b, a/b);
}
