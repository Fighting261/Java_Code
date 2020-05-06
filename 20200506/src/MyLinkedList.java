/**
 * @program: 20200506
 * @description
 * @author: Zhang Baolu
 * @create: 2020-05-06 12:12
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

    //给定一个链表，判断链表中是否有环
    public boolean hasCycle() {
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }

    //给定一个链表，返回链表开始入环的第一个节点。如果链表无环，则返回 null
    public Node detectCycle() {
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if(fast == null || fast.next == null) {
            return null;
        }
        slow = this.head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }


    // 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
    public Node deleteDuplication() {
        Node cur = this.head;
        Node newHead = new Node(-1);
        Node tmp = newHead;
        while(cur != null) {
            if(cur.next != null && cur.data == cur.next.data) {
                while (cur.next != null && cur.data == cur.next.data){
                    cur = cur.next;
                }
                cur = cur.next;
            }else {
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        tmp.next = null;
        return newHead.next;
    }


    //链表的回文结构。
    public boolean chkPalindrome() {
        if(this.head == null) {//为空
            return false;
        }
        if(this.head.next == null) {//只有头节点
            return true;
        }
        //1.找中间节点
        Node fast = this.head;
        Node slow = this.head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        //2.反转后半部分，slow在中间位置
        Node cur = slow.next;
        while(cur != null ) {
            Node curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }

        while(slow != this.head) {
            if(slow.data != this.head.data) {
                return false;
            }
            if(this.head.next == slow) {//如果是偶数
                return true;
            }
            slow = slow.next;
            this.head = this.head.next;
        }
        return true;
    }
}

