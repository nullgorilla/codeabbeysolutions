package problems60;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int inputSize = input.nextInt();
		int[] list = new int[inputSize];

		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextInt();
		}

		int max = 0;
		int lastIndex = list.length - 1;

		while (lastIndex > 0) {
			max = 0;
			for (int i = 0; i <= lastIndex; i++) {
				if (list[i] > list[max]) {
					max = i;
				}
			}
			System.out.print(max + " ");
			swap(max, lastIndex, list);
			lastIndex--;
		}
		input.close();
	}

	public static void swap(int num1, int num2, int[] list) {
		int temp = list[num1];
		list[num1] = list[num2];
		list[num2] = temp;
	}
}
