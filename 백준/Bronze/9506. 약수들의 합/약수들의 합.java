import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while(true){
                int n= sc.nextInt();
                if (n==-1)break;
                int[] arr= new int[n+1];
                int sum=0;
                int a=1;
                for (int i = 1; i < n; i++) {
                    if (n%i==0){
                        arr[a]=i;
                        a++;
                    }
                }
                for (int i = 1; i <= a; i++) {
                    sum+=arr[i];
                }
                if (sum!=n) System.out.println(n+" is NOT perfect.");
                if (sum==n){
                    System.out.print(n+" = ");
                    for (int i = 1; i < a-1; i++) {
                        System.out.print(arr[i]+" + ");
                    }
                    System.out.println(arr[a-1]);
                }
            }
        }
    }