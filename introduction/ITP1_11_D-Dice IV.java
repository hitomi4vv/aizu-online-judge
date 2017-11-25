import java.util.*;
class Dice {
  private String label = "";
  ArrayList<String> patterns = new ArrayList<>();
  Dice(String label) {
    this.label = label;
    for(int i = 0; i < 7; i++) {
      roll(i<4?'N':'W');
      if(i==5) continue;
      setAllPattern(patterns, this.label.split(" "));
    }
    patterns = new ArrayList<>(new HashSet<>(patterns));
  }
  private void setAllPattern(ArrayList<String> arr, String[] l) {
    arr.add(String.join(" ", new String[]{l[0], l[1], l[2], l[3], l[4], l[5]}));
    arr.add(String.join(" ", new String[]{l[0], l[2], l[4], l[1], l[3], l[5]}));
    arr.add(String.join(" ", new String[]{l[0], l[4], l[3], l[2], l[1], l[5]}));
    arr.add(String.join(" ", new String[]{l[0], l[3], l[1], l[4], l[2], l[5]}));
  }
  public void roll(char dir) {
    int n[] = null;
    switch(dir) {
      case 'N': n = new int[]{1, 5, 2, 3, 0, 4}; break;
      case 'S': n = new int[]{4, 0, 2, 3, 5, 1}; break;
      case 'E': n = new int[]{3, 1, 0, 5, 4, 2}; break;
      case 'W': n = new int[]{2, 1, 5, 0, 4, 3}; break;
    }
    String[] s = label.split(" ");
    label = String.join(" ", new String[]{s[n[0]], s[n[1]], s[n[2]], s[n[3]], s[n[4]], s[n[5]]});
  }
  public String getLabel(int n) {
    System.out.println(label);
    return String.valueOf(label.charAt(n));
  }
  public ArrayList<String> getPatterns() {
    return patterns;
  }
}
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    ArrayList<String> p = new ArrayList<>();
    for(int i = 0; i < n; i++) p.addAll(new Dice(sc.nextLine()).getPatterns());
    for(int i = 0; i < p.size(); i++) {
      for(int j = 0; j < p.size(); j++) {
        if(i==j) continue;
        if(p.get(i).equals(p.get(j))) {
          System.out.println("No");
          return;
        }
      }
    }
    System.out.println("Yes");
  }
}
