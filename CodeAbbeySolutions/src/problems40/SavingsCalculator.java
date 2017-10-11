package problems40;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class SavingsCalculator {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		
		
		for (int i = 0; i < size; i++) {
			System.out.print(calculateWaitingYears(input.nextInt(), input.nextInt(), input.nextInt())+ " ");
		}
		input.close();
		
	}
	
	public static int calculateWaitingYears(double money, int requiredSum, int interestRate) {
		int year = 0;
		DecimalFormat df = new DecimalFormat("#.##", new DecimalFormatSymbols(Locale.US));
		
		while(money < requiredSum) {
			money += Double.valueOf(df.format(money*interestRate/100));
			year++;
		}
		
		return year;
	}

}
