package problems70;

import java.util.Scanner;

public class PrimeRanges {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();

		for (int i = 0; i < size; i++) {
			System.out.print(sieveEratostones(input.nextInt(), input.nextInt()) + " ");
		}
		input.close();
	}

	private static int sieveEratostones(int lowerBound, int upperBound) {

		upperBound++;

		boolean[] numbers = new boolean[upperBound];
		numbers[0] = true;
		numbers[1] = true;

		for (int i = 2; i * i < upperBound; i++) {
			if (numbers[i] == false) {
				for (int j = i * i; j < upperBound; j += i) {
					numbers[j] = true;
				}
			}
		}

		int counter = 0;
		for (int i = lowerBound; i < upperBound; i++) {
			if (!numbers[i]) {
				counter++;
			}
		}
		return counter;
	}

}
