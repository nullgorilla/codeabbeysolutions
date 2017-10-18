package problems50;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MatchingWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String words = input.nextLine();

		ArrayList<String> result = new ArrayList<>();
		
		for (int i = 0; i < words.length(); i+=4) {
			String word = words.substring(i, i+3);
			int startIndex = words.indexOf(word, i);
			int foundIndex = words.indexOf(word, startIndex+1);
			if(foundIndex != -1) {
				if(!result.contains(word))
				result.add(word);
			}
		}
		
		Collections.sort(result);

		for(String str : result) {
			System.out.print(str+" ");
		}
		
		input.close();
	}
	
}
