import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int coins[] = getCoins(N, scanner);
    int minCoins = calculateMinCoins(coins, K);
    System.out.println(minCoins);
  }
  private static int[] getCoins(int N, Scanner scanner){
    int coins[] = new int[N];
    for (int i = 0; i < coins.length; i++) {
      coins[i]=scanner.nextInt();
    }
    return coins;
  }
  private static int calculateMinCoins(int[] coins, int K) {
    int count = 0;
    for (int i = coins.length - 1; i >= 0; i--) {
      if (K == 0) break;
      if (coins[i] <= K) {
        count += K / coins[i];
        K %= coins[i];
      }
    }
    return count;
  }
}