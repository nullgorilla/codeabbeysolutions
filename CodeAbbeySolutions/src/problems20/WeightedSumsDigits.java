package problems20;

import java.util.Scanner;

public class WeightedSumsDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();

		int[] results = new int[size];
		for (int i = 0; i < size; i++) {
			results[i] = wsd(input.nextInt());
		}

		input.close();

		for (int i : results) {
			System.out.print(i + " ");
		}
	}

	private static int wsd(int number) {
		int counter = 0;
		int digit = 0;
		int tempNumber = number;
		int sum = 0;

		while (tempNumber != 0) {
			tempNumber /= 10;
			counter++;
		}
		while (number != 0) {
			digit = number % 10;
			sum += digit * counter;
			counter--;
			number /= 10;
		}

		return sum;
	}

}
