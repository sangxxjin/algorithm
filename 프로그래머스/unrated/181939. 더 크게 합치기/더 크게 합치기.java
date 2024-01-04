class Solution {
  public int solution(int a, int b) {
    int answer = 0;
    String aa = String.valueOf(a);
    String bb = String.valueOf(b);
    aa+=b;
    bb+=a;
    if(Integer.parseInt(aa)>Integer.parseInt(bb))answer=Integer.parseInt(aa);
    else answer = Integer.parseInt(bb);
    return answer;
  }
}