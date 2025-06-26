import java.util.*;

class Solution {

    public int solution(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        if (numbers.length == 1) {
            return numbers[0];
        }

        long currentLcm = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            int gcdValue = calculateGcd((int) currentLcm, numbers[i]);
            currentLcm = (currentLcm * numbers[i]) / gcdValue;
        }

        return (int) currentLcm;
    }

    private static int calculateGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGcd(b, a % b);
    }
}