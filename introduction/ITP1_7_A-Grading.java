import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m, f, r;
    while((m = sc.nextInt()) + (f = sc.nextInt()) + (r = sc.nextInt()) != -3) {
      String grade = "F";
      if(m != -1 && f != -1 && m+f >= 30) {
        grade = "D";
        if(m+f >= 50 || r >= 50) grade = "C";
        if(m+f >= 65) grade = "B";
        if(m+f >= 80) grade = "A";
      }
      System.out.println(grade);
    }
  }
}
