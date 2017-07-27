import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s;
    while(!(s = sc.next()).equals("-")) {
      int n = sc.nextInt();
      for(int i = 0; i < n; i++) {
        int h = sc.nextInt();
        s = s.substring(h) + s.substring(0, h);
      }
      System.out.println(s);
    }
  }
}
