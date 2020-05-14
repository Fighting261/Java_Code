/**
 * @program: 20200514
 * @description:循环队列
 * @author: Zhang Baolu
 * @create: 2020-05-14 18:17
 **/
public class MyCircularQueue {
    public int[] elem;
    public int front;
    public int rear;

    public MyCircularQueue(int k) {
        this.elem = new int[k];//k+1
    }

    public boolean enQueue(int value) {
        if(isFull()) {
            return false;
        }
        this.elem[this.rear] = value;
        this.rear = (this.rear+1)%this.elem.length;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()) {
            return false;
        }
        this.front = (this.front+1)%this.elem.length;
        return true;
    }

    public int Front() {
        if(isEmpty()) {
            return -1;
        }
        return this.elem[this.front];
    }

    public int Rear() {
        if(isEmpty()) {
            return -1;
        }

        int index = this.rear == 0 ? this.elem.length-1 : this.rear-1;

        return this.elem[index];
        //return this.elem[this.rear-1];
    }

    public boolean isEmpty() {
        return this.rear == this.front;
    }

    public boolean isFull() {
        if( (this.rear+1)%this.elem.length == this.front ) {
            return true;
        }
        return false;
    }
}
