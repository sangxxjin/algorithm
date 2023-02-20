import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int[] arr = new int [N.length()];
        for (int i = 0; i < N.length(); i++) {
            arr[i]= N.charAt(i);
        }
        Arrays.sort(arr);
        for (int i = N.length()-1; i >= 0; i--) {
            System.out.print(arr[i]-48);
        }
    }
}