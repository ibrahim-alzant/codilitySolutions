package codility.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class test2 {

	public int solution(int[] A) {
        // write your code in Java SE 8
		HashSet<Integer> elements = new HashSet<>();
		int smallest = A.length;
		
		for(int i=0; i<A.length; i++){
			elements.add(A[i]);
		}
		for(int i=0; i<A.length;i++){
			HashSet<Integer> duplicateElements = new HashSet<>(elements);
			for(int j=i;j<A.length;j++){
				duplicateElements.remove(A[j]);
				if(duplicateElements.size() == 0){
					if((j-i) < smallest)
						smallest = (j-i) + 1;
				}
			}
		}
		return smallest;
    }
	
	public int optimalSolution(int[] A){
		int smallest = A.length;
		
		HashMap<Integer,Queue<Integer>> intervals = new HashMap<>();
		
		for(int i=0; i<A.length; i++){
			if(!intervals.containsKey(A[i]))
				intervals.put(A[i],new LinkedList<Integer>());
			
			intervals.get(A[i]).add(i);
		}
		
		
		
		for(int i=0;i<A.length;i++){
			int smallestHead = Integer.MAX_VALUE;
			
			int head = A.length;
			int tail = 0;
			
			for(Integer iterator : intervals.keySet()){
				if(intervals.get(iterator).peek() < head){
					head = intervals.get(iterator).peek();
					smallestHead = iterator;
				}
				tail = Math.max(tail, intervals.get(iterator).peek());
				
			}
			smallest = Math.min(smallest, tail-head);
			if(intervals.get(smallestHead).size()==1){
				return smallest+1;
			}
			intervals.get(smallestHead).poll();
		}
		
		
		return -1;
	}
	
	
	public static void main (String ...args){
		System.out.println(new test2().solution(new int[]{7,3,7,3,9,1,3,4,1,3,7,4,7,9}));
		System.out.println(new test2().optimalSolution(new int[]{7,3,7,3,9,1,3,4,1,3,7,4,7,9}));
	}
}
