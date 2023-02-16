import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i]= sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i]= sc.nextInt();
        }

        int sum=0;
        for (int i = 0; i < N; i++) {
            int max=A[0]; int maxindex=0;
            int min=B[0]; int minindex=0;
            for (int j = 0; j < N; j++) {
                if(max<A[j]){
                    max=A[j];
                    maxindex=j;
                }
            }for (int j = 0; j < N; j++) {
                if(min>B[j]){
                    min=B[j];
                    minindex=j;
                }
            }
            sum+=A[maxindex]*B[minindex];
            A[maxindex]=0; B[minindex]=101;
        }
        System.out.println(sum);
    }
}