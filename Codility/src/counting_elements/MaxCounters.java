package counting_elements;

import java.util.Arrays;

public class MaxCounters {
	
	public int[] solution(int N, int[] A){
		int counters[] = new int[N];
		int maxCounter = counters[0];
		int lastIncrease = counters[0];
		
		for(int i=0;i<A.length;i++){
			if(A[i] <=N && A[i]>=1){
				counters[A[i]-1] = Math.max(counters[A[i]-1] , lastIncrease);
				counters[A[i]-1] += 1;
				if(counters[A[i]-1] > maxCounter)
						maxCounter = counters[A[i]-1];
			} else if(A[i] == N+1){
				lastIncrease = maxCounter;
			}
		}
		for(int i=0;i<counters.length;i++){
			counters[i] = Math.max(lastIncrease, counters[i]);
		}
		return counters;
	}
	
	public static void main(String args[]){
		System.out.println(Arrays.toString(new MaxCounters().solution(5, new int[]{3,4,4,6,1,4,4})));
		
	}

}
