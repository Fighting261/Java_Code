/**
 * @program: 20200424
 * @description
 * @author: Zhang Baolu
 * @create: 2020-04-24 13:59
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
        node.next = this.head;
        this.head = node;
    }

    //打印单链表
    public void display() {
        Node cur = this.head;
        while(cur != null) {
            System.out.print(cur.data);
            cur = cur.next;
        }
        System.out.println();
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            return;
        }

        Node cur = this.head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    //查找是否包含关键字key在单链表中
    public boolean contains(int key) {
        Node node = new Node(key);
        Node cur = this.head;
        while(cur != null) {
            if(cur.data == key ) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //得到单链表的长度
    public int size(){
        Node cur = this.head;
        int count = 0;
        while(cur != null) {
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
        //index前一个位置的地址
        Node cur = searchIndex(index);
        //开始插入
        node.next = cur.next;
        cur.next = node;
        }

        //寻找index的前一个位置的地址
    public Node searchIndex(int index) {
        if(index < 0 || index > this.size()) {
            throw new RuntimeException("index位置不合法！");
        }
        Node cur = this.head;
        while(index-1 != 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }
    //删除第一个关键字为key的节点
    public void remove(int key,int data) {
       if(this.head == null) {
           return;
       }
       if(this.head.data == key) {
           this.head = this.head.next;
           return;
       }
       //找到节点的前一个节点
        Node prev = searchPrev(key);
       if(prev == null) {
           System.out.println("没有这个节点");
           return;
       }
       prev.next = prev.next.next;
    }

    //寻找节点的前一个结点
    public Node searchPrev(int key) {
        Node prev = this.head;
        while(prev.next != null) {
            if(prev.next.data == key) {
                return prev;
            }else{
                return prev.next;
            }
        }
        return null;
    }

    //清空单链表
    public void clear(){
        this.head = null;
    }

    //删除所有值为key的节点
    public void removeAllKey(int key){
        Node prev = this.head;//存放先驱节点
        Node cur = this.head.next;//存放要删除的节点
        while(cur != null) {
            if(cur.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else{
                prev = cur;
                cur = cur.next;
            }
        }
        if(head.data ==key){
            this.head = this.head.next;
        }
    }

    //反转一个单链表
    public Node reverseList() {
        Node cur = this.head;
        Node prev = null;
        Node newHead = null;
        while(cur != null) {
            Node curNext = cur.next;
            if(curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }
    //专属反转单链表打印方法
    public void display2(Node newHead){
        Node cur = newHead;
        while (cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    //给定一个带有头结点 head 的非空单链表，返回链表的中间结点
    public Node middleNode() {
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null || slow != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

}
