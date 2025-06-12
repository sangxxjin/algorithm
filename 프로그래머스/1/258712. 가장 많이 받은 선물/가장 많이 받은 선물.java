import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int n = friends.length;
        Map<String, Integer> nameToIndex = new HashMap<>();
        for (int i = 0; i < n; i++) {
            nameToIndex.put(friends[i], i);
        }

        int[][] giftMatrix = new int[n][n];
        int[] giftScore = new int[n];

        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            int from = nameToIndex.get(parts[0]);
            int to = nameToIndex.get(parts[1]);
            giftMatrix[from][to]++;
            giftScore[from]++;
            giftScore[to]--;
        }

        int[] receiveNextMonth = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                int send_ij = giftMatrix[i][j];
                int send_ji = giftMatrix[j][i];

                if (send_ij > send_ji) {
                    receiveNextMonth[i]++;
                } else if (send_ij == send_ji) {
                    if (giftScore[i] > giftScore[j]) {
                        receiveNextMonth[i]++;
                    }
                }
            }
        }

        int max = 0;
        for (int val : receiveNextMonth) {
            max = Math.max(max, val);
        }

        return max;
    }
}
