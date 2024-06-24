class Solution {
	public long solution(int w, int h) {
		long answer = 1;
		long wl = (long)w;
		long hl = (long)h;
		answer = (wl*hl)-((wl+hl)-euclidean(wl, hl));
		
		return answer;
	}
	private static long euclidean(long w, long h) {
		if(h == 0) {
			return w;
		}
		return euclidean(h, w%h);
	}
}