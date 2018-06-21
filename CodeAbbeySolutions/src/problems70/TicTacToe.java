package problems70;

import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int size = input.nextInt();

		for (int i = 0; i < size; i++) {
			int[][] cells = {{3,4,5},{6,7,8},{9,0,10}};//new int[3][3];
			int j = 0;
			boolean gameOver = false;
			while (j < 9) {
				int crosses = input.nextInt() - 1;
				cells[crosses / 3][crosses % 3] = 1;
				j++;
				if (checkWin(cells) && gameOver == false) {
					System.out.print(j+" ");
					gameOver = true;
				}
				if (j < 9) {
					int noughts = input.nextInt() - 1;
					cells[noughts / 3][noughts % 3] = 2;
					j++;
					if (checkWin(cells) && gameOver == false) {
						System.out.print(j+" ");
						gameOver = true;
					}
				}
			}
			
			if(!gameOver)
			{
				System.out.print(0+" ");
			}
		}
	}

	private static boolean checkWin(int[][] cells) {
		for (int i = 0; i < cells.length; i++) {
			if (cells[i][0] == cells[i][1] && cells[i][1] == cells[i][2]) {
				return true;
			} else if (cells[0][i] == cells[1][i] && cells[1][i] == cells[2][i]) {
				return true;
			} else if(cells[0][0] == cells[1][1] && cells[1][1] == cells[2][2]) {
				return true;
			}else if(cells[0][2] == cells[1][1] && cells[1][1] == cells[2][0]) {
				return true;
			}
		}
		return false;
	}
}