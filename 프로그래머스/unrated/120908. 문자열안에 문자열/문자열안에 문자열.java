class Solution {
  public int solution(String str1, String str2) {
    int answer = 2;
    for (int i = 0; i <= str1.length()-str2.length(); i++) {
      if (str1.charAt(i)!=str2.charAt(0)){
        continue;
      }
      int count=0;
      for (int j = 0; j < str2.length(); j++) {
        if (str1.charAt(i+j)==str2.charAt(j))count++;
      }
      if (count==str2.length())answer=1;
    }
    return answer;
  }
}