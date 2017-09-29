package problems30;

import java.util.Scanner;

public class SortWithIndexes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		
		int[][] list = new int[size][2];
		
		for (int i = 0; i < size; i++) {
			list[i][0] = input.nextInt();
			list[i][1] = i+1;
		}
		
		input.close();
		
		list = sort(list);
		
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i][1]+" ");
		}
	}
	
	public static int[][] sort(int[][] list) {
		for (int i = 0; i < list.length-1; i++) {
			for (int j = 0; j < list.length-i-1; j++) {
				if(list[j][0] > list[j+1][0]) {
					swapValue(j, j+1, list);
					swapIndex(j, j+1, list);
				}
			}
		}
		
		return list;
	}

	private static void swapValue(int num1, int num2, int[][] list) {

		int temp = list[num1][0];
		list[num1][0] = list[num2][0];
		list[num2][0] = temp;
	}
	
	private static void swapIndex(int num1, int num2, int[][] list) {
		int temp = list[num1][1];
		list[num1][1] = list[num2][1];
		list[num2][1] = temp;
	}
	
}
