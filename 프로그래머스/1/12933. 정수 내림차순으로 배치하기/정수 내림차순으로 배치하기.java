import java.util.*;
class Solution {
    public long solution(long n) {
        List<Integer> arr = new ArrayList<>();
        while (n > 0) {
            arr.add((int)(n % 10));
            n /= 10;
        }

        arr.sort(Collections.reverseOrder());

        long answer = 0;
        for (int num : arr) {
            answer = answer * 10 + num;
        }
        return answer;
    }
}
