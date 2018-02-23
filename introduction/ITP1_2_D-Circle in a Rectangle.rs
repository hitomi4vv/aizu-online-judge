use std::io;
fn main() {
  let mut input = String::new();
  io::stdin().read_line(&mut input).unwrap();
  let mut line:Vec<_> = input.split_whitespace().map(|s| s.parse::<i32>().unwrap()).collect();
  let (w, h, x, y, r) = (line[0], line[1], line[2], line[3], line[4]);
  if r <= x && x <= w - r && r <= y && y <= h - r {
    println!("Yes");
  } else {
    println!("No");
  }
}
