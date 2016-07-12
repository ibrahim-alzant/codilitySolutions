package stack_queues;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Fish {

	public int solution(int[] A, int[] B) {
		int downStream = 0;
		Stack<Integer> river = new Stack<Integer>();
		
		for(int i=0;i<A.length;i++){
			if(B[i]==1){
				river.push(i);
			}else{
				while(river.size() > 0 && A[i]>A[river.peek()]){
					river.pop();
				}
				if(river.size() ==0){
					downStream++;
				}
			}
		}
		
		return downStream+river.size();
	}

	public static void main(String args[]) {
		System.out.println(new Fish().solution(new int[] { 4, 3, 2, 1, 5 }, new int[] { 0, 1, 0, 0, 0 }));
	}

}
