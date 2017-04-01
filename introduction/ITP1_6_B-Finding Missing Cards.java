import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.nextLine();
    List<String> cards = new ArrayList<String>();
    while(sc.hasNextLine()) cards.add(sc.nextLine());
    Arrays.asList("S", "H", "C", "D").stream().flatMap(suit -> IntStream.range(1, 14).boxed().map(i -> suit + " " + i)).filter(card -> !cards.contains(card)).forEach(System.out::println);
  }
}
