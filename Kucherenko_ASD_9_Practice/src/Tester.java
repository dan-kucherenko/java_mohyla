public class Tester {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(8);
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Peek is: " + stack.peek());
        stack.empty();
        System.out.println("Your element index is: " + stack.search(3));
        System.out.println(stack);

    }
}
