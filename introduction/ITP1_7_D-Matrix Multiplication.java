import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), m = sc.nextInt(), l = sc.nextInt(), i, j, k;
    int[][] a = new int[n][m], b = new int[m][l];
    long c[][] = new long[n][l];
    for(i = 0; i < n; i++) for(j = 0; j < m; j++) a[i][j] = sc.nextInt();
    for(i = 0; i < m; i++) for(j = 0; j < l; j++) b[i][j] = sc.nextInt();
    for(i = 0; i < n; i++)
      for(j = 0; j < l; j++) {
        for(k = 0; k < m; k++) c[i][j] += a[i][k] * b[k][j];
        System.out.print(c[i][j] + (j+1 == l? "\n":" "));
      }
  }
}
