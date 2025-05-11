import java.util.*;
class Solution {
    public List<Integer> solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();
        for(int i=0; i<commands.length; i++){
            List<Integer> arr = new ArrayList<>();
            for(int j=commands[i][0]-1; j<commands[i][1]; j++){
                arr.add(array[j]);
            }
            Collections.sort(arr);
            answer.add(arr.get(commands[i][2]-1));
        }
        return answer;
    }
}