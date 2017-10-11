package problems40;

import java.util.ArrayList;
import java.util.Scanner;

public class JosephusProblem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numberOfPeople = input.nextInt();
		int step = input.nextInt();
		input.close();

		ArrayList<Integer> people = new ArrayList<>();

		for (int i = 1; i <= numberOfPeople; i++) {
			people.add(i);
		}

		int j = step - 1;

		while (people.size() > 1) {
			people.remove(j);
			j += step - 1;

			if (j >= people.size()) {
				j = j % people.size();
			}
		}

		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}
	}
}
