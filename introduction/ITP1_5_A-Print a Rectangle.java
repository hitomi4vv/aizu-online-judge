import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h, w = 0;
    while((h = sc.nextInt()) + (w = sc.nextInt()) != 0) {
      for(int i = 0; i < h; i++)
        System.out.println(new String(new char[w]).replace("\0", "#"));
      System.out.println();
    }
  }
}
