import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3=0;
        int y3=0;
        for (int i = 0; i < 3; i++) {
            if (x==x1)x3=x2;
            else if (x==x2)x3=x1;
            else x3=x;
        }
        for (int i = 0; i < 3; i++) {
            if (y==y1)y3=y2;
            else if (y==y2)y3=y1;
            else y3=y;
        }
        System.out.println(x3+" "+y3);
    }
}