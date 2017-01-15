import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] line = sc.nextLine().split(" ");

    int w = Integer.parseInt(line[0]);
    int h = Integer.parseInt(line[1]);
    int x = Integer.parseInt(line[2]);
    int y = Integer.parseInt(line[3]);
    int r = Integer.parseInt(line[4]);

    if (r <= x && x <= w - r && r <= y && y <= h - r) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
