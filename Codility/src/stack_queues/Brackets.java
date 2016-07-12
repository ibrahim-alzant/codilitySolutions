package stack_queues;

import java.util.HashMap;
import java.util.Stack;

public class Brackets {
	
	public int solution(String S) {
        // write your code in Java SE 8
		Stack<Character> stack = new Stack<Character>();
		char array[] = S.toCharArray();
		
		if(S.length()%2 == 1)
			return 0;
		
		HashMap<Character,Character> pairs = new HashMap<>();
		pairs.put(']','[');
		pairs.put(')','(');
		pairs.put('}','{');
				
		for(int i=0; i<array.length;i++){
			if(stack.size()!=0 && (stack.peek().equals(pairs.get(array[i] )))){
				stack.pop();
			}else {
				stack.push(array[i]);
			}
		}
		return (stack.size() ==0)?1:0;
    }
	
	public static void main (String args[]){
		System.out.println(new Brackets().solution("{[()()]}"));
	}

}
