package problems60;

import java.util.Scanner;

public class CombinationsCounting {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long size = input.nextLong();
		
		for (long i = 0; i < size; i++) {
			System.out.print(getResult(input.nextLong(), input.nextLong())+" ");
		}
		
		input.close();
	}
	
	public static long getResult(long number1, long number2) {
		
		long diff = number1 - number2;
		
		long r = Math.max(diff, number2);
		long min = Math.min(diff, number2);
		
		for (long i = number1-1; i > r; i--) {
			number1 *= i;
		}
		for (long i = min; i > 1; i--) {
			number1 /= i;
		}
		
		return number1;
	}
}