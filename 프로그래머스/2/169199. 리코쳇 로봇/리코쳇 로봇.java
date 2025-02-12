import java.util.*;
class Solution {
    class Position {
        int row, col, moves;

        public Position(int row, int col, int moves) {
            this.row = row;
            this.col = col;
            this.moves = moves;
        }
    }

    public int solution(String[] board) {
        Position start = null, target = null;
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length(); j++) {
                if (board[i].charAt(j) == 'R') start = new Position(i, j, 0);
                else if (board[i].charAt(j) == 'G') target = new Position(i, j, 0);
            }
        }

        Queue<Position> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[board.length][board[0].length()];
        queue.add(start);

        while (!queue.isEmpty()) {
            Position current = queue.poll();
            int row = current.row, col = current.col, moves = current.moves;

            if (visited[row][col]) continue;
            visited[row][col] = true;

            if (row == target.row && col == target.col) return moves;

            for (int[] dir : directions) {
                int newRow = row, newCol = col;

                while (0 <= newRow + dir[0] && newRow + dir[0] < board.length &&
                       0 <= newCol + dir[1] && newCol + dir[1] < board[0].length() &&
                       board[newRow + dir[0]].charAt(newCol + dir[1]) != 'D') {
                    newRow += dir[0];
                    newCol += dir[1];
                }

                if (!visited[newRow][newCol]) queue.add(new Position(newRow, newCol, moves + 1));
            }
        }

        return -1;
    }
}
