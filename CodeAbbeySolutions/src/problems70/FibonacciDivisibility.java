package problems70;

import java.util.Scanner;

public class FibonacciDivisibility {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();

		for (int i = 0; i < size; i++) {
			System.out.print(getFib(input.nextInt())+" ");
		}
		
	}

	private static int getFib(int num) {
		int a = 0, b = 1, counter = 1;

		while (b % num != 0) {
			int temp = a % num + b % num;
			a = b;
			b = temp % num;
			counter++;
			if (b % num == 0) {
				return counter;
			}
		}
		return counter;
	}
}
