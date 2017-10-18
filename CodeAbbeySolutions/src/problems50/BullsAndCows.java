package problems50;

import java.util.Scanner;

public class BullsAndCows {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String secretValue = input.next();
		int size = input.nextInt();
		
		for (int i = 0; i < size; i++) {
			System.out.print(getHint(secretValue, input.next())+" ");
		}
		
		input.close();
	}
	
	public static String getHint(String secretValue, String guess) {
		int bulls = 0;
		int cows = 0;
		
		for (int i = 0; i < secretValue.length(); i++) {
			if(secretValue.charAt(i) == guess.charAt(i)) {
				bulls++;
			}else if(secretValue.contains(guess.charAt(i)+"")) {
				cows++;
			}
		}
		
		return bulls+"-"+cows;
	}
}
