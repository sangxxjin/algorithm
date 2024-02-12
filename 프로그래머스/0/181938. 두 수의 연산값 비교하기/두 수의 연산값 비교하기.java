class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aa = "";
        aa +=a;
        aa+=b;
        int bb = 2*(a*b);
        if(Integer.parseInt(aa)>bb)answer=Integer.parseInt(aa);
        else answer=bb;
        
        return answer;
    }
}