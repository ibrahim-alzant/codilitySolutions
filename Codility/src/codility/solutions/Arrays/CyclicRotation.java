package codility.solutions.Arrays;

import java.util.Arrays;

public class CyclicRotation {
	
	public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
		int arrayLength = A.length ;
		int resultArray[] = new int[A.length];
		
		if(K!=0 && A.length > 1){
			for(int i = 0; i<arrayLength;i++){
				int newPosition = (i+K)%A.length;
				resultArray[newPosition] = A[i];
			}
		} else {
			return A;
		}
		return resultArray;
    }
	
	public static void main(String ...args){
		System.out.println(Arrays.toString((new CyclicRotation().solution(new int[]{3, 8, 9, 7, 6}, 3))));
	}

}