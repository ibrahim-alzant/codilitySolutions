package time_complexity;

public class TapeEquilibrium {
	
	public int solution(int[] A){
		int min = 0;
		int leftSideSum = 0;
		int rightSideSum = 0;
		int totalSum =0;
		
		for (int i=0; i<A.length;i++){
			totalSum +=A[i]; 
			min += Math.abs(A[i]);
		}
		rightSideSum = totalSum;
		
		for (int i=0; i<A.length-1;i++){
			leftSideSum +=A[i];
			rightSideSum -= A[i];
			if(Math.abs(leftSideSum-rightSideSum) < min){
				min = Math.abs(leftSideSum-rightSideSum);
			}
			
		}
		return min;
	}

	public static void main(String args[]){
		System.out.println(new TapeEquilibrium().solution(new int[]{3,1,2,4,3}));
	}
}
