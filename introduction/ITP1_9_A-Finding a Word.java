import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String w = sc.next(), t;
    int c = 0;
    while(!(t = sc.next()).equals("END_OF_TEXT")) if(t.toLowerCase().equals(w)) c++;
    System.out.println(c);
  }
}
