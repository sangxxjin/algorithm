class Solution {
  public int solution(int n) {
    String parse = "";
    while (n!=0){
      parse+=n%3;
      n/=3;
    }
    int answer = Integer.parseInt(parse,3);
    return answer;
  }
}