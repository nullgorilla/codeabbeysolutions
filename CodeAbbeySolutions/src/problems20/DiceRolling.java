package problems20;

import java.util.Locale;
import java.util.Scanner;

public class DiceRolling {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		int size = input.nextInt();
		
		int[] results = new int[size];
		
		for (int i = 0; i < size; i++) {
			results[i] = getValue(input.nextDouble());
		}
		
		input.close();
		
		for (int i = 0; i < size; i++) {
			System.out.print(results[i]+" ");
		}
	}
	
	public static int getValue(double randomNumber) {
		int result = (int) (6*randomNumber+1);
		return result;
	}
	
}
