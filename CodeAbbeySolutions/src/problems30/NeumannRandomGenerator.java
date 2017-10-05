package problems30;

import java.util.ArrayList;
import java.util.Scanner;

public class NeumannRandomGenerator {

	static ArrayList<Integer> numbers;
	
	public static void main(String[] args) {
		numbers = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		
		for (int i = 0; i < size; i++) {
			System.out.print(generator(input.next(), 0)+" ");
			numbers.clear();
		}
		
		input.close();
	}
	
	public static int generator(String number, int counter) {
		int integerNumber = Integer.valueOf(number);
		numbers.add(integerNumber);
		counter++;
		
		int numPow = integerNumber*integerNumber;
		String stringNumPow = Integer.toString(numPow);

		if(stringNumPow.length() < 8) {
			stringNumPow = fillZeros(stringNumPow);
		}
		
		String middleNum = stringNumPow.substring(2,6);
		
		
		if(numbers.contains(Integer.valueOf(middleNum))) {
			return counter;
		}
			
		
		return generator(middleNum, counter);
		
	}
	
	public static String fillZeros(String number) {
		StringBuilder numberSB = new StringBuilder(number);
		for (int i = number.length(); i < 8; i++) {
			numberSB.insert(0, "0");
		}
		
		number = numberSB.toString();
		return number;
	}
	
}
