package COLLECT;
import java.util.*;

public class StackArray {
	int[] stack;
	int top = -1;
	int size;
	
	StackArray(int size) {
	    this.size = size;
	    stack = new int[size];
	}

	void push(int value) {
	    if (top == size - 1) {
	        System.out.println("Stack Overflow");
	        return;
	    }
	    stack[++top] = value;
	    System.out.println(value + " pushed into stack");
	}

	void pop() {
	    if (top == -1) {
	        System.out.println("Stack Underflow");
	        return;
	    }
	    System.out.println(stack[top--] + " popped from stack");
	}

	void peek() {
	    if (top == -1) {
	        System.out.println("Stack is empty");
	        return;
	    }
	    System.out.println("Top element is " + stack[top]);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int s=sc.nextInt();
		StackArray a=new StackArray(s);
		a.push(10);
		a.push(20);
		a.push(30);
		a.pop();
		a.peek();

	}

}
