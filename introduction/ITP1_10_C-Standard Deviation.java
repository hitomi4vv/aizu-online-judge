import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, i;
    double s, m, sum;
    while((n = sc.nextInt()) != 0) {
      for(i = 0, m = 0, sum = 0; i < n; i++) {
        s = sc.nextDouble();
        m += s;
        sum += s*s;
      }
      m /= n;
      System.out.println(Math.sqrt(sum/n-m*m));
    }
  }
}
