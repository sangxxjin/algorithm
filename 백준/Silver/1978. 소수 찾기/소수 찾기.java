import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int point=0;
            for (int i = 0; i < N; i++) {
                int A = sc.nextInt();
                int count=0;
                for (int j = 2; j < A; j++) {
                    if (A%j==0)count++;
                }if (count==0)point++;
                if(A==1)point--;
            }
            System.out.println(point);

        }
    }