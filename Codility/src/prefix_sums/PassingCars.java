package prefix_sums;

public class PassingCars {

	public int solution(int[] A){
		int count = 0;
		int numberOfWestCars = 0;
		
		for(int i=0;i<A.length;i++){
			if(A[i]==1 ){
				count += numberOfWestCars;
				//numberOfEastCars++;
			}else {
				numberOfWestCars++;
			}
			if(count > 1000000000){
				return -1;
			}
			
		}
		
		return  count;
	}
	
	public static void main (String args[]){
		System.out.println(new PassingCars().solution(new int[]{0,1,0,1,1}));
	}
}
