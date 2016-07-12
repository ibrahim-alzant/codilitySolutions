package counting_elements;

import java.util.HashSet;

public class PermCheck {
	
	public int solution(int[] A){
		
		HashSet<Integer> unuiqeElements = new HashSet<>();
		
		for(int i=0;i<A.length;i++){
			unuiqeElements.add(A[i]);
		}
		
		for(int i=1;i<=A.length;i++){
			if(!unuiqeElements.remove(i))
				return 0;
		}
		
		
		return 1;
	}

}
