package problems20;

import java.util.Scanner;
import problems10.Rounding;

public class AverageOfArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
	
		
		int[] results = new int[size];
		
		for (int i = 0; i < size; i++) {
			int number = 0;
			int sum = 0;
			int counter = 0;
			while((number = input.nextInt()) != 0) {
				sum += number;
				counter++;
			}
			results[i] = Rounding.getRounding(sum, counter);
		}
		input.close();
		
		for (int i = 0; i < size; i++) {
			System.out.print(results[i]+" ");
		}
	}
}
