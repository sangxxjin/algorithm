import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr= new int[21];
        for (int i = 1; i < 21; i++) {
            arr[i]=i;
        }
        for (int i = 0; i < 10; i++) {
            int a =sc.nextInt();
            int b =sc.nextInt();
            if ((b-a)%2==1){ //
                for (int j = a; j <b; j++) {
                    int num1=arr[a];
                    int num2=arr[b];
                    arr[a]=num2;
                    arr[b]=num1;
                    a++;b--;
                }
            }
            if ((b-a)%2==0){
                for (int j = a; j <b; j++) {
                    if(a==b) break;
                    int num1=arr[a];
                    int num2=arr[b];
                    arr[a]=num2;
                    arr[b]=num1;
                    a++;b--;
                }
            }
        }
        for (int i = 1; i <21; i++) {
            System.out.println(arr[i]);
        }
    }
}
