class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        if(wallet[0]>wallet[1]){
            int tmp = wallet[0];
            wallet[0] = wallet[1];
            wallet[1]=tmp;
        }
        
        while(true){
            if(bill[0]>bill[1]){
                int tmp = bill[0];
                bill[0] = bill[1];
                bill[1]=tmp;
            }
            if(bill[0] >wallet[0] || bill[1]>wallet[1]){
                if(bill[0]>bill[1]) bill[0]/=2;
                else bill[1]/=2;
                answer++;
            }
            else return answer;
        }
    }
}