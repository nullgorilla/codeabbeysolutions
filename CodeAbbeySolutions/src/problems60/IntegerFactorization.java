package problems60;

import java.util.Scanner;

public class IntegerFactorization {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		
		for (int i = 0; i < size; i++) {
			factorization(input.nextLong());
			System.out.print(" ");
		}
		input.close();
	}
	
	public static void factorization(long number) {
		
		for (int i = 2; i <= Math.sqrt(number); i++) {
			while(number%i == 0) {
				System.out.print(i+"*");
				number/=i;
			}
		}
		if(number!=1)
		System.out.print(number);
	}

}
