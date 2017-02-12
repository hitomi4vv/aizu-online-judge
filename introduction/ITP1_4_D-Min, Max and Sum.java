import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.nextLine());
    long minnum = 1000000, maxnum = -1000000, sum = 0;

    String[] line = sc.nextLine().split(" ");
    for(int i = 0; i < n; i++) {
      Long num = Long.parseLong(line[i]);
      minnum = Math.min(minnum, num);
      maxnum = Math.max(maxnum, num);
      sum += num;
    }

    System.out.println(minnum + " " + maxnum + " " + sum);
  }
}
