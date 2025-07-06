import java.util.*;

class Solution {
    private int N;
    private int[][] Q;
    private int[] ANS;
    private List<int[]> possibleCodes;
    private int answerCount;

    public int solution(int n, int[][] q, int[] ans) {
        this.N = n;
        this.Q = q;
        this.ANS = ans;
        this.possibleCodes = new ArrayList<>();
        this.answerCount = 0;

        generateCombinations(1, new int[5], 0);

        for (int[] candidateCode : possibleCodes) {
            if (isValidSecretCode(candidateCode)) {
                answerCount++;
            }
        }

        return answerCount;
    }

    private void generateCombinations(int startNum, int[] currentCombination, int count) {
        if (count == 5) {
            possibleCodes.add(Arrays.copyOf(currentCombination, 5));
            return;
        }

        if (startNum > N || (N - startNum + 1) < (5 - count)) {
            return;
        }

        currentCombination[count] = startNum;
        generateCombinations(startNum + 1, currentCombination, count + 1);

        generateCombinations(startNum + 1, currentCombination, count);
    }

    private boolean isValidSecretCode(int[] candidateCode) {
        Set<Integer> candidateSet = new HashSet<>();
        for (int num : candidateCode) {
            candidateSet.add(num);
        }

        for (int i = 0; i < Q.length; i++) {
            int[] query = Q[i];
            int expectedCount = ANS[i];
            int actualCount = 0;

            for (int qNum : query) {
                if (candidateSet.contains(qNum)) {
                    actualCount++;
                }
            }

            if (actualCount != expectedCount) {
                return false;
            }
        }

        return true;
    }
}