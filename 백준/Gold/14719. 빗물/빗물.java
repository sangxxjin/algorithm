import java.util.Scanner;
//기본적으로 왼쪽과 오른쪽에 자기보다 높은 벽이 있어야함
//왼쪽에서 가장 높은 기둥과 오른쪽에서 가장 높은 기둥을 구함
//두개의 높은 기둥 중 비교적 낮은 기둥을 구한 후 현재 위치의 높이와 차이를 주어 구함
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[] arr = new int[W];
        for (int i = 0; i < W; i++) {
            arr[i]= sc.nextInt();
        }
        int count=0;
        for (int i = 1; i < W-1; i++) {
            int left=arr[i];
            int right=arr[i];
            for (int j = 0; j < i; j++) {
                if (arr[j]>arr[i]){
                    left=Math.max(left,arr[j]);
                }
            }
            for (int j = W-1; j >i; j--) {
                if (arr[j]>arr[i]){
                    right=Math.max(right,arr[j]);
                }
            }
            if (Math.min(left,right)>arr[i]){
                count+=Math.min(left,right)-arr[i];
            }
        }
        System.out.println(count);
    }
}