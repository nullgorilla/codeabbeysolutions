package problems60;

import java.util.Scanner;

public class QuadraticEquation {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();

		System.out.print(getRoots(input.nextInt(), input.nextInt(), input.nextInt()));

		for (int i = 0; i < size; i++) {
			System.out.print("; "+getRoots(input.nextInt(), input.nextInt(), input.nextInt()));
		}
		
		input.close();
	}
	
	public static String getRoots(int A, int B, int C) {
		int squareRoot = B*B-4*A*C;
		
		if(squareRoot < 0) {
			squareRoot*=-1;
			squareRoot = (int) Math.sqrt(squareRoot);
			int real = (B*-1)/(2*A);
			int imaginary = squareRoot/(2*A);
			
			String roots = real+"+"+imaginary+"i "+real+"-"+imaginary+"i";
			return roots;
		}
		
		int x1 = (int) ((B*-1+Math.sqrt(squareRoot))/(2*A));
		int x2 = (int) ((B*-1-Math.sqrt(squareRoot))/(2*A));
		return Integer.toString(x1)+" "+Integer.toString(x2);
	}
}
