import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a;
        if (max < b) max = b;
        if (max < c) max = c;
        if (max == a) {
            if (b + c > a) System.out.println(a + b + c);
            else System.out.println((b + c) * 2 - 1);

        }
        else if (max == b) {
            if (a + c > b) System.out.println(a + b + c);
            else System.out.println((a + c) * 2 - 1);
        }
        else if (max == c) {
            if (a + b > c) System.out.println(a + b + c);
            else System.out.println((a + b) * 2 - 1);
        }
        sc.close();
    }
}