import java.util.Stack;

public class Stackoperation{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Pop: " + stack.pop());  
        System.out.println("Pop: " + stack.pop());  
       
        System.out.println("Top element: " + stack.peek());  

        System.out.println("Is the stack empty? " + stack.isEmpty());  
    }
}

