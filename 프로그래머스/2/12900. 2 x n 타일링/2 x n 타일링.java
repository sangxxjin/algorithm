class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n];
        arr[0]=1;
        arr[1]=2;
        for(int i=2; i<n; i++){
            arr[i] = (arr[i-2]+arr[i-1])%1000000007;
        }
        return arr[n-1];
    }
}