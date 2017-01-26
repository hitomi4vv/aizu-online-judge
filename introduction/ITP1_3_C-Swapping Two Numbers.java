import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      String[] line = sc.nextLine().split(" ");
      int[] arr = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();
      if (arr[0] + arr[1] == 0) {
        break;
      }
      Arrays.sort(arr);
      System.out.println(Arrays.stream(arr).mapToObj(Integer::toString).collect(Collectors.joining(" ")));
    }
  }
}
