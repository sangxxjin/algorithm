import java.util.Scanner;
public class Main { //10250
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();
            int height=0;
            int wide=1;
            while(N!=0){
                N--;
                height++;
                if (height==H+1){
                    height=1;
                    wide++;
                }
            }
             System.out.println(height*100+wide);
        }
    }
}