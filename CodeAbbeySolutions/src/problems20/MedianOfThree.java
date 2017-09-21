package problems20;

import java.util.Scanner;

public class MedianOfThree {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        
        int[] results = new int[size];
        
        for (int i = 0; i < size; i++) {
            results[i] = getMedian(input.nextInt(), input.nextInt(), input.nextInt());
        }
        input.close();
        
        for(int i : results) {
            System.out.print(i+" ");
        }
    }

    private static int getMedian(int num1, int num2, int num3) {
        if((num1 - num2)*(num3-num1) >= 0) {
            return num1;
        }else if((num2-num1)*(num3-num2) >= 0) {
            return num2;
        }else {
            return num3;
        }
    }
    
}