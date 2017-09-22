package problems20;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String words = input.nextLine();
		char[] lettersOfWords = words.toCharArray();
		
		for (int i = lettersOfWords.length-1; i >= 0; i--) {
			System.out.print(lettersOfWords[i]);
		}
		
		input.close();
		
	}
	
}
