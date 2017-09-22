package problems30;

import java.util.Scanner;

public class CollatzSequence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		
		int[] results = new int[size];
		
		for (int i = 0; i < size; i++) {
			results[i] = collatz(input.nextInt());
		}
		
		input.close();
		
		for (int i = 0; i < size; i++) {
			System.out.print(results[i]+ " ");
		}
	}
	
	public static int collatz(int number) {
		int counter = 0;
		while(number != 1) {
			if(number % 2 == 0) {
				number /=2;
			}else {
				number = 3*number+1;
			}
			counter++;
		}
		
		return counter;
	}
	
}
