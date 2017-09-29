package problems30;

import java.util.Scanner;

public class LinearFunction {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();

		for (int i = 0; i < size; i++) {
			getResult(input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt());
		}

		input.close();

	}

	public static void getResult(int x1, int y1, int x2, int y2) {
		int a = (y2 - y1) / (x2 - x1);
		int b = y1 - a * x1;

		System.out.print("(" + a + " " + b + ") ");
	}

}
