package problems50;

import java.util.Scanner;

public class BitCount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.print(getNumberOfOnes(input.nextInt()) + " ");
		}
		input.close();
	}

	public static int getNumberOfOnes(int decimalNumber) {

		int[] digits = new int[32];
		int counter = 31;

		if (decimalNumber < 0) {
			decimalNumber *= -1;
			decimalNumber--;
			for (int i = 0; i < digits.length; i++) {
				digits[i] = 1;
			}

			while (decimalNumber != 0) {
				if (decimalNumber % 2 == 0)
					digits[counter--] = 1;
				else
					digits[counter--] = 0;
				decimalNumber /= 2;
			}
		} else {
			while (decimalNumber != 0) {
				if (decimalNumber % 2 == 0)
					digits[counter--] = 0;
				else
					digits[counter--] = 1;
				decimalNumber /= 2;
			}
		}

		int numberOfOnes = 0;

		for (int i = 0; i < digits.length; i++) {
			if (digits[i] == 1) {
				numberOfOnes++;
			}
		}

		return numberOfOnes;
	}

}
