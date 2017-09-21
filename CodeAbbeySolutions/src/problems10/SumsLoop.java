package problems10;

import java.util.Scanner;

public class SumsLoop {
    
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("data:");
        int size = input.nextInt();
        int[] results = new int[size];
        for(int i = 0; i < size; i++) {
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int result = getSum(num1, num2);
            results[i] = result;
        }
        
        input.close();
        
        System.out.println("answer:");
        for (int i = 0; i < results.length; i++) {
            System.out.print(results[i]+ " ");
        }
    }
    
    public static int getSum(int num1, int num2) {
        return num1 + num2;
    }

}
