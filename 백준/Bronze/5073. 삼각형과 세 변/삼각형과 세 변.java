import java.util.Scanner;
public class Main {
    static void max(int a, int b,int c,String s){
        int max=a;
        if (a<b)max=b;
        if (b<c)max=c;
        if (max==a&&b+c<=a) s=("Invalid");
        if (max==b&&a+c<=b) s=("Invalid");
        if (max==c&&a+b<=c) s=("Invalid");
        else if (a!=b&&b!=c&&c!=a) s=("Scalene");
        else if (a==b&&b==c) s=("Equilateral");
        else if(a==b||b==c||c==a) s=("Isosceles");
        System.out.println(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            String s = "";
            if (A==0&&B==0&C==0) break;
            max(A,B,C,s);

        }
    }
}