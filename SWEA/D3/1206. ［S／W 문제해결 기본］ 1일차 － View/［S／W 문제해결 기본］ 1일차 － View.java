import java.util.Scanner;
import java.io.FileInputStream;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 10; i++)
		{
            int length = sc.nextInt();
            int[] buildings = new int[length];
            for (int j = 0; j < length; j++) {
                buildings[j] = sc.nextInt();
            }
            int totalView = 0;
            for (int j = 2; j < length - 2; j++) {
                int view = getViewHeight(buildings, j);
                totalView += view;
            }
            System.out.println("#"+(i+1)+" "+totalView);
		}
	}
    private static int getViewHeight(int[] buildings, int index) {
        int leftMax = Math.max(buildings[index - 1], buildings[index - 2]);
        int rightMax = Math.max(buildings[index + 1], buildings[index + 2]);
        int current = buildings[index];
        int viewHeight = current - Math.max(leftMax, rightMax);
        return viewHeight > 0 ? viewHeight : 0;
    }
}