import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int C = sc.nextInt();
            int[] arr = new int [4];
            while(C>=25){
                    arr[0]++;
                    C-=25;
            }
            while (C>=10){
                arr[1]++;
                C-=10;
            }
            while (C>=5){
                arr[2]++;
                C-=5;
            }
            while(C>=1){
                arr[3]++;
                C-=1;
            }
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[j]+" ");
            }
        }
    }
}