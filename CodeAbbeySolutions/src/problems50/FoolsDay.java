package problems50;

import java.util.Scanner;

public class FoolsDay {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		input.nextLine();
		for (int i = 0; i < size; i++) {
			while (input.hasNextLine()) {
				int number = 0;
				int sum = 0;
				
				String line = input.nextLine();
				Scanner inputLine = new Scanner(line);

				while (inputLine.hasNextInt()) {
					number = inputLine.nextInt();
					sum += number * number;
				}
				System.out.print(sum + " ");
				inputLine.close();
			}
			input.close();
		}
	}
}
