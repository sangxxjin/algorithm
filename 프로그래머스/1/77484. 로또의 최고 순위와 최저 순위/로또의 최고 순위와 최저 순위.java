import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int count =0;
        int result =0;
        List<Integer> winList = new ArrayList<>();
        for(int i =0; i<win_nums.length; i++){
            winList.add(win_nums[i]);
        }
        for(int i=0; i<lottos.length; i++){
            if(lottos[i]==0){
                count++;
                continue;
            }
            if(winList.contains(lottos[i]))result++;
        }
        return new int[] {getBank(result+count), getBank(result)};
    }
    private int getBank(int correct){
        if (correct == 6) return 1;
        if (correct == 5) return 2;
        if (correct == 4) return 3;
        if (correct == 3) return 4;
        if (correct == 2) return 5;
        return 6;
    }
}