import java.util.*;

public class Solution {

  public int[] solution(int[] arr) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    
    int num=-1;
    for(int i=0; i<arr.length; i++){
      if(arr[i] != num){
        arrayList.add(arr[i]);
        num = arr[i];
      }
    }

    int[] answer = new int [arrayList.size()];
    for (int i = 0; i < arrayList.size(); i++) {
      answer[i] = arrayList.get(i);
    }
    return answer;
  }
}