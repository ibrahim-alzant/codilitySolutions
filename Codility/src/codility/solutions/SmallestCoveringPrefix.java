package codility.solutions;

import java.util.HashSet;

public class SmallestCoveringPrefix {
	
	public int solution(int A[]){
		
		HashSet<Integer>  elements = new HashSet<>();
		for(int i : A){
			elements.add(i);
		}
		for(int i=0;i<A.length;i++){
			elements.remove(A[i]);
			if(elements.size()==0){
				return i;
			}
		}
		
		return 0;
	}
	
	public static void main(String args[]){
		System.out.println(new SmallestCoveringPrefix().solution(new int[]{2,2,1,0,1}));
	}

}
