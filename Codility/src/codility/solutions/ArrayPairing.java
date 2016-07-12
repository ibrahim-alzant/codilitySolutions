package codility.solutions;

import java.util.HashSet;

public class ArrayPairing {

	public int solution(int[] A) {
        // write your code in Java SE 8
		HashSet<Integer> pairs = new HashSet(); 
		for (int i=0;i<A.length; i++){
			if(!pairs.add(A[i])){
				pairs.remove(A[i]);
			}
		}
		
		return (int) pairs.toArray()[0];
    }
	
	public static void main(String ...args){
		System.out.println(new ArrayPairing().solution(new int[] {90,90,91,93,93,93,98,98}));
	}
	
}
	