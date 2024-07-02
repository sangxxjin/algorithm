class Solution {
    public String solution(int[] num) {
        StringBuilder sb = new StringBuilder();
        for (int i=1; i<num.length; i++) {
            switch (num[i] - num[i-1]) {
                case 1: sb.append("w");
                    break;
                case -1: sb.append("s");
                    break;
                case 10: sb.append("d");
                    break;
                case -10: sb.append("a");
                    break;
                default: break;
            }
        }
            return sb.toString();
    }
}