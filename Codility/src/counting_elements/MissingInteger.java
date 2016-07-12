package counting_elements;

import java.util.HashSet;

public class MissingInteger {
	
	public int solution(int[] A) {
        // write your code in Java SE 8
		HashSet<Integer> elements = new HashSet<>();
		int maxVal = 0;
		
		for(int i=0;i<A.length;i++){
			maxVal = Math.max(maxVal, A[i]);
			elements.add(Math.max(A[i], 0));	
		}
		
		for(int i=1;i<= maxVal;i++){
			if(!elements.remove(i)){
				return i;
			}
		}
		return maxVal+1;
    }

	public static void main (String args[]){
		System.out.println(new MissingInteger().solution(new int[]{1}));;
	}
}
