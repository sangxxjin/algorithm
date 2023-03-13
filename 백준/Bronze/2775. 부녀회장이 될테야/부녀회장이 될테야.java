import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for (int i = 0; i < T; i++) {
                int k = sc.nextInt();
                int n = sc.nextInt();

                int[][] arr= new int[k+1][n+1];
                for (int j = 0; j <= k; j++) {
                    arr[j][1]=1;
                }
                for (int j = 0; j <= n; j++) {
                    arr[0][j]=j;
                }
                for (int j = 1; j <= k; j++) {
                    for (int l = 2; l <= n; l++) {
                        arr[j][l]=arr[j-1][l]+arr[j][l-1];
                    }
                }
                System.out.println(arr[k][n]);
            }
        }
    }