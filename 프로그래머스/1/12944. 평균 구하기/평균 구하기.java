class Solution {
    public double solution(int[] arr) {
		double answer = 0;
		for (int j : arr) {
			answer += j;
		}
		answer/=arr.length;
		return answer;
	}
}