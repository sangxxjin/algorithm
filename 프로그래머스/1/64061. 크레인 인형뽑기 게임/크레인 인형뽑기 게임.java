import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Deque<Integer> moved = new ArrayDeque<>();

        for (int move : moves) {
            int col = move - 1;

            for (int row = 0; row < board.length; row++) {
                int doll = board[row][col];

                if (doll != 0) {
                    board[row][col] = 0;

                    if (!moved.isEmpty() && moved.peekFirst() == doll) {
                        moved.pollFirst();
                        answer += 2;
                    } else {
                        moved.offerFirst(doll);
                    }

                    break;
                }
            }
        }

        return answer;
    }
}
