import java.util.Scanner;
public class Main {
    public static void main(String[] args) { // 백준 시뮬레이션 14470번
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int time=0;
        if(a<0) {time+=(Math.abs(a)*c); a=0;}
        if(a==0) {time += d;}
        time+=(e*(b-Math.abs(a)));
        System.out.println(time);
    }
}
