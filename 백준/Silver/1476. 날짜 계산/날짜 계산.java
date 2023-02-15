import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int E = 1; int E1= sc.nextInt();
        int S = 1; int S1= sc.nextInt();
        int M = 1; int M1= sc.nextInt();
        int count=1;
        while(true){
            if (E==E1 && S==S1 && M==M1)break;
            E++; S++; M++;
            if (E>15)E=1;
            if (S>28)S=1;
            if (M>19)M=1;
            count++;
        }
        System.out.println(count);
    }
}