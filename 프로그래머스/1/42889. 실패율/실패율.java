import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] stageCount = new int[N + 2]; // 1~N, N+1까지 포함
        for (int stage : stages) {
            stageCount[stage]++;
        }

        int totalPlayers = stages.length;
        List<StageFailure> list = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            int fail = stageCount[i];
            double failureRate = (totalPlayers == 0) ? 0 : (double) fail / totalPlayers;
            list.add(new StageFailure(i, failureRate));
            totalPlayers -= fail;
        }

        list.sort((a, b) -> {
            if (b.failureRate != a.failureRate)
                return Double.compare(b.failureRate, a.failureRate); // 실패율 내림차순
            return Integer.compare(a.stage, b.stage); // 같으면 스테이지 번호 오름차순
        });

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = list.get(i).stage;
        }

        return answer;
    }

    static class StageFailure {
        int stage;
        double failureRate;

        StageFailure(int stage, double failureRate) {
            this.stage = stage;
            this.failureRate = failureRate;
        }
    }
}
