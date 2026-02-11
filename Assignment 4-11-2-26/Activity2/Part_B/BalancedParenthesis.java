package COLLECT;
import java.util.*;

public class BalancedParanthesis {
	static boolean isBalanced(String exp) {
		//Used my stack implementation custom class 
		Stack<Character> stack = new Stack<>();
		for (char ch : exp.toCharArray()) {
	        if (ch == '(')
	            {stack.push(ch);}
	        else if (ch == ')') {
	            if (stack.isEmpty())
	                {return false;}
	            stack.pop();
	        }
	    }
	    return stack.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp = "(A+B)+(A-B)";
	    if (isBalanced(exp))
	        System.out.println("Balanced");
	    else
	        System.out.println("Not Balanced");
	}

}
