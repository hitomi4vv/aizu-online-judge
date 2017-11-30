using System;
using System.Linq;
using System.Collections.Generic;
class Dice {
  public int[] labels;
  public List<int[]> patterns = new List<int[]>();
  public Dice(int[] l) {
    labels = l;
    for(int i = 0; i < 7; i++) {
      roll(i<4?'N':'W');
      if(i==5) continue;
      patterns.AddRange(all(labels));
    }
  }
  public List<int[]> all(int[] l) {
    return new List<int[]> {
      new int[]{l[0], l[1], l[2], l[3], l[4], l[5]},
      new int[]{l[0], l[2], l[4], l[1], l[3], l[5]},
      new int[]{l[0], l[4], l[3], l[2], l[1], l[5]},
      new int[]{l[0], l[3], l[1], l[4], l[2], l[5]}
    };
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
    int n = int.Parse(Console.ReadLine());
    for(int i = 0; i < n; i++) {
      Console.WriteLine(dice.labels[2]);
    }
  }
}
