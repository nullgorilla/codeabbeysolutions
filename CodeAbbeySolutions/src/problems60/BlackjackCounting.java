package problems60;

import java.util.Scanner;

public class BlackjackCounting {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		
		input.nextLine();
		for (int i = 0; i < size; i++) {
			Scanner line = new Scanner(input.nextLine());
			int point = 0;
			
			boolean firstAce = true;
			
			while (line.hasNext()) {
				String card = line.next();
				int cardValue = 0;

				switch (card) {
				case "K":
				case "Q":
				case "J":
				case "T":
					cardValue = 10;
					break;
				case "A":
					if(point + 11 <= 21 && firstAce) {
						cardValue = 11;
						firstAce = false;
					}else {
						cardValue = 1;
					}
					break;
				default:
					cardValue = Integer.parseInt(card);
					break;
				}
				if(point > 21 && !firstAce) {
					point -= 10;
				}
				point += cardValue;
			}
			if(point > 21) {
				System.out.print("Bust ");
			}else {
				System.out.print(point+" ");
			}
			line.close();
		}
		input.close();
	}
}
