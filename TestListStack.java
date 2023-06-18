public class TestListStack {
    public static void main(String[] args) {
        ListStack<Integer> stack1 = new ListStack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        for (Object o : stack1.elements) {
            System.out.println(o);
        }
    }

}
