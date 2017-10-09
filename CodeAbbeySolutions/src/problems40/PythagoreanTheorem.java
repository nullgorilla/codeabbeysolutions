package problems40;

import java.util.Scanner;

public class PythagoreanTheorem {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();

		for (int i = 0; i < size; i++) {
			System.out.print(getTypeOfTriangle(input.nextInt(), input.nextInt(), input.nextInt())+" ");
		}
		
		input.close();
	}

	
	public static char getTypeOfTriangle(int edge1, int edge2, int edge3) {
		int powTwoEdges = (edge1*edge1)+(edge2*edge2);
		int powThirdEdge = edge3*edge3;
		
		if(powThirdEdge > powTwoEdges) {
			return 'O';
		}else if(powThirdEdge == powTwoEdges) {
			return 'R';
		}else {
			return 'A';
		}
	}
}
