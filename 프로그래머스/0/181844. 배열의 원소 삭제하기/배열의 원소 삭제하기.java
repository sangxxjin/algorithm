import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();

        for (int value : arr) {
            answer.add(value);
        }

        for (int value : delete_list) {
            answer.remove(Integer.valueOf(value));
        }

        return answer;
    }
}