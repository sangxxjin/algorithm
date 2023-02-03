import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sub=0;
        int count=0;
        for (int i = 0; i < 5; i++) {
            arr[i]= sc.nextInt();
        }
        while(count != 1) {
            for (int i = 0; i < 4; i++) {
                if(arr[i]>arr[i+1]){
                    sub=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=sub;
                    for (int j = 0; j < 5; j++) {
                        System.out.printf(arr[j]+" ");
                    }System.out.println("");
                }
            }
            if(arr[0]==1&&arr[1]==2&&arr[2]==3&&arr[3]==4&&arr[4]==5)count=1;
        }
    }
}
