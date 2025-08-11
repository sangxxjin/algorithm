import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] canSpeak = {"aya", "ye", "woo", "ma"};
        String[] cannotSpeak = {"ayaaya", "yeye", "woowoo", "mama"};

        for (String word : babbling) {
            boolean isRepeated = false;
            for (String cannot : cannotSpeak) {
                if (word.contains(cannot)) {
                    isRepeated = true;
                    break;
                }
            }
            if (isRepeated) {
                continue;
            }

            for (String can : canSpeak) {
                word = word.replace(can, " ");
            }

            if (word.replace(" ", "").isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}