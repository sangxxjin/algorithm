import java.util.*;

	class Solution {
		public List<int[]> solution(int n) {
			List<int[]> result = new ArrayList<>();
			move(n, 1, 3, 2, result);
			return result;
		}

		private void move(int n, int from, int to, int via, List<int[]> result) {
			if (n == 1) {
				result.add(new int[]{from, to});
				return;
			}
			move(n - 1, from, via, to, result);
			result.add(new int[]{from, to});
			move(n - 1, via, to, from, result);
		}
	}