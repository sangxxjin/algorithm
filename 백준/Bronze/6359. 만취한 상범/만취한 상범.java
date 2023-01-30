import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n+1];
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k*j <=n; k++) {
                    if (arr[k*j]!=0) arr[k*j]=0;
                    else arr[k*j]=1;
                }
            }
            int count=0;
            for (int j = 1; j <=n ; j++) {
                if(arr[j]==1) count++;
            }
            System.out.println(count);
        }
    }
}
