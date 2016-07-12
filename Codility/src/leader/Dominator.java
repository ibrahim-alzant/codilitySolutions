package leader;

import java.util.HashMap;

public class Dominator {
	
	public int solution(int[] A){
		HashMap<Integer,Integer> elementsOcurrencies = new HashMap<>();
		for(int i : A){
			int val = (elementsOcurrencies.get(i)==null)?1:elementsOcurrencies.get(i)+1;
			elementsOcurrencies.put(i, val);
		}
		for(int i=0;i<A.length;i++)
			if(Math.floor(A.length/elementsOcurrencies.get(A[i])) < 2)
				return i;
		return -1;
	}
	
	public static void main(String args[]){
		System.out.println(new Dominator().solution(new int[]{3, 4, 3, 2, 3, -1, 3, 3}));
	}

}
