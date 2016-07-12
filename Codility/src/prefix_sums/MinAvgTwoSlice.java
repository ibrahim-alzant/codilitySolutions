package prefix_sums;

public class MinAvgTwoSlice {

	
	public int solution(int[] A){
		double minAvg = (A[0]+A[1])/2.0;
		int indexOfMinAvg = 0;
		
		for(int i=0;i<A.length-1;i++){
			if((A[i]+A[i+1])/2.0 < minAvg){
				minAvg = (A[i]+A[i+1])/2.0;
				indexOfMinAvg = i;
			}
			if((i < A.length -2)&&(A[i]+A[i+1]+A[i+2])/3.0 < minAvg){
				minAvg = (A[i]+A[i+1]+A[i+2])/3.0;
				indexOfMinAvg = i;
			}
		}
 
		
		return indexOfMinAvg;
	}
	
	
	public static void main(String args[]){
		System.out.println(new MinAvgTwoSlice().solution(new int[]{5, 6, 3, 4, 9}));
	}
}
