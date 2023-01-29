import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int d = sc.nextInt();
            int t=1;
            while(t+t*t<=d) t++;
            System.out.println(t-1);
        }
    }
}