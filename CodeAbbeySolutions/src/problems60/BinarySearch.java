package problems60;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);
		int size = input.nextInt();
		
		for (int i = 0; i < size; i++) {
			System.out.print(binarySearch(input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble())+" ");
		}
		
		input.close();
	}

	public static double solveEquations(double A, double B, double C, double D, double X) {
		return (A * X) + (B * Math.sqrt(Math.pow(X, 3))) - (C * Math.exp((-1 * X) / 50)) - D;
	}

	public static double binarySearch(double A, double B, double C, double D) {
		double upperBound = 100, lowerBound = 0;
		double middle = (upperBound + lowerBound) / 2;
		double result = solveEquations(A, B, C, D, middle);
		while (lowerBound <= upperBound) {
			middle = (upperBound + lowerBound) / 2;
			result = solveEquations(A, B, C, D, middle);
			if (result < 0)
				lowerBound = middle + 0.0000001;
			else if (result > 0)
				upperBound = middle - 0.0000001;
		}
		return middle;
	}
}
