import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr= new int[N+1];
        for (int i = 1; i <= N; i++) {
            int state = sc.nextInt();
            arr[i]= state;
        }
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c= sc.nextInt();
            switch(a){
                case 1: arr[b]=c;
                        break;
                case 2:
                    for (int j = b ; j <= c; j++) {
                        if(arr[j]==0) arr[j]++;
                        else if(arr[j]==1) arr[j]--;
                    } break;
                case 3:
                    for (int j = b; j <= c; j++) {
                        arr[j]=0;
                    } break;
                case 4:
                    for (int j = b; j <= c; j++) {
                        arr[j]=1;
                    }break;
            }
        }
        for (int i = 1; i <= N; i++) {
            System.out.printf(arr[i]+" ");
        }
    }
}
