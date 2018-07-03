package problems70;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Anagrams {

	static ArrayList<String> perm;

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();

		BufferedReader bufferedReader = new BufferedReader(
				new FileReader(System.getProperty("user.dir") + "/words.txt"));

		ArrayList<String> list = new ArrayList<>();

		String word;

		while ((word = bufferedReader.readLine()) != null) {
			list.add(word);
		}
		input.nextLine();
		bufferedReader.close();
		for (int i = 0; i < size; i++) {
			perm = new ArrayList<>();

			permutation("", input.nextLine());
			int counter = 0;

			for (int j = 1; j < perm.size(); j++) {
				if (list.contains(perm.get(j))) {
					counter++;
				}
			}
			input.close();
			System.out.println(counter);

		}
	}

	private static void permutation(String prefix, String word) {
		int wordSize = word.length();
		if (wordSize == 0) {
			if (!perm.contains(prefix)) {
				perm.add(prefix);
			}
		} else {
			for (int i = 0; i < wordSize; i++)
				permutation(prefix + word.charAt(i), word.substring(0, i) + word.substring(i + 1, wordSize));
		}
	}
}
