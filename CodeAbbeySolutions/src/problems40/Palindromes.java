package problems40;

import java.util.Scanner;

public class Palindromes {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		input.nextLine();
		for (int i = 0; i < size; i++) {
			String words = input.nextLine();
			if(isPalindromes(words)) {
				System.out.print("Y ");
			}else {
				System.out.print("N ");
			}
		}
		
		input.close();
		
	}
	
	public static boolean isPalindromes(String words) {
		words = words.toLowerCase().replaceAll("[^a-z]", "");
		
		String reverseWords = new StringBuffer(words).reverse().toString();
		return reverseWords.equals(words);
	}
	
}
