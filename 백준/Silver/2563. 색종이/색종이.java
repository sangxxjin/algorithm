import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count=0;
        int[][] arr= new int[101][101];
        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            for (int j = X; j <X+10 ; j++) {
                for (int k = Y; k < Y+10; k++) {
                    arr[j][k]=1;
                }
            }
        }
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                if (arr[i][j]==1)count++;
            }
        }
        System.out.println(count);
    }
}
