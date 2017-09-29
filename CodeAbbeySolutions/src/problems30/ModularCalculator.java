package problems30;

import java.math.BigInteger;
import java.util.Scanner;

public class ModularCalculator {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String number = input.next();
		BigInteger result = new BigInteger(String.valueOf(number));
		String operator = input.next();
		while(!operator.equals("%")) {
			number = input.next();
			switch (operator) {
			case "+":
				result = result.add(new BigInteger(number));
				break;
			case "*":
				result = result.multiply(new BigInteger(number));
				break;
			default:
				break;
			}
			operator = input.next();
		}
		result = result.mod(new BigInteger(String.valueOf(input.next())));
		input.close();
		System.out.println(result);
	}

}
