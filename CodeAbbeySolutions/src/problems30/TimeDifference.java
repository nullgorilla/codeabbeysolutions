package problems30;

import java.util.Scanner;

public class TimeDifference {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		for (int i = 0; i < size; i++) {
			difference(input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt());
		}
		input.close();
	}
	
	public static void difference(int day1, int hour1, int min1, int sec1, int day2, int hour2 , int min2, int sec2) {
		int secDiff = sec2-sec1;
		int minDiff = min2-min1;
		int hourDiff = hour2-hour1;
		int dayDiff = day2-day1;
		
		if(secDiff < 0) {
			secDiff += 60;
			minDiff--;
		}if(minDiff < 0) {
			minDiff += 60;
			hourDiff--;
		}if(hourDiff < 0) {
			hourDiff += 24;
			dayDiff--;
		}
		System.out.print("("+dayDiff+" "+hourDiff+" "+minDiff+" "+secDiff+") ");
		
	}
}
