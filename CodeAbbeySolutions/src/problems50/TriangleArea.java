package problems50;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class TriangleArea {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.print(getArea(input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt())+" ");
		}
		
		input.close();
		
	}
	
	public static String getArea(int X1, int Y1, int X2, int Y2, int X3, int Y3) {
		DecimalFormat df = new DecimalFormat("#.#", new DecimalFormatSymbols(Locale.US));
		df.setDecimalSeparatorAlwaysShown(false);
		
		int formula = X1*(Y2-Y3)+X2*(Y3-Y1)+X3*(Y1-Y2);
		String result = df.format(Math.abs(formula/2.0));
		return result;
	}
}
