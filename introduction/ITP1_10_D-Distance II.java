import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    String[] x = sc.nextLine().split(" ");
    String[] y = sc.nextLine().split(" ");
    double d, d1 = 0, d2 = 0, d3 = 0, max = 0;
    for(int i = 0; i < n; i++) {
      d = Math.abs(Double.parseDouble(x[i]) - Double.parseDouble(y[i]));
      d1 += d;
      d2 += d * d;
      d3 += d * d * d;
      if(max < d) max = d;
    }
    System.out.println(d1+"\n"+Math.sqrt(d2)+"\n"+Math.cbrt(d3)+"\n"+max);
  }
}
