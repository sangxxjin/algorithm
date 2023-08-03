import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int count = number;
    for (int i = 0; i < number; i++) {
      String userInput = scanner.next();

      ArrayList<Character> charList = new ArrayList<>();
      char[] arrList = new char[userInput.length()];



      for (int j = 0; j < userInput.length(); j++) {
        if (charList.contains(userInput.charAt(j))){
          if (arrList[j-1]!=userInput.charAt(j)){
            count--;
            break;
          }
        }
        charList.add(userInput.charAt(j));
        arrList[j] = userInput.charAt(j);
      }
    }
    System.out.println(count);
  }
  

}
