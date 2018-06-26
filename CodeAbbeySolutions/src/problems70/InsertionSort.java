package problems70;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] numbers = new int[size];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		input.close();
		sort(numbers);

	}

	private static void sort(int[] numbers) {
		for (int i = 1; i < numbers.length; i++) {
			int shifted = 0;
			int key = numbers[i];
			int j = i-1;
			while(j >= 0 && key < numbers[j]) {
				shifted++;
				numbers[j+1] = numbers[j];
				j--;
			}
			
			numbers[j+1] = key;
			System.out.print(shifted+" ");
		}

	}
}
