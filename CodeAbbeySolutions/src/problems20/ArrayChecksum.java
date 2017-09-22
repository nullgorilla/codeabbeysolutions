package problems20;

import java.util.Scanner;

public class ArrayChecksum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] inputs = new int[size];
		
		for (int i = 0; i < size; i++) {
			inputs[i] = input.nextInt();
		}
		
		input.close();
		System.out.println(checksum(inputs));

	}

	public static long checksum(int[] inputs) {
		int seed = 113;
		int limit = 10000007;
		long result = 0;
		for (int i = 0; i < inputs.length; i++) {
			result = ((result + inputs[i]) * seed) % limit;
		}
		
		return result;
	}

}
