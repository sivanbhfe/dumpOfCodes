import java.util.Stack;

public class StackSort {
	static Stack<Integer> s1 = new Stack<Integer>();
	static Stack<Integer> s2 = new Stack<Integer>();
	
public static void main (String[] args) {
	s1.push(1);
	s1.push(2);
	s1.push(3);
	
	s2.push(4);
	s2.push(5);
	s2.push(6);
	
	for(int i=0;i<3;i++) {
	System.out.println(s1.pop());
	
}
for(int i=0;i<3;i++) {
System.out.println(s2.pop());
}
Stack<Integer> out = new Stack<Integer>();
while(!s1.isEmpty() && !s2.isEmpty()) {
	
}
/*
if(s1.peek()>s2.peek()) {
	while(!s2.isEmpty()) {
		s1.push(s2.pop());
	}
	} else {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
	}*/
for(int i=0;i<s2.size();i++) {
System.out.println(s2.pop());
}
System.out.println("Break");
for(int i=0;i<s1.size();i++) {
System.out.println(s1.pop());
}
}

}

