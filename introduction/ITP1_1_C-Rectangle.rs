use std::io;
fn main() {
  let mut input = String::new();
  let _ = io::stdin().read_line(&mut input);
  let ab = input.trim();
  println!("{:?}", ab);
}
