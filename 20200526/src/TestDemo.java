/**
 * @program: 20200526
 * @description
 * @author: Zhang Baolu
 * @create: 2020-05-31 15:09
 **/
class Person {
}

class MyStack <T> {
    public T[] elem;
    public int top;

    public MyStack() {
        //this.elem = new T[10];
        this.elem = (T[])new Object[10]; //不能直接new泛型类
    }

    public void push(T val) {
        this.elem[this.top] = val;
        this.top++;
    }

    public T peek() {
        return this.elem[this.top-1];
    }
}
public class TestDemo {

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person);
        MyStack<Integer> myStack = new MyStack<>();
        System.out.println(myStack);
        MyStack<String> myStack2 = new MyStack<>();
        System.out.println(myStack2);
    }

    public static void main2(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(10);
        myStack.push(20);

        int ret = myStack.peek();
        System.out.println(ret);

        MyStack<String> myStack2 = new MyStack<>();
        myStack2.push("abcd");
        myStack2.push("efgh");
    }

    public static void main1(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(10);
        myStack.push("hello");

        String ret = (String)myStack.peek();
        System.out.println(ret);
    }
}
