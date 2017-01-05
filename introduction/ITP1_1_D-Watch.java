import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int time = Integer.parseInt(sc.nextLine());
    int hour = time / 3600;
    int minutes = (time / 60) % 60;
    int seconds = time % 60;
    System.out.println(hour + ":" + minutes + ":" + seconds);
  }
}
