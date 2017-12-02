using System;
using System.Linq;
class Dice {
  public int[] Labels;
  public Dice(int[] l) {
    Labels = l;
  }
  public void Roll(char dir) {
    int[] n = {};
    switch(dir) {
      case 'N': n = new int[]{1, 5, 2, 3, 0, 4}; break;
      case 'S': n = new int[]{4, 0, 2, 3, 5, 1}; break;
      case 'E': n = new int[]{3, 1, 0, 5, 4, 2}; break;
      case 'W': n = new int[]{2, 1, 5, 0, 4, 3}; break;
    }
    Labels = new int[]{Labels[n[0]], Labels[n[1]], Labels[n[2]], Labels[n[3]], Labels[n[4]], Labels[n[5]]};
  }
}
public class Program {
  public static void Main() {
    Dice dice = new Dice(Console.ReadLine().Split(' ').Select(int.Parse).ToArray());
    foreach(char c in Console.ReadLine()) dice.Roll(c);
    Console.WriteLine(dice.Labels[0]);
  }
}
