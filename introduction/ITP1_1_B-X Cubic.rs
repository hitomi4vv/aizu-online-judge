use std::io;
fn main() {
  let mut input = String::new();
  io::stdin().read_line(&mut input);
  let n = input.trim().parse::<i32>();
  match n {
    Ok(x) => {println!("{0}", i32::pow(x, 3))},
    Err(e) => {println!("Error: {:?}",e)}
  }
}
