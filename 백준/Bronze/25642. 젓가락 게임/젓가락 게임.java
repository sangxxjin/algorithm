import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            B += A;
            if (B > 4) {
                System.out.println("yt");
                break;
            }
            A+=B;
            if (A > 4) {
                System.out.println("yj");
                break;
            }
        }
    }

}
