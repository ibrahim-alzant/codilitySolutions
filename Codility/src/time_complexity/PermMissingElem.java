package time_complexity;

import java.util.HashSet;

public class PermMissingElem {

	public int solution(int[] A){
		HashSet<Integer> elements = new HashSet<>();
		for(int i=0; i<A.length; i++){
			elements.add(A[i]);
		}
		for(int i=1;i<=A.length+1;i++){
			if(!elements.contains(i)){
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String ...args){
		System.out.println(new PermMissingElem().solution(new int[]{1,2}));
	}
}
