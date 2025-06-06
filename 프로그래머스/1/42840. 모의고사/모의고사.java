import java.util.*;
class Solution {
    public List<Integer> solution(int[] answers) {
        List<Integer> arr = new ArrayList<>();
        int[] r = new int[]{first(answers),second(answers),third(answers)};
        int max=Math.max(r[0],Math.max(r[1],r[2]));
        for(int i=0; i<r.length; i++){
            if(r[i]==max)arr.add(i+1);
        }
        return arr;
    }
    private int first(int[] answers){
        int[] sub = new int[]{1,2,3,4,5};
        int sum=0;
        int idx=0;
        for(int i=0; i<answers.length; i++){
            if(answers[i]==sub[idx++]) sum++;
            if(idx>4)idx=0;
        }
        return sum;
    }
    private int second(int[] answers){
        // 21232425 반복
        int[] sub = new int[]{2,1,2,3,2,4,2,5};
        int sum=0;
        int idx=0;
        for(int i=0; i<answers.length; i++){
            if(answers[i]==sub[idx++]) sum++;
            if(idx>7)idx=0;
        }
        return sum;
    }
    private int third(int[] answers){
        // 33  11 22 44 55 반복
        // 21232425 반복
        int[] sub = new int[]{3,3,1,1,2,2,4,4,5,5};
        int sum=0;
        int idx=0;
        for(int i=0; i<answers.length; i++){
            if(answers[i]==sub[idx++]) sum++;
            if(idx>9)idx=0;
        }
        return sum;
    }
}