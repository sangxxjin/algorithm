class Solution {
    public static int[] solution(long n) {
        String str = String.valueOf(n);
        char[] arr = str.toCharArray();
        int[] answer = new int[str.length()];
        for (int i = 0; i < arr.length; i++) {
            answer[i]=arr[i]-'0';
        }
        for (int i = 0; i < arr.length/2; i++) {
            swap(answer,i,arr.length-1-i);
        }
        return answer;
    }

    public static void swap(int[] arr, int a, int b){
        int tmp = arr[a];
        arr[a]=arr[b];
        arr[b]=tmp;
    }
}