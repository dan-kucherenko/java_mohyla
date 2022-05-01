import java.util.Stack;

public class Tester {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(8);
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Peek is: " + stack.peek());
        stack.empty();
        System.out.println("Your element index is: " + stack.search(8));
        System.out.println(stack);

    }
}
