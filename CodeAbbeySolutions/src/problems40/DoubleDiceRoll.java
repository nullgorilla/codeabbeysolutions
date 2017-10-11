package problems40;

import java.util.Scanner;

public class DoubleDiceRoll {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		
		for (int i = 0; i < size; i++) {
			System.out.print(getRollingResult(input.nextInt(), input.nextInt())+" ");
		}
		
		input.close();
	}
	
	public static int getRollingResult(int dice1, int dice2) {
		return (dice1%6+1)+(dice2%6+1);
	}

}
