import java.util.*;
class Solution {
    public List<Integer> solution(int[] arr, int divisor) {
        Arrays.sort(arr);
        List<Integer> answer= new ArrayList<>();
        for(int i : arr){
            if(i%divisor ==0) answer.add(i);
        }
        if(answer.isEmpty())answer.add(-1);
        return answer;
    }
}