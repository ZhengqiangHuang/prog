import java.lang.reflect.Array;
import java.util.Arrays;

public class TestArrayStack{
    public static void main(String[] args) {
        Stack<Integer> stack1 = new ArrayStack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        System.out.println(stack1.size());
        System.out.println(stack1.top());
        System.out.println(stack1.pop());
        System.out.println(stack1.isEmpty());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.isEmpty());
        Stack<String> stack2 = new ArrayStack<>();
        stack2.push("a");
        stack2.push("b");
        stack2.push("c");
        stack2.push("d");
        stack2.push("e");
        System.out.println(stack2.size());
        System.out.println(stack2.top());
        System.out.println(stack2.pop());
        System.out.println(stack2.isEmpty());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.isEmpty());



    }
}
