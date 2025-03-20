class Solution {
    public static boolean solution(int x) {
        boolean answer = true;
        int org = x;
        int count = 0;
        while (x>=1){
            count+=x%10;
            x/=10;
        }
        if (org%count != 0 )answer=false;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}