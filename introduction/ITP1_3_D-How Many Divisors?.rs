use std::io;
fn main() {
  let mut input = String::new();
  io::stdin().read_line(&mut input).unwrap();
  let l:Vec<_> = input.split_whitespace().map(|s| s.parse::<i32>().unwrap()).collect();
  println!("{}", (l[0]..(l[1] + 1)).filter(|i| l[2] % i == 0).count());
}
