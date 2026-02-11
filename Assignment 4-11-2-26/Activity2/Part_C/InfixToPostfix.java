package test;
import java.util.Stack;

public class InfixToPostfix {
	static int precedence(char c) {
		if (c == '+' || c == '-')
		return 1;
		if (c == '*' || c == '/')
		return 2;
		return -1;
		}
	static String convert(String exp) {
	    String result = "";
	    Stack<Character> stack = new Stack<>();

	    for (char ch : exp.toCharArray()) {
	        if (Character.isLetterOrDigit(ch))
	            result += ch;
	        else {
	            while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek()))
	                result += stack.pop();
	            stack.push(ch);
	        }
	    }

	    while (!stack.isEmpty())
	        result += stack.pop();

	    return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(convert("A+B*C"));

	}

}
