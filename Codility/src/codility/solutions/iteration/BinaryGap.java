package codility.solutions.iteration;

public class BinaryGap {
	
	public int solution(int N){
		String binary = Integer.toBinaryString(N);
		binary = binary.substring(0, binary.lastIndexOf("1"));
		String gaps[] = binary.split("1");
		int maxLength = 0;
		for(int i =0; i<gaps.length;i++){
			maxLength = Math.max(maxLength, gaps[i].length());
		}
		
		return maxLength;
	}
	
	public static void main(String args[]){
		System.out.println(new BinaryGap().solution(20));
	}

}
