import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Solution {
   
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("input.txt"));
        PrintWriter out = new PrintWriter("output.txt");
        int N = input.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        boolean AFlag = false, BFlag = false;
        int AIndex = 0, BIndex = 0, AMin = Integer.MAX_VALUE, BMin = Integer.MAX_VALUE;
        for(int i = 0; i < A.length; i++){
            A[i] = input.nextInt();
        }
        for(int i = 0; i < A.length; i++){
            B[i] = input.nextInt();
        }
        int result = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] > B[i]){
                result += A[i];
                AFlag = true;
            }
            else if(B[i] > A[i]){
                result += B[i];
                BFlag = true;
            }
            else{
                if(!AFlag){
                    result += A[i];
                    AFlag = true;
                }
                else if(!BFlag){
                    result += B[i];
                    BFlag = true;
                }
                else{
                    result += A[i];
                }
            }
        }
        if(!AFlag){
            for(int i = 0; i < N; i++){
                if(Math.abs(A[i] - B[i]) < AMin){
                    AMin = Math.abs(A[i] - B[i]);
                    AIndex = i;
                }
            }
            result -= B[AIndex];
            result += A[AIndex];
        }
        else if(!BFlag){
            for(int i = 0; i < N; i++){
                if(Math.abs(A[i] - B[i]) < BMin){
                    BMin = Math.abs(A[i] - B[i]);
                    BIndex = i;
                }
            }
            result -= A[BIndex];
            result += B[BIndex];
        }
        out.println(result);
        out.close();
    }
}
