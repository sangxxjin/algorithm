import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        String star = "*";
        int count=1;
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < count ; j++) {
                System.out.print(star);
            }
            System.out.println(); count++;
        }
    }
}