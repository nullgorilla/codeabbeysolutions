package problems60;

import java.util.Scanner;

public class KingAndQueen {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		
		for (int i = 0; i < size; i++) {
			if(isKingTaken(input.next(), input.next())) {
				System.out.print(" Y ");
			}else {
				System.out.print(" N ");
			}
		}
		
		input.close();
	}
	
	public static boolean isKingTaken(String KingPosition, String QueenPosition) {
		if((KingPosition.charAt(0) == QueenPosition.charAt(0)) || (KingPosition.charAt(1) == QueenPosition.charAt(1))) {
			return true;
		}
		else if(Math.abs(KingPosition.charAt(0)-QueenPosition.charAt(0)) == Math.abs(KingPosition.charAt(1) - QueenPosition.charAt(1))) {
			return true;
		}
		return false;
	}
	
}
