/*10. Implement a Stack Using Deque 
Problem: 
• Use Deque<Integer> to implement a stack with: 
o push(int x) 
o pop() 
o peek() 
o isEmpty() 
Hint: Use ArrayDeque<Integer> with addFirst() and removeFirst().*/
import java.util.Deque;
import java.util.ArrayDeque;

class MyStack{
    Deque<Integer> stack = new ArrayDeque<>();

    public void push(int x){
        stack.addFirst(x);
    }
    public int pop(){
       return stack.removeFirst();
    }
    public int peek(){
       return stack.peekFirst();
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }

}
public class ques10{
  public static void main(String[] args){
    MyStack s = new MyStack();
    s.push(10);
    s.push(80);
    s.push(16);
    
    System.out.println(s.pop());   
        System.out.println(s.peek());  
        System.out.println(s.isEmpty());    

  }
}
