package problems50;

import java.util.Scanner;

public class PrimeNumbersGeneration {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int size = input.nextInt();

		for (int i = 0; i < size; i++) {
			System.out.print(getPrimeNumber(input.nextInt()) + " ");
		}
		input.close();
	}

	public static int getPrimeNumber(int index) {
		int j = 2;
		int n = 2;

		int[] numbers = new int[2800000];

		numbers[0] = 1;
		numbers[1] = 1;

		while (n * n < numbers.length) {
			j = n * n;
			while (j < numbers.length) {
				numbers[j] = 1;
				j += n;
			}
			if (numbers[n] != 0) {
				while (numbers[n] != 0) {
					n++;
				}
			} else {
				n++;
			}
		}

		int k = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 0) {
				k++;
			}

			if (k == index) {
				return i;
			}

		}
		return -1;
	}
}
