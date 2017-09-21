package problems20;

import java.util.Scanner;

public class ArithmeticProgression {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        
        int[] results = new int[size];
        
        for (int i = 0; i < size; i++) {
            int A = input.nextInt();
            int B = input.nextInt();
            int N = input.nextInt();
            
            results[i] = getResult(A, B, N);
        }
        
        input.close();
        
        for(int i : results) {
            System.out.print(i+" ");
        }
    }

    private static int getResult(int A, int B, int N) {
        int result = 0;
        for(int i = 0; i < N; i++) {
            result += A+i*B;
        }
        return result;
    }
    
}