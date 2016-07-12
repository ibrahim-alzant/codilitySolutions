package sorting;

import java.util.HashSet;

public class Distinct {
	
	public int solution(int[] A) {
        // write your code in Java SE 8
		
		HashSet<Integer> elements = new HashSet<>();
		return elements.size();
		
    }
	
	public static void main (String args[]){
		System.out.println(new Distinct().solution(new int[]{2, 1, 1, 2, 3, 1}));
	}

}
