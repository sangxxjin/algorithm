class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int gcd = getGCD(n, m);
        answer[0] = gcd;
        
        int lcm = n * m / gcd;
        answer[1] = lcm;
        
        return answer;
    }
    
    private int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
