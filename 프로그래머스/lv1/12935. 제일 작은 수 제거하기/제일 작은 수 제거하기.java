import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] temp = arr.clone();
        Arrays.sort(temp);
        int min = temp[0];
        if (arr.length==1){
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[arr.length-1];
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==min){
                continue;
            }
            answer[a]=arr[i];
            a++;
        }
        return answer;
    }
}