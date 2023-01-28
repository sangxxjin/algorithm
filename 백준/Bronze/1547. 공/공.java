import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int cup = 1;
        for (int i = 0; i < M; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if(X==cup) cup=Y;
            else if(Y==cup) cup=X;
        }
        System.out.println(cup);
    }
}
