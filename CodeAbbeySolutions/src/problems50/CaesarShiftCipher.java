package problems50;

import java.util.Scanner;

public class CaesarShiftCipher {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int step = input.nextInt();
		input.nextLine();

		for (int i = 0; i < size; i++) {
			System.out.print(decode(input.nextLine(), step)+" ");
		}
		
		input.close();
	}

	public static String decode(String message, int step) {
		int k = 0, t = 0;
		String encodingString = "";
		while (k < message.length()) {
			char letter = message.charAt(t);

			if (Character.isLetter(letter)) {
				if (!Character.isLetter(letter - step)) {
					letter += 26;
				}
				encodingString += (char) (letter - step);
			} else {
				encodingString += letter;
			}
			t++;
			k++;
		}

		return encodingString;
	}

}
