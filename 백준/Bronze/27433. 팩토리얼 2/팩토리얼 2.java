import java.util.Scanner;
public class Main{
    static long factorial(long N){
        if (N<=1)
            return N;
        else
            return factorial(N-1)*N;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt();
        if (A==0) System.out.println(1);
        else
            System.out.println(factorial(A));
    }
}