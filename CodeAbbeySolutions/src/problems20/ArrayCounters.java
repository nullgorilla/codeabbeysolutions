package problems20;

import java.util.Scanner;

public class ArrayCounters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size =  input.nextInt();
		int counterSize = input.nextInt();
		
		int[] counters = new int[counterSize];
		
		for (int i = 0; i < size; i++) {
			counters[input.nextInt()-1]++;
		}
		
		input.close();
		
		for (int i = 0; i < counterSize; i++) {
			if(counters[i] != 0) {
				System.out.print(counters[i]+" ");
			}
		}
	}
}
