/**
 * @program: 20200421
 * @description
 * @author: Zhang Baolu
 * @create: 2020-04-21 19:13
 **/
class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MyLinkedList {
    public Node head;//保存单链表头节点的引用
    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);

        if(this.head == null) {
            //第一次插入节点
            this.head = node;
            return ;
        }
        node.next = this.head;
        this.head = node;
    }

    //打印单链表
    public void display() {
        Node cur = this.head;
        while(cur != null) {
            System.out.println(cur.data + " ");
            cur = cur.next;
        }
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }
}
