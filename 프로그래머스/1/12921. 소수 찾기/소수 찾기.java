class Solution {
    public int solution(int n) {
        if (n < 2) {
            return 0;
        }

        int answer = 1;
        for (int i = 3; i <= n; i += 2) {
            if (check(i)) {
                answer++;
            }
        }
        return answer;
    }

    private boolean check(int num) {
        if (num < 2) {
            return false;
        }

        int sqrtNum = (int) Math.sqrt(num);
        for (int i = 2; i <= sqrtNum; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
