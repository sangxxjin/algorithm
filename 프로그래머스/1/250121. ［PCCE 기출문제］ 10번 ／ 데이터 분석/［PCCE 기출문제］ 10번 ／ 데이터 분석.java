import java.util.*;

class Solution {
    public List<int[]> solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> arr = new ArrayList<>();
        int search = 0;
        final int sort;

        switch (ext) {
            case "code" : search = 0; break;
            case "date" : search = 1; break;
            case "maximum" : search = 2; break;
            case "remain" : search = 3; break;
        }

        switch (sort_by) {
            case "code" : sort = 0; break;
            case "date" : sort = 1; break;
            case "maximum" : sort = 2; break;
            case "remain" : sort = 3; break;
            default: sort=0; break;
        }

        for (int[] singleData : data) {
            if (singleData[search] < val_ext) {
                arr.add(singleData);
            }
        }

        arr.sort((a, b) -> Integer.compare(a[sort], b[sort]));

        return arr;
    }
}
