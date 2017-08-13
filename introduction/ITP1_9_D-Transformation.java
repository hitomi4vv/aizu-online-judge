import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuffer s = new StringBuffer(sc.next());
    int n = sc.nextInt();
    for(int i = 0; i < n; i++) {
      String o = sc.next();
      int a = sc.nextInt(), b = sc.nextInt()+1;
      String ss = s.substring(a, b);
      switch(o) {
        case "print":   System.out.println(ss); break;
        case "reverse": s = s.replace(a, b, new StringBuffer(ss).reverse().toString()); break;
        case "replace": s = s.replace(a, b, sc.next()); break;
      }
    }
  }
}
