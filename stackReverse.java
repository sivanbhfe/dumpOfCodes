import java.util.*;

public class stackReverse {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        reverseSecondHalf(stack);
    }

    // Method to reverse the last half of the elements from the bottom of the stack
    static void reverseSecondHalf(Stack<Integer> stack) {
        // Write your code here
    	Stack<Integer> stack1 = new Stack<Integer>();
    	Stack<Integer> stack2 = new Stack<Integer>();
    	int n = stack.size()/2;
       	while(n>=1) {
    		stack1.push(stack.pop());
    		n--;
    	}
    	while(!stack.empty()) {
    		stack2.push(stack.pop());
     	}
     	while(!stack2.empty()) {
    		stack.push(stack2.pop());
    	}
    	while(!stack1.empty()) {
    		stack2.push(stack1.pop());
       	}
    	while(!stack2.empty()) {
    		stack.push(stack2.pop());
    	}
    	while(!stack.empty()) {
    		stack1.push(stack.pop());
    	}
    	int x = stack1.size();
    	System.out.print("[");
    	while(!stack1.empty()) {
    		System.out.print(stack1.pop());
    		if(x>1) {
    			System.out.print(", ");
    			x--;
    		} else {}
    		
    	} System.out.println("]");

    }
}