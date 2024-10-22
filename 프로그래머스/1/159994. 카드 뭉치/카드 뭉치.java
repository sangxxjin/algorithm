class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int firstCardIndex=0;
        int secondCardIndex=0;
        for(int i=0; i<goal.length; i++){
            if(firstCardIndex<cards1.length &&checkText(cards1[firstCardIndex],goal[i])){
                firstCardIndex++;
                continue;
            }
            if(secondCardIndex<cards2.length &&checkText(cards2[secondCardIndex],goal[i])){
                secondCardIndex++;
                continue;
            }
            return "No";
        }
        return "Yes";
    }
    private boolean checkText(String cardText, String goalText){
        return cardText.equals(goalText);
    }
}