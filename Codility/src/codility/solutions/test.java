package codility.solutions;

public class test {
	
	public String solution(String S) {
        // write your code in Java SE 8
        S = S.replace("-","");
        S = S.replace(" ","");
        StringBuilder result = new StringBuilder();
        
        StringBuilder lastPart = new StringBuilder();
        int lengthOfLastPart = S.length()%3;
        
        if(lengthOfLastPart == 1){
        	lastPart = new StringBuilder(S.substring(S.length()-4));
        	S = S.substring(0, S.length()-4);
            lastPart = lastPart.insert(2, '-');
            lastPart.insert(0, '-');
        }
        
        
        
        for(int i=0; i< S.length();i++){
        	if(i==0){
        		result.append(S.charAt(i));
        	} else {
        		if ((i%3) == 0){
        			result.append("-"); 
        		}
        		result.append(S.charAt(i));
        	}
            
        }
        return result.append(lastPart.toString()).toString();
    }
	
	public static void main(String ...args){
		System.out.println(new test().solution("-----9998989898000-9898-98-  887 87 87-8787-87"));
	}

}
