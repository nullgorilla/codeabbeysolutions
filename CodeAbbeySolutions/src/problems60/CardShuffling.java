package problems60;

import java.util.Scanner;

public class CardShuffling {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		char[] ranks = { 'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K' };
		char[] suits = { 'C', 'D', 'H', 'S' };

		String[] deck = new String[52];
		for (int i = 0; i < deck.length; i++) {
			deck[i] = suits[i/13]+""+ranks[i%13];
		}
		
		
		for (int i = 0; i < 52; i++) {
			shuffle(input.nextInt(), i, deck);
		}
		
		
		input.close();
		
		for (int i = 0; i < deck.length; i++) {
			System.out.print(deck[i]+" ");
		}
	}
	
	public static void shuffle(int number, int counter, String[] deck) {
		
		int index = number%52;
		
		swap(counter, index, deck);
	}
	
	public static void swap(int num1, int num2, String[] deck) {
		String temp = deck[num1];
		deck[num1] = deck[num2];
		deck[num2] = temp;
	}

}
