import java.util.*;

class Solution {
    public int solution(int n, int k) {
        String baseK = Integer.toString(n, k);
        String[] tokens = baseK.split("0+");
        int count = 0;

        for (String token : tokens) {
            if (token.isEmpty()) continue;

            long num = Long.parseLong(token);
            if (isPrime(num)) {
                count++;
            }
        }

        return count;
    }

    private boolean isPrime(long num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
