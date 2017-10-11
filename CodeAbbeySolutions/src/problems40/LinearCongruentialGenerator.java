package problems40;

import java.util.Scanner;

public class LinearCongruentialGenerator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		
		for (int i = 0; i < size; i++) {
			System.out.print(generator(input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt())+ " ");
		}
		input.close();
	}
	
	public static int generator(int A, int C, int M, int X, int N) {
		
		int XNext = X;
		for (int i = 0; i < N; i++) {
			XNext = (A*XNext+C)%M;
		}
		
		return XNext;
	}
	
}
