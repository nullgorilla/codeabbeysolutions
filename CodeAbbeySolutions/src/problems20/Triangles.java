package problems20;

import java.util.Scanner;

public class Triangles {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();

		int[] results = new int[size];

		for (int i = 0; i < size; i++) {
			results[i] = doesBuildTriangle(input.nextInt(), input.nextInt(), input.nextInt());
		}

		input.close();

		for (int i = 0; i < size; i++) {
			System.out.print(results[i] + " ");
		}
	}

	public static int doesBuildTriangle(int number1, int number2, int number3) {
		if (number1 + number2 < number3 || number1 + number3 < number2 || number2 + number3 < number1) {
			return 0;
		}
		return 1;
	}

}
