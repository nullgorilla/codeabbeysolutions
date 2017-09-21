package problems10;

import java.util.Scanner;

public class Rounding {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("input data:");
        int size = input.nextInt();
        int[] result = new int[size];
        
        for (int i = 0; i < result.length; i++) {
            result[i] = getRounding(input.nextDouble(), input.nextDouble());
        }
        System.out.println("answer: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
        input.close();
        
    }
    
    public static int getRounding(double num1, double num2) {
        double divide = num1/num2;
        double remainder = divide - (int) divide;
        
        if(remainder == 0.0) {
            return (int) divide;
        }else {
            if(divide > 0) {
                return (remainder < 0.5)?(int)divide:(int)divide+1;
            }else {
                remainder *= -1;
                return (remainder > 0.5)?(int)divide-1:(int)divide;
            }
        }
    }
}