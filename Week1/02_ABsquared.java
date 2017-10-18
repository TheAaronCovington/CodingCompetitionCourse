import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws IOException {
		  Scanner input = new Scanner(new File("input.txt"));
		  PrintWriter out = new PrintWriter("output.txt");
		  long num1 = input.nextLong();
		  long num2 = input.nextLong();
		  long result = num1 + (num2 * num2);
		  out.println(result);
		  out.close();
	}
}
