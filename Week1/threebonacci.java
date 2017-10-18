import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws IOException {
		  Scanner input = new Scanner(new File("input.txt"));
		  PrintWriter out = new PrintWriter("output.txt");
		  int num1 = input.nextInt();
		  int num2 = input.nextInt();
		  int num3 = input.nextInt();
		  int num4 = input.nextInt();
		  if(num4 == 0) {
		    out.println(0);
	      out.close();
	      return;
		  }
		  else if(num4 == 1) {
		    out.println(num1);
        out.close();
        return;
		  }
		  else if(num4 == 2) {
		    out.println(num2);
        out.close();
        return;
		  }
		  int[] dp = new int[num4+1];
		  dp[0] = num1; dp[1] = num2; dp[2] = num3;
		  for(int i = 3; i <= num4; i++) {
		    dp[i] = dp[i-1] + dp[i-2] - dp[i-3];
		  }
		  out.println(dp[num4]);
		  out.close();
	}
}
