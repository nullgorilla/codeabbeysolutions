
package problems50;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		input.nextLine();
		for (int i = 0; i < size; i++) {
			System.out.print(getWinner(input.nextLine().toCharArray())+ " ");
		}
		input.close();
	}

	public static int getWinner(char[] games) {
		int player1 = 0;
		int player2 = 0;

		for (int i = 0; i < games.length - 1; i++) {
			if (games[i] != ' ') {
				if (games[i] == 'S') {
					if (games[i + 1] == 'P') {
						player1++;
					} else if (games[i + 1] == 'R') {
						player2++;
					}
				} else if (games[i] == 'P') {
					if (games[i + 1] == 'R') {
						player1++;
					} else if (games[i + 1] == 'S') {
						player2++;
					}
				} else if (games[i] == 'R') {
					if (games[i + 1] == 'S') {
						player1++;
					} else if (games[i + 1] == 'P') {
						player2++;
					}
				}
			}
		}

		return (player1 > player2 ? 1 : 2);
	}

}
