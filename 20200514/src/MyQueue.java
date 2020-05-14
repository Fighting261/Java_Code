/**
 * @program: 20200514
 * @description：队列
 * @author: Zhang Baolu
 * @create: 2020-05-14 17:53
 **/
class Node {
    public int data;
    public Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MyQueue {
    public int usedSize;
    public Node front;//队头
    public Node rear;//队尾
    //入队
    public boolean offer(int val) {
        Node node = new Node(val);
        if(this.rear == null) {
            this.front = node;
            this.rear = node;
        }else{
            this.rear.next = node;
            this.rear = node;
        }
        this.usedSize++;
        return true;
    }
    //出队
    public int poll() {
        if(isEmpty()) {
            throw new RuntimeException("队列为空！");
        }
        int ret = this.front.data;
        this.front = this.front.next;
        this.usedSize--;
        return ret;
    }
    //返回队头数据
    public int peek() {
        if(isEmpty()) {
            throw new RuntimeException("队列为空！");
        }
        return this.front.data;
    }
    //判空
    public boolean isEmpty() {
        return this.usedSize == 0;
    }

    public int size() {
        return this.usedSize;
    }

}
