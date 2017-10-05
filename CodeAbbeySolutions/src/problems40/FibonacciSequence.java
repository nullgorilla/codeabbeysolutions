package problems40;

import java.math.BigDecimal;
import java.util.Scanner;

public class FibonacciSequence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		
		for (int i = 0; i < size; i++) {
			System.out.print(fibIndex(input.nextBigDecimal())+" ");
		}
		
		input.close();
		
	}
	
	public static long fibIndex(BigDecimal n) {
		
		if(n.equals(BigDecimal.ZERO)) {
			return 0;
		}
		
		

		double Phi = (1+Math.sqrt(5))/2;
		long index = Math.round(Math.log(n.multiply(new BigDecimal(Double.toString(Math.log(5)))).doubleValue())/Math.log(Phi))+1L;
		
		return index;
		
	}
	
}
