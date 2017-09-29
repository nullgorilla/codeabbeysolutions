package problems30;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] list = new int[size];
		for (int i = 0; i < size; i++) {
			list[i] = input.nextInt();
		}
		
		input.close();
		bubbleSort(list);
	}
	
	public static void bubbleSort(int[] list) {
		int passed = 0;
		int swapCount = 0;
		boolean isSorted = false;
		
		while(!isSorted) {
			isSorted = true;
			for (int j = 0; j < list.length-1; j++) {
				if(list[j] > list[j+1]) {
					swapCount++;
					swap(j, j+1, list);
					isSorted = false;
				}
			}
			
			passed++;
		}
		
		System.out.println(passed+" "+swapCount);
	}
	
	public static void swap(int ind1, int ind2, int[] list) {
		int temp = list[ind1];
		list[ind1] = list[ind2];
		list[ind2] = temp;
	}
	
}
