import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble() * Math.PI/180, h = b*Math.sin(c);
    System.out.printf("%f %f %f", a*h*.5, a+b+Math.sqrt(a*a+b*b-2*a*b*(Math.cos(c))), h);
  }
}
