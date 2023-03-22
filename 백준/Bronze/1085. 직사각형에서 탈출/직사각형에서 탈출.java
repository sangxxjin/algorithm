import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int min=1000;
        if (Math.abs(x-w)<min)
            min=Math.abs(x-w);
        if (Math.abs(x-0)<min)
            min=Math.abs(x-0);
        if (Math.abs(y-h)<min)
            min=Math.abs(y-h);
        if (Math.abs(y-0)<min)
            min=Math.abs(y-0);
        System.out.println(min);
    }
}