package time_complexity;

public class FrogJmp {
	
	public int solution(int x, int y, int d){
		int completeSteps = ((y-x)/d);
		int inCompleteSteps = ((y-x)%d);
		if(inCompleteSteps > 0){
			completeSteps++;
		}
		return completeSteps ;
	}
	
	public int short_solution(int x, int y, int d){
		return  (int) Math.ceil(Integer.valueOf((y-x)).doubleValue()/Integer.valueOf(d).doubleValue());
	}
	
	public static void main (String ...args){
		System.out.println((int)Math.ceil(2.2));
		System.out.println(new FrogJmp().solution(10, 85, 30));;
		System.out.println(new FrogJmp().short_solution(10, 85, 30));;
	}

}
