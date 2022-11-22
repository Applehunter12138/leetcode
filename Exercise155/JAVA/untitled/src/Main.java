import package1.Solution;

public class Main {
    public static void main(String[] args) {
        Solution stack = new Solution();

        stack.push(1);
        stack.push(2);
        System.out.println(stack.getMin());
        stack.push(-1);
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
    }
}