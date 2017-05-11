import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, x, c;
    while((n = sc.nextInt()) + (x = sc.nextInt()) != 0) {
      c = 0;
      for(int i = 1; i < x/3; i++) c += Math.max(Math.min(n, (x-i+1)/2) - Math.max(i+1, x-i-n), 0);
      System.out.println(c);
    }
  }
}
