class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        int min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            min= Math.min(min,arr[i]);
        }
        int index=0;
        for(int num : arr){
            if(min!=num)answer[index++]=num;
        }
        if(answer.length==0)return new int[]{-1};
        return answer;
    }
}