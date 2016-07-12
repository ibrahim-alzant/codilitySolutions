package counting_elements;

import java.util.HashSet;

public class FrogRiverOne {
	
	public int solution(int X, int[] A){
		int result = -1;
		HashSet<Integer>  elements = new HashSet<>();
		for(int i=1;i<=X;i++){
			elements.add(i);
		}
		for(int i=0;i<A.length;i++){
			elements.remove(A[i]);
			if(elements.size()==0){
				return i;
			}
		}
		
		return result;
	}
	
	public static void main (String args[]){
		System.out.println(new FrogRiverOne().solution(5, new int[]{1,3,1,4,2,3,4}));
	}

}
