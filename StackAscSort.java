import java.util.*;

public class StackAscSort {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
       sort(stack);
       printStack(stack); 
    }

    // Method to sort the elements of the stack in ascending order
    static void sort(Stack<Integer> stack) {
        // Write your code here
    	if(!stack.empty()) {
    		int x = stack.pop(); 
    		sort(stack);
    		sortedInsert(stack, x); 
    	}
    	
    }
    static void sortedInsert(Stack<Integer> stack,int x) {
    
    	 if (stack.isEmpty() || x > stack.peek()) 
         { 
             stack.push(x); 
             return; 
         } 
    	 int temp = stack.pop(); 
         sortedInsert(stack, x); 
         stack.push(temp); 
    }
    static void printStack(Stack<Integer> stack) {
    int x=stack.size();
    Stack<Integer> stackout = new Stack<>();
    while(!stack.empty()) {
    	stackout.push(stack.pop());
    }
        System.out.print("[");
    	while(!stackout.empty()) {
    		System.out.print(stackout.pop());
    		if(x>1) {
    			System.out.print(", ");
    			x--;
    		} else {}
    		
    	} System.out.println("]");

    } 
}
