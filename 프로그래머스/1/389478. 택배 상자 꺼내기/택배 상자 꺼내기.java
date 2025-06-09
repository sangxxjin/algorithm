class Solution {
    public int solution(int n, int w, int num) {
		int rows = (int) Math.ceil((double) n / w);
		int[][] map = new int[rows][w];

		fillBoxes(map, n, w);

		int[] pos = findBoxPosition(map, num);
		int row = pos[0];
		int col = pos[1];

		int count = 0;
		for (int i = row; i < rows; i++) {
			if (map[i][col] != 0) {
				count++;
			}
		}

		return count;
	}

	private void fillBoxes(int[][] map, int n, int w) {
		int box = 1;
		int rows = map.length;

		for (int i = 0; i < rows; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < w && box <= n; j++) {
					map[i][j] = box++;
				}
			} else {
				for (int j = w - 1; j >= 0 && box <= n; j--) {
					map[i][j] = box++;
				}
			}
		}
	}

	private int[] findBoxPosition(int[][] map, int num) {
		int rows = map.length;
		int cols = map[0].length;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (map[i][j] == num) {
					return new int[]{i, j};
				}
			}
		}
		return new int[]{-1, -1}; 
	}
}