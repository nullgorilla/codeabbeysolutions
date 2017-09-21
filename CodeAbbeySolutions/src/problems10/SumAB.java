package problems10;

import java.util.Scanner;

public class SumAB {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input data : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        int result = getSum(num1, num2);
        System.out.println("answer : " + result);
        input.close();
    
    }
    
    public static int getSum(int num1, int num2) {
        return num1+num2;
    }
    
}