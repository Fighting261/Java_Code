/**
 * @program: 20200505
 * @description
 * @author: Zhang Baolu
 * @create: 2020-05-05 12:05
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
    public Node head;//保存头节点

    //倒置单链表
    public Node reverseList() {
        Node cur = this.head;
        Node prev = null;//记录前一个节点
        Node newHead = null;
        while (cur != null) {
            Node curNext = cur.next;//记录下一个节点
            curNext = prev;
            prev = cur;
            cur = cur.next;
            if(curNext == null) {
                newHead = cur;
            }
        }
        return newHead;
    }

    //打印倒置单链表方法
    public void display2(Node newHead){
        Node cur = newHead;
        while (cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    //删除所有值为key的节点
    public void removeAllKey(int key){
        Node prev = this.head;
        Node cur = this.head.next;
        while(cur != null) {
            if(cur.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        if(this.head.data == key) {
            this.head = this.head.next;
        }
    }

    //返回链表的中间结点
    public Node middleNode() {
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    //输入一个链表，输出该链表中倒数第k个结点
    public Node findKthToTail(int k) {
        if(k < 0) {
            System.out.println("节点不合法");
        }
        Node slow = this.head;
        Node fast = this.head;
        while(k-1 >0) {
            if(fast.next != null) {
                fast = fast.next;
                k--;
            }else{
                System.out.println("没有这个节点");
                return null;
            }
        }
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    //以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
    public Node partition(int x) {
        Node bs = null;
        Node be = null;
        Node as = null;
        Node ae = null;
        Node cur = this.head;
        while(cur != null) {
            if (cur.data < x) {
                if (bs == null) {//第一次插入
                    bs = cur;
                    be = cur;
                } else {
                    be.next = cur;
                    be = be.next;
                }
            } else {
                if (as == null) {//第一次插入
                    as = cur;
                    ae = cur;
                } else {
                    ae.next = cur;
                    as = as.next;
                }
            }
            cur = cur.next;
        }
        //判断前半部分是否为空
        if(bs == null){
            return as;
        }
        //前半部分不为空则拼接
        be.next = as;
        //ae的next需要置为空
        if(ae != null) {
            ae.next = null;
        }
        return bs;
    }

}
