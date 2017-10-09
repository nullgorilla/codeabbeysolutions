package problems40;

import java.util.Scanner;

public class RotateString {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int size = input.nextInt();	
		
		for (int i = 0; i < size; i++) {
			System.out.print(rotateString(input.nextInt(), input.next())+" ");
		}
		input.close();
	}
	
	
	public static String rotateString(int index, String word) {
		
		if(index < 0) {
			index = word.length()+index;
		}
		char[] letters = word.toCharArray();
		for (int j = 0; j < index; j++) {
			int i = 0;
			char temp = letters[0];
			for (; i < letters.length-1; i++) {
				letters[i] = letters[i+1];
			}
			letters[i] = temp;
		}
		String rotateWord = String.copyValueOf(letters);
		return rotateWord;
	}
}
