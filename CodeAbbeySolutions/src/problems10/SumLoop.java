package problems10;

import java.util.Scanner;

public class SumLoop {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("input data:");
        int size = input.nextInt();
        int result = 0;
        for (int i = 0; i < size; i++) {
            result += input.nextInt();
        }
        
        input.close();
        
        System.out.println(result);
        
    }
}