package sorting;

import java.math.BigInteger;
import java.util.Arrays;

public class Triangle {
	
	public int solution(int[] A) {
        // write your code in Java SE 8
		int result = 0;
		Arrays.sort(A);
		
		for(int i = A.length -1;i>1;i--){
			BigInteger sum = BigInteger.valueOf(A[i-2]).add(BigInteger.valueOf(A[i-1]));
			if (sum.compareTo(BigInteger.valueOf(A[i])) == 1){
				return 1;
			}
		}
		
		return result;
    }
	
	public static void main (String args[]){
		System.out.println(new Triangle().solution(new int[]{Integer.MAX_VALUE,Integer.MAX_VALUE-1,Integer.MAX_VALUE-2}));
	}

}
