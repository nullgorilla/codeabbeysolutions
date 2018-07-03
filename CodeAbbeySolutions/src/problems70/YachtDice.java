package problems70;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class YachtDice {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int size = input.nextInt();

		for (int i = 0; i < size; i++) {

			int[] points = new int[6];
			int[] dices = new int[5];

			for (int j = 0; j < dices.length; j++) {
				dices[j] = input.nextInt();
			}

			for (int j = 0; j < dices.length; j++) {
				points[dices[j] - 1]++;
			}

			System.out.print(getMax(points) + " ");
		}

		input.close();
	}

	public static String getMax(int[] points) {

		HashMap<Integer, String> combinations = new HashMap<>();

		combinations.put(2, "pair");
		combinations.put(3, "three");
		combinations.put(4, "four");
		combinations.put(5, "yacth");
		combinations.put(1, "two-pairs");
		combinations.put(6, "full-house");

		int max = 1;

		for (int i = 0; i < points.length; i++) {
			if (points[i] > max) {
				max = points[i];
			}
		}
		if (max == 3 || max == 2) {
			Arrays.sort(points);
			if (points[4] == 2) {
				if (max == 3) {
					return combinations.get(6);
				} else {
					return combinations.get(1);
				}
			}
		}
		if (max == 1) {
			if (points[0] == 0 || points[points.length - 1] == 0) {
				return getStraight(points);
			} else {
				return "none";
			}
		}
		return combinations.get(max);
	}

	public static String getStraight(int[] points) {
		if (points[0] == 1) {
			return "small-straight";
		}
		return "big-straight";
	}

}
