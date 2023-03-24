import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int xmax=-10000;
        int xmin=10000;
        int ymax=-10000;
        int ymin=10000;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x>xmax) xmax=x;
            if (x<xmin) xmin=x;
            if (y>ymax) ymax=y;
            if (y<ymin) ymin=y;
        }
        System.out.println(Math.abs(xmax-xmin)*Math.abs(ymax-ymin));
    }
}