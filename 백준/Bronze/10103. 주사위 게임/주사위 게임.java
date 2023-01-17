import java.util.Scanner;
public class Main { //백준 시뮬레이션 문제 10103번
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int play1=100,play2=100;
       int round = sc.nextInt();
       int dice1,dice2;
        for (int i = 0; i < round; i++) {
            dice1= sc.nextInt();
            dice2= sc.nextInt();
            if (dice1<dice2) play1-=dice2;
            else if (dice2<dice1) play2-=dice1;
        }
        System.out.println(play1);
        System.out.println(play2);
    }
}
