package problems50;

import java.util.Scanner;
import java.util.Stack;

public class MatchingBrackets {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		input.nextLine();
		
		for (int i = 0; i < size; i++) {
			System.out.print(matching(input.nextLine())+" ");
		}
		
		input.close();
	}
	
	public static int matching(String str) {
		Stack<Character> characters = new Stack<>();
		char letter;
		for (int i = 0; i < str.length(); i++) {
			letter = str.charAt(i);
			if (letter == '(' || letter == '{' || letter == '[' || letter == '<') {
				characters.push(letter);
			}else if(letter == ')') {
				if(characters.pop() != '(') {
					return 0;
				}
			}else if(letter == '}') {
				if(characters.pop() != '{') {
					return 0;
				}
			}else if(letter == ']') {
				if(characters.pop() != '[') {
					return 0;
				}
			}else if(letter == '>') {
				if(characters.pop() != '<') {
					return 0;
				}
			}
		}
		
		if (!characters.isEmpty()) {
			return 0;
		}
		return 1;
	}

}
