package problems50;

import java.util.Scanner;

public class CardNames {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int cardValue = 0;
		String[] suits = {"Clubs", "Spades", "Diamonds", "Hearts"};
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
	
		for (int i = 0; i < size; i++) {
			cardValue = input.nextInt();
			System.out.print(ranks[cardValue%13]+"-of-"+suits[cardValue/13]+" ");
		}
		
		input.close();
	}
}
