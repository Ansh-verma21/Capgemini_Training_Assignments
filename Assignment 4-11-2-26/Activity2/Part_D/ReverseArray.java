package test;

import java.util.Stack;

class ReverseArray {
public static void main(String[] args) {
int[] arr = {1, 2, 3, 4};
Stack<Integer> stack = new Stack<>();
System.out.println("Original");
	for(int num:arr)
		System.out.print(num +" ");
	System.out.println();
	
    for (int num : arr)
        stack.push(num);

    for (int i = 0; i < arr.length; i++)
        arr[i] = stack.pop();
    System.out.println("Reversed");
    for (int num : arr)
        System.out.print(num + " ");
}


}
