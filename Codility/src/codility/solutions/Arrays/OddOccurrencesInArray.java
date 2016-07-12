package codility.solutions.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class OddOccurrencesInArray {
	
	public int solution(int[] A){
		HashSet<Integer> elements = new HashSet<Integer>();
		for(Integer i : A)
			if(!elements.add(i)){
				elements.remove(i);
			}
		
		return new ArrayList<>(elements).get(0);
		
	}
	
	public static void main (String args[]){
		System.out.println(new OddOccurrencesInArray().solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
	}

}
