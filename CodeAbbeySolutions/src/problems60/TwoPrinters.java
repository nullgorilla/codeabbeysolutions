package problems60;

import java.util.Scanner;

public class TwoPrinters {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		
		for (int i = 0; i < size; i++) {
			int minPrintingTimes = getMinPrintingTimes(input.nextInt(), input.nextInt(), input.nextInt());
			System.out.print(minPrintingTimes+" ");
		}
		
		input.close();
	}
	
	public static int getMinPrintingTimes(int printer1, int printer2, int pages) {
		
		int sumOfPrinter1 = 0;
		int sumOfPrinter2 = 0;
		
		while(pages != 0) {
			if(sumOfPrinter1+printer1 < sumOfPrinter2+printer2) {
				sumOfPrinter1 += printer1;
			}else {
				sumOfPrinter2 += printer2;
			}
			pages--;
		}
		
		if(sumOfPrinter1 > sumOfPrinter2) {
			return sumOfPrinter1;
		}else {
			return sumOfPrinter2;
		}
		
	}
}
