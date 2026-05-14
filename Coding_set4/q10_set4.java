/* Implement a Stack Using Deque 
Problem: 
• Use Deque<Integer> to implement a stack with: 
o push(int x)  
o pop() 
o peek() 
o isEmpty() 
Hint: Use ArrayDeque<Integer> with addFirst() and removeFirst().*/
import java.util.*;

public class q10_set4 {
    private Deque<Integer> stack = new ArrayDeque<>();

    public void push(int x) { stack.addFirst(x); }
    public int pop() { return stack.removeFirst(); }
    public int peek() { return stack.peekFirst(); }
    public boolean isEmpty() { return stack.isEmpty(); }

    public static void main(String[] args) {
        q10_set4 s = new q10_set4();
        s.push(10);
        s.push(20);
        System.out.println(s.pop()); // 20
    }
}