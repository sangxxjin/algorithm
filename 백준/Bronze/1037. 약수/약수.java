import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int answer = 0;
    ArrayList<Integer> arr = new ArrayList<>();
    int count = scanner.nextInt();
    for (int i = 0; i < count; i++) {
      arr.add(scanner.nextInt());
    }
    answer = Collections.max(arr)*Collections.min(arr);
    
    System.out.println(answer);
  }
}
