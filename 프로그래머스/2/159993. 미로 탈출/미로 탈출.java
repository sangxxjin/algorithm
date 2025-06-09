import java.util.*;

class Solution {
    static int n, m;
    static int[][] directions = {{-1,0}, {1,0}, {0,-1}, {0,1}};
    static boolean[][] visited;

    public int solution(String[] maps) {
        n = maps.length;
        m = maps[0].length();

        Point start = null, lever = null, end = null;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char ch = maps[i].charAt(j);
                if (ch == 'S') start = new Point(i, j, 0);
                if (ch == 'L') lever = new Point(i, j, 0);
                if (ch == 'E') end = new Point(i, j, 0);
            }
        }

        int toLever = bfs(maps, start, 'L');
        if (toLever == -1) return -1;

        int toExit = bfs(maps, lever, 'E');
        if (toExit == -1) return -1;

        return toLever + toExit;
    }

    static int bfs(String[] maps, Point start, char target) {
        visited = new boolean[n][m];
        Queue<Point> queue = new LinkedList<>();
        queue.add(start);
        visited[start.x][start.y] = true;

        while (!queue.isEmpty()) {
            Point now = queue.poll();

            if (maps[now.x].charAt(now.y) == target) {
                return now.dist;
            }

            for (int[] dir : directions) {
                int nx = now.x + dir[0];
                int ny = now.y + dir[1];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if (visited[nx][ny] || maps[nx].charAt(ny) == 'X') continue;

                visited[nx][ny] = true;
                queue.add(new Point(nx, ny, now.dist + 1));
            }
        }

        return -1;
    }
}
class Point {
    int x, y, dist;

    Point(int x, int y, int dist) {
        this.x = x;
        this.y = y;
        this.dist = dist;
    }
}
