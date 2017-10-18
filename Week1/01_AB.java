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
		  int result = num1+num2;
		  out.println(result);
		  out.close();
	}
}
