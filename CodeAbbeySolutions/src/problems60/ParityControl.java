package problems60;

import java.util.Scanner;

public class ParityControl {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();

		while (number != 46) {
			String binaryNumber = String.format("%8s", Integer.toBinaryString(number)).replace(' ', '0');

			int numberOfOnes = 0;
			for (int i = 0; i < binaryNumber.length(); i++) {
				if (binaryNumber.charAt(i) == '1') {
					numberOfOnes++;
				}
			}
			if (numberOfOnes % 2 == 1) {
				number = input.nextInt();
			} else {
				System.out.print(getParity(number));
				number = input.nextInt();
				
			}
			if(number == 46) {
				System.out.print(getParity(number));
			}
		}
		input.close();
	}

	public static char getParity(int number) {
		String binaryNumber = String.format("%8s", Integer.toBinaryString(number)).replace(' ', '0');
		int asciiNumber = number;
		if (binaryNumber.charAt(0) == '1') {
			asciiNumber -= 128;
		}

		return (char) asciiNumber;
	}

}
