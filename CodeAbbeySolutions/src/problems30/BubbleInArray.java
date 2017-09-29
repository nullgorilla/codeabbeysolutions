package problems30;

import java.util.ArrayList;
import java.util.Scanner;

import problems20.ArrayChecksum;

public class BubbleInArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number = 0, swapCounter = 0;
		ArrayList<Integer> list = new ArrayList<>();
		while((number = input.nextInt()) != -1) {
			list.add(number);
		}
		
		input.close();
		
		swapCounter = getSwapNumber(list);
		
		long checkSum = ArrayChecksum.checksum(list);
		System.out.println(swapCounter+" "+checkSum);
	}
	
	public static int getSwapNumber(ArrayList<Integer> list) {
		int swapNumber = 0;
		
		for (int i = 0; i < list.size()-1; i++) {
				if(list.get(i) > list.get(i+1)) {
					swap(i, i+1, list);
					swapNumber++;
				}
		}
		
		return swapNumber;
	}
	
	public static void swap(int index1, int index2, ArrayList<Integer> list) {
		int temp = list.get(index1);
		list.set(index1, list.get(index2));
		list.set(index2, temp);
	}
	
}
