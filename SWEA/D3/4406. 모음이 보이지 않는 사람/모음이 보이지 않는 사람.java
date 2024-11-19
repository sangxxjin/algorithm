import java.util.Scanner;
import java.io.FileInputStream;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        sc.nextLine();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			String data = sc.nextLine();
            String result = "";
            for(int i=0; i<data.length(); i++){
            	char dataChar = data.charAt(i);
                if(dataChar != 'a' && dataChar != 'i' && dataChar != 'o' && dataChar != 'u' && dataChar != 'e') 
                    result+=dataChar;
            }
			System.out.println("#"+test_case+" "+result);
		}
	}
}