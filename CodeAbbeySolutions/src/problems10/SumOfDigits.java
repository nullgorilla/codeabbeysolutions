package problems10;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        
        int[] results = new int[size];
        
        for (int i = 0; i < size; i++) {
            int number = input.nextInt()*input.nextInt()+input.nextInt();
            results[i] = getSum(number);
        }
        
        for(int i :results) {
            System.out.print(i+ " ");
        }
        input.close();
    }
    
    public static int getSum(int num) {
        int digit = 0;
        int sum = 0;
        
        while(num != 0) {
            digit = num%10;
            sum += digit;
            num /= 10;
        }
        
        return sum;
    }

}