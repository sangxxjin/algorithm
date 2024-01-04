class Solution {
  public int solution(int a, int b) {
    int answer = 0;
    String aa = String.valueOf(a);
    String bb = String.valueOf(b);
    aa+=b;
    bb+=a;
    return Math.max(Integer.parseInt(aa),Integer.parseInt(bb));
  }
}