using System;
using System.Linq;
class Dice {
  public int[] labels;
  public Dice(int[] l) {
    labels = l;
  }
  public void roll(char dir) {
    switch(dir) {
      case 'N': labels = new int[]{1, 5, 2, 3, 0, 4}; break;
      case 'S': labels = new int[]{4, 0, 2, 3, 5, 1}; break;
      case 'E': labels = new int[]{3, 1, 0, 5, 4, 2}; break;
      case 'W': labels = new int[]{2, 1, 5, 0, 4, 3}; break;
    }
  }
}
public class Program {
  public static void Main() {
    Dice dice = new Dice(Console.ReadLine().Split(' ').Select(int.Parse).ToArray());
    foreach(char c in Console.ReadLine()) dice.roll(c);
  }
}
