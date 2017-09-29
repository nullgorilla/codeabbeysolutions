package problems30;

import java.util.Scanner;

public class GreatestCommonDivisor {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		
		int gcdResult = 0, lcmResult = 0;
		int num1 = 0, num2 = 0;
		
		
		for (int i = 0; i < size; i++) {
			num1 = input.nextInt();
			num2 = input.nextInt();
			
			gcdResult = gcd(num1, num2);
			lcmResult = lcm(num1, num2);

			System.out.print("("+gcdResult+" "+lcmResult+") ");
		}
		
		input.close();
	}
	
	public static int gcd(int num1, int num2) {
		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);
		int diff = max-min;
		
		if(diff == 0) {
			return max;
		}
		return gcd(min, diff);
	}
	
	public static int lcm(int num1, int num2) {
		return num1*num2/gcd(num1, num2);
	}

	

}
