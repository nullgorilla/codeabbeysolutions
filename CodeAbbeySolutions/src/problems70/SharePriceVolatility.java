package problems70;

import java.util.Scanner;

public class SharePriceVolatility {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		
		int[] values = new int[14];
		
		
		for (int i = 0; i < size; i++) {
			String shareName = input.next();
			for (int j = 0; j < values.length; j++) {
				values[j] = input.nextInt();
			}
			
			if(standartDeviation(values)) {
				System.out.print(shareName+" ");
			}
		}
		input.close();
	}
	
	private static boolean standartDeviation(int[] values) {
		double mean = 0;
		
		for (int i = 0; i < values.length; i++) {
			mean += values[i];
		}
		mean /= values.length;
		
		double variance = 0;
		for (int i = 0; i < values.length; i++) {
			variance += Math.pow(mean - values[i],2);
		}
		variance /= values.length;
		variance = Math.sqrt(variance);
		
		return mean/100*4 <= variance; 
		
	}
}
