package problems40;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class SmoothingWeather {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);
		int size = input.nextInt();
		
		double weather1 = input.nextDouble();
		double weather2 = input.nextDouble();
		double weather3 = input.nextDouble();
		System.out.print(weather1+" ");
		System.out.printf(smoothing(weather1, weather2, weather3)+" ");
		for (int i = 0; i < size-3; i++) {
			weather1 = weather2;
			weather2 = weather3;
			weather3 = input.nextDouble();
			System.out.printf(smoothing(weather1, weather2, weather3)+" ");
		}
		System.out.print(weather3);
		input.close();
	}
	
	public static String smoothing(double weather1, double weather2, double weather3) {
		double result = (weather1+weather2+weather3)/3;
		DecimalFormat decimalFormat = new DecimalFormat("#.##########", new DecimalFormatSymbols(Locale.US));
		return decimalFormat.format(result);
	}
	
}
