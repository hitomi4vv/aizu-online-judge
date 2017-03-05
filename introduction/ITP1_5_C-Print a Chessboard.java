import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h, w = 0;
    while((h = sc.nextInt()) + (w = sc.nextInt()) != 0) {
      for(int i = 0; i < h; i++) {
        String s = new String(new char[(int)Math.ceil(w*.5)]).replace("\0", (i%2 == 0? "#.":".#"));
        System.out.println(s.substring(0, s.length() - (w%2 != 0? 1:0)));
      }
      System.out.println();
    }
  }
}
