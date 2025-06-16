class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;

        for (int i = 0; i < timelogs.length; i++) {
            int limitTime = (schedules[i] / 100) * 60 + (schedules[i] % 100) + 10;
            int successCount = 0;

            for (int j = 0; j < 7; j++) {
                int date = (startday + j - 1) % 7 + 1;

                if (date == 6 || date == 7) continue;

                int time = (timelogs[i][j] / 100) * 60 + (timelogs[i][j] % 100);
                if (time > limitTime) {
                    successCount = -1;
                    break;
                }
                successCount++;
            }

            if (successCount == 5) answer++;
        }

        return answer;
    }
}
