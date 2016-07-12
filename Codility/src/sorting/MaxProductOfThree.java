package sorting;

import java.math.BigInteger;
import java.util.Arrays;

public class MaxProductOfThree {

	public int solution(int[] A){
		Arrays.sort(A);
		return Math.max(A[A.length-1] * A[A.length-2] * A[A.length-3], A[0] * A[1] * A[A.length-1]);
	}
	
	public static void main(String args[]){
		System.out.println(new MaxProductOfThree().solution(new int[]{-5, 5, -5, 4}));
	}
}
