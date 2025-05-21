import java.util.*;
class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> types = new HashSet<>();
        for (int n : nums) types.add(n);
        return Math.min(types.size(), nums.length / 2);
    }
}