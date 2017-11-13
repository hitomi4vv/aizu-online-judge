import java.util.*;
class Dice {
  private String[] labels = new String[6];
  ArrayList<String[]> patterns = new ArrayList<>();
  Dice(String[] labels) {
    this.labels = labels;
    for(int i = 0; i < 7; i++) {
      roll(i<4?'N':'W');
      if(i==5) continue;
      setAllPattern(patterns, this.labels);
    }
  }
  private void setAllPattern(ArrayList<String[]> arr, String[] l) {
    arr.add(new String[]{l[0], l[1], l[2], l[3], l[4], l[5]});
    arr.add(new String[]{l[0], l[2], l[4], l[1], l[3], l[5]});
    arr.add(new String[]{l[0], l[4], l[3], l[2], l[1], l[5]});
    arr.add(new String[]{l[0], l[3], l[1], l[4], l[2], l[5]});
  }
  public void roll(char dir) {
    int n[] = null;
    switch(dir) {
      case 'N': n = new int[]{1, 5, 2, 3, 0, 4}; break;
      case 'S': n = new int[]{4, 0, 2, 3, 5, 1}; break;
      case 'E': n = new int[]{3, 1, 0, 5, 4, 2}; break;
      case 'W': n = new int[]{2, 1, 5, 0, 4, 3}; break;
    }
    labels = new String[]{labels[n[0]], labels[n[1]], labels[n[2]], labels[n[3]], labels[n[4]], labels[n[5]]};
  }
  public String getLabel(int n) {
    return labels[n];
  }
  public ArrayList<String[]> getPatterns() {
    return patterns;
  }
}
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Dice dice = new Dice(sc.nextLine().split(" "));
    int n = Integer.parseInt(sc.nextLine());
    for(int i = 0; i < n; i++) {
      System.out.println(sc.nextLine());
    }
  }
}
