package problems70;

import java.util.Scanner;

import problems40.LinearCongruentialGenerator;

public class FunnyWordGenerator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String consonants = "bcdfghjklmnprstvwxz";
		String vowels = "aeiou";

		int size = input.nextInt();
		int X = input.nextInt();

		for (int i = 0; i < size; i++) {
			
			int wordLenght = input.nextInt();
			for (int j = 1; j <= wordLenght; j++) {
				if (j % 2 == 1)
					System.out.print(consonants.charAt(LinearCongruentialGenerator.generator(445, 700001, 2097152, X, j) % 19));
				else
					System.out.print(vowels.charAt(LinearCongruentialGenerator.generator(445, 700001, 2097152, X, j) % 5));
			}
			X = LinearCongruentialGenerator.generator(445, 700001, 2097152, X, wordLenght);
			System.out.print(" ");
		}
		
		input.close();
	}

}
