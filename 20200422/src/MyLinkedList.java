/**
 * @program: 20200422
 * @description
 * @author: Zhang Baolu
 * @create: 2020-04-22 18:16
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
    public Node head;

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            return;
        }
        node.next = head;
        this.head = node;

    }

    //打印单链表
    public void dispaly() {
        Node cur = this.head;
        while(cur != null) {
            System.out.println(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    // 尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        Node cur = this.head;
        while(cur != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    //查找是否包含关键字key在单链表中
    public boolean contains(int key) {
        Node cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //得到单链表的长度
    public int size(){
        int count = 0;
        Node cur = this.head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //任意位置插入，第一个数据节点为0号下标
    public void addIndex(int index,int data) {
        if(index == 0) {
            addFirst(data);
            return;
        }
        if(index == this.size()) {
            addLast(data);
            return;
        }
        Node node = new Node(data);
        //先找到index位置的前一个节点的地址
        Node cur = searchIndex(index);
        //进行插入
        node.next = cur.next;
        cur.next = node;
    }
    public Node searchIndex(int index) {
        //1、对index进行合法性检查
        if(index < 0 || index > this.size()) {
            throw new RuntimeException("index位置不合法！");
        }
        Node cur = this.head;//index-1
        while(index - 1 != 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }
}
