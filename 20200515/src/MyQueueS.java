import java.util.ArrayList;
import java.util.Stack;

/**
 * @program: 20200515
 * @description：用两个栈实现队列
 * @author: Zhang Baolu
 * @create: 2020-05-15 12:59
 **/
public class MyQueueS {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public  MyQueueS() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push (int x) {
        stack1.push(x);
    }

    public int pop() {
        if(empty()) {
            return -1;
        }
        if(stack2.empty()) {
            while(!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek() {
        if(empty()) {
            return -1;
        }
        if(stack2.empty()) {
            while(!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean empty() {
        if(stack1.empty() && stack2.empty()) {
            return true;
        }
        return false;
    }
}
