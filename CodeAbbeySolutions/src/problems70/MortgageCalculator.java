package problems70;

import java.util.Scanner;

public class MortgageCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int P = input.nextInt();
		int R = input.nextInt();
		int L = input.nextInt();
		
		input.close();
		System.out.println(calculate(P, R, L));
		
	}
	
	public static int calculate(double P, double R, int L) {
        R /= 1200;
        double M = (P * R / (1 - Math.pow((1 / (1 + R)), L)));
        return (int) Math.ceil(M);
	}
}
