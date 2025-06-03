import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());

        for (int[] wire : wires) {
            graph.get(wire[0]).add(wire[1]);
            graph.get(wire[1]).add(wire[0]);
        }

        for (int[] wire : wires) {
            boolean[] visited = new boolean[n + 1];

            // 해당 간선 제거 (임시)
            int a = wire[0], b = wire[1];
            graph.get(a).remove(Integer.valueOf(b));
            graph.get(b).remove(Integer.valueOf(a));

            int count = dfs(a, visited, graph);

            int diff = Math.abs(n - count - count);
            answer = Math.min(answer, diff);

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        return answer;
    }

    private int dfs(int node, boolean[] visited, List<List<Integer>> graph) {
        visited[node] = true;
        int count = 1;

        for (int next : graph.get(node)) {
            if (!visited[next]) {
                count += dfs(next, visited, graph);
            }
        }

        return count;
    }
}
