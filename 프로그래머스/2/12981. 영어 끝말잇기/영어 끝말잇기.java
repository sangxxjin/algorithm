import java.util.ArrayList;

class Solution {
  public int[] solution(int n, String[] words) {
    int[] answer = new int[2];

    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add(words[0]);
    for (int i = 1; i < words.length; i++) {
      String s1 = words[i-1];
      String s2 = words[i];
      if (s1.charAt(s1.length()-1)!=s2.charAt(0)){
        answer[0]=i%n+1;
        answer[1]=i/n+1;
        break;
      }
      else if (arrayList.contains(words[i])){
        answer[0]=i%n+1;
        answer[1]=i/n+1;
        break;
      }
      arrayList.add(words[i]);
    }

    return answer;
  }
}