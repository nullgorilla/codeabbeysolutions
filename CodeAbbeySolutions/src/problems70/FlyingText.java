package problems70;

import java.util.Scanner;

public class FlyingText {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int width = input.nextInt(), height = input.nextInt(), length = input.nextInt();
		
		input.close();
		
		int x =0, y = 0;

		int[] positions = new int[202];

		boolean reverseX = false, reverseY = false;

		for (int i = 2; i < positions.length-1; i++) {

			if (length + x < width && !reverseX) {
				positions[i] = ++x;
			} else {
				if (x == 0) {
					reverseX = false;
					positions[i] = ++x;
				} else {
					reverseX = true;
					positions[i] = --x;
				}
			}
			i++;
			if (y < height-1 && !reverseY) {
				positions[i] = ++y;
			} else {
				if (y == 0) {
					reverseY = false;
					positions[i] = ++y;
				} else {
					reverseY = true;
					positions[i] = --y;
				}
			}
		}

		for (int i = 0; i < positions.length-1; i++) {
			System.out.print(positions[i]+" "+positions[++i]+" ");
		}
	}
}
