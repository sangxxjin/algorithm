import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int groupCount = score.length / m;
        int startIndex = score.length - (m * groupCount);
        for (int i = startIndex; i < score.length; i += m) {
            answer += score[i] * m;
        }
        return answer;
    }
}