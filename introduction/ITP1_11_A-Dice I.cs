using System;
using System.Linq;
class Dice {
  public int[] labels;
  public Dice(int[] l) {
    labels = l;
  }
  public void roll(char dir) {
    int[] n = {};
    switch(dir) {
      case 'N': n = new int[]{1, 5, 2, 3, 0, 4}; break;
      case 'S': n = new int[]{4, 0, 2, 3, 5, 1}; break;
      case 'E': n = new int[]{3, 1, 0, 5, 4, 2}; break;
      case 'W': n = new int[]{2, 1, 5, 0, 4, 3}; break;
    }
    labels = new int[]{labels[n[0]], labels[n[1]], labels[n[2]], labels[n[3]], labels[n[4]], labels[n[5]]};
  }
}
public class Program {
  public static void Main() {
    Dice dice = new Dice(Console.ReadLine().Split(' ').Select(int.Parse).ToArray());
    foreach(char c in Console.ReadLine()) dice.roll(c);
    Console.WriteLine(dice.labels[0]);
  }
}
