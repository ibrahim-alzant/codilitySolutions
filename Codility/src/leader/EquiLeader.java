package leader;

import java.util.HashMap;
import java.util.Set;

public class EquiLeader {
	
	public int solution(int[] A){
		HashMap<Integer,Integer> elementsOcurrencies = new HashMap<>();
		HashMap<Integer,Integer> leaders = new HashMap<>();
		HashMap<Integer,Integer> eqLeaders = new HashMap<>();
		
		for(int i : A){
			int val = (elementsOcurrencies.get(i)==null)?1:elementsOcurrencies.get(i)+1;
			elementsOcurrencies.put(i, val);
		}
		int max = 0;
		for(int i=0;i<A.length;i++)
			if(Math.floor(A.length/elementsOcurrencies.get(A[i])) < 2)
				leaders.put(i, elementsOcurrencies.get(A[i]));
		
		for(int i:leaders.values()){
			int val = (eqLeaders.get(i)==null)?1:eqLeaders.get(i)+1;
			eqLeaders.put(i, val);
		}
		
		return (eqLeaders.size() > 0)?eqLeaders.size():-1;
	}
	
	public static void main(String args[]){
		System.out.println(new EquiLeader().solution(new int[]{4, 3, 4, 4, 4, 2}));
	}

}
