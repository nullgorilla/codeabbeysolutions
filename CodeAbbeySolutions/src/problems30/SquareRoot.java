package problems30;

import java.util.Locale;
import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		
		double[] results = new double[size];
		
		for (int i = 0; i < size; i++) {
			results[i] = getSquareRoot(input.nextInt(), input.nextInt());
		}
		
		input.close();
		
		for (int i = 0; i < results.length; i++) {
			System.out.print(results[i]+" ");
		}
	}
	
	public static double getSquareRoot(int num, int stepNumber) {
		double r = 1;
		double d = 0;
		double diff = 0;
		for (int i = 0; i < stepNumber; i++) {
			d = num/r;
			diff = Math.abs(r-d);
			r = (r+d)/2;
			
			if(diff < 0.0000001) {
				break;
			}
		}
		return r;
	}
}
