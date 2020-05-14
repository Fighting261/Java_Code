import org.omg.CORBA.Object;

import java.util.Arrays;

/**
 * @program: 20200514
 * @description:堆
 * @author: Zhang Baolu
 * @create: 2020-05-14 17:34
 **/
public class MyStack<T> {
    public T[] elem;
    public int top;

    public MyStack() {
        this.elem = (T[])new Object[10];
    }

    public void push (T val) {
        if(isfull()) {
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        this.elem[top] = val;
        top++;
    }

    public boolean isfull() {
        return this.top == this.elem.length;
    }

    public boolean empty() {
        return this.top == 0;
    }

    public T pop() {
        if(empty()) {
            throw new RuntimeException("栈为空！");
        }
        return this.elem[--this.top];
    }

    public T peak() {
        if(empty()) {
            throw new RuntimeException("栈为空！");
        }
        return this.elem[this.top-1];
    }

    public int size() {
        return this.top;
    }
}
