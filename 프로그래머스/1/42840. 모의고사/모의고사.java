import java.util.*;
class Solution {
    public List<Integer> solution(int[] answers) {
        int[] first = new int[]{1,2,3,4,5};
        int[] second = new int[]{2,1,2,3,2,4,2,5};
        int[] third = new int[]{3,3,1,1,2,2,4,4,5,5};
        int firstAnswerCount =0;
        int secondAnswerCount =0;
        int thirdAnswerCount =0;
        for(int i=0; i<answers.length; i++){
            if(answers[i]==first[i%5]) firstAnswerCount++;
            if(answers[i]==second[i%8]) secondAnswerCount++;
            if(answers[i]==third[i%10]) thirdAnswerCount++;
        }
        int max = Math.max(firstAnswerCount,Math.max(secondAnswerCount,thirdAnswerCount));
        int[] countList = new int[]{firstAnswerCount,secondAnswerCount,thirdAnswerCount};
        List<Integer> answer = new ArrayList<>();
        for(int i =0; i<countList.length; i++){
            if(max==countList[i])answer.add(i+1);
        }
        return answer;
    }
}