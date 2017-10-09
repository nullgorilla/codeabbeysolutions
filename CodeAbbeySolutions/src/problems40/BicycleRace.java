package problems40;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class BicycleRace {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		
		for (int i = 0; i < size; i++) {
			int distance = input.nextInt(); 
			int firstBicycleSpeed = input.nextInt();
			int secondBicycleSpeed = input.nextInt();
			
			double rendezvous = distance/((double)firstBicycleSpeed+secondBicycleSpeed);
			System.out.print(distanceToFirstDistance(rendezvous, firstBicycleSpeed)+" ");
		}
		
		input.close();
	}
	
	public static String distanceToFirstDistance(double rendezvous, int firstBicycleSpeed) {
		double result = rendezvous*firstBicycleSpeed;
		DecimalFormat decimalFormat = new DecimalFormat("#.########", new DecimalFormatSymbols(Locale.US));
		return decimalFormat.format(result);
		
	}
	
}
