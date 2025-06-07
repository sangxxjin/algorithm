import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        // mats기준으로 큰것부터 대조.
        // height-mat까지 검사. width-mat까지
        // 각시작점으로부터 오른쪽 아래로 이동하면서 알파벳 만나면 return false.
        Arrays.sort(mats); // 오름차순 정렬 후 역순 순회
        for (int i = mats.length - 1; i >= 0; i--) {
            int matSize = mats[i];
            for (int row = 0; row <= park.length - matSize; row++) {
                for (int col = 0; col <= park[0].length - matSize; col++) {
                    if (isCorrect(row, col, park, matSize)) {
                        return matSize;
                    }
                }
            }
        }
        return -1;
    }

    private boolean isCorrect(int x, int y, String[][] park, int size) {
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (!park[i][j].equals("-1")) {
                    return false;
                }
            }
        }
        return true;
    }
}
