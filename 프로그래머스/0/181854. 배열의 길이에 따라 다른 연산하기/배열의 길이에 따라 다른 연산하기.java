import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> solution(int[] arr, int n) {
        List<Integer> answer = new ArrayList<>();
        boolean isLengthEven = arr.length % 2 == 0;

        for (int i = 0; i < arr.length; i++) {
            boolean shouldModify = isLengthEven ? i % 2 == 1 : i % 2 == 0;

            if (shouldModify) {
                answer.add(arr[i] + n);
            } else {
                answer.add(arr[i]);
            }
        }
        return answer;
    }
}
