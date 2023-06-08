import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr);
        int check = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor==0)check++;
        }
        if (check==0){
            int[] answer = {-1};
            return answer;
        }
        int[] answer=new int[check];
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor==0){
                answer[count++]=arr[i];
            }
        }
        if (count==0)answer[0]=-1;
        return answer;
    }
}