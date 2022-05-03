import java.util.List;
import java.util.Stack;

public class LearnStack {
    /* while using stack...we directly use Stack class ...
    *we don't implement list interface with stack class because it doesn't push() ,pop() ,peek() functions
    */

    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();
        stack.push(1); stack.push(2); stack.push(3); stack.push(4); stack.push(5);
//        System.out.println(stack);
//        System.out.println(stack.peek());
//        stack.pop();
//        System.out.println(stack);
//        System.out.println(stack.peek());
        while(!stack.isEmpty()){
            System.out.println("Now the top element " + stack.pop());
        }
    }
}
