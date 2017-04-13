import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][][] arr = new int[4][3][10];
    for(int i = 0; i < n; i++) arr[sc.nextInt()-1][sc.nextInt()-1][sc.nextInt()-1] += sc.nextInt();
    for(int b = 0; b < 4; b++) {
      if(b > 0) System.out.println("####################");
      for(int f = 0; f < 3; f++) {
        for(int r = 0; r < 10; r++) System.out.print(" " + arr[b][f][r]);
        System.out.println();
      }
    }
  }
}
