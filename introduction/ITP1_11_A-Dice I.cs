using System;
using System.Linq;
class Dice {
  public int[] labels;
  public Dice(int[] l) {
    labels = l;
  }
}
public class Program {
  public static void Main() {
    Dice dice = new Dice(Console.ReadLine().Split(' ').Select(int.Parse).ToArray());
  }
}
