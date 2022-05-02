public class StackTester {
    public static void main(String[] args) {
        stackDefaultMethods();
        stackMethodsWithExceptions();
    }

    private static void stackDefaultMethods() {
        System.out.println("Stack default: \n");
        MyStack<Integer> stackDefault = new MyStack<>();
        stackDefault.push(2);
        stackDefault.push(3);
        stackDefault.push(4);
        stackDefault.push(8);
        System.out.println("Popped element is: " + stackDefault.pop());
        System.out.println(stackDefault);
        System.out.println("Peek is: " + stackDefault.peek());
        stackDefault.empty();
        System.out.println("Your element index is: " + stackDefault.search(8));
        System.out.println(stackDefault);
    }

    private static void stackMethodsWithExceptions() {
        System.out.println("\n\nStack with exceptions: \n");
        MyStack<Integer> stackWithExceptions = new MyStack<>();
        System.out.println("Popped element is: " + stackWithExceptions.pop());
        System.out.println(stackWithExceptions);
        System.out.println("Peek is: " + stackWithExceptions.peek());
        stackWithExceptions.empty();
        System.out.println("Your element index is: " + stackWithExceptions.search(8));
        System.out.println(stackWithExceptions);
    }
}
