class Solution {
  public int solution(String t, String p) {
    int answer = 0;
    
    for (int i = 0; i <= t.length() - p.length(); i++) {
      String chunk = t.substring(i, i + p.length());
      long lChunk = Long.parseLong(chunk);
      long lP = Long.parseLong(p);

      if (lChunk <= lP) {
        answer++;
      }
    }

    return answer;
  }
}