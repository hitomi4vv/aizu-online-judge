import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = 0, h = 0, n = sc.nextInt();
    for(int i = 0; i < n; i++) {
      String[] s = new String[]{sc.next(), sc.next()};
      if(s[0].equals(s[1])){t++; h++;} else if(s[0].compareTo(s[1])>0) t+=3; else if(s[0].compareTo(s[1])<0) h+=3;
    }
    System.out.println(t+" "+h);
  }
}
