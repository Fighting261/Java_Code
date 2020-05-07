/**
 * @program: 20200507
 * @description
 * @author: Zhang Baolu
 * @create: 2020-05-07 15:10
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
    //输入两个链表，找出它们的第一个公共结点
    public Node getIntersectionNode(Node headA,Node headB){
        Node pl = headA;
        Node ps = headB;
        int lenA = 0;
        int lenB = 0;
        //1.求长度
        while(pl != null) {
            lenA++;
            pl = pl.next;
        }
        while(ps != null) {
            lenB++;
            ps = ps.next;
        }
        pl = headA;
        ps = headB;
        int len = lenA - lenB;
        if(lenA - lenB < 0){
            pl = headB;
            ps = headA;
            len = lenB- lenA;
        }
        //2.让pl和ps在同一个起点
        while(len > 0){
            pl = pl.next;
            len--;
        }
        while(ps != pl) {
            pl = pl.next;
            ps = ps.next;
        }
        if(pl!= null) {
            return pl;
        }
        return null;
    }

    //合并两个有序链表
    public Node mergeTwoLists(Node l1, Node l2) {
        Node newHead = new Node(-1);
        Node tmp = newHead;
        while(l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                tmp.next = l1;
                l1 = l1.next;
                tmp = tmp.next;
            } else {
                tmp.next = l2;
                l2 = l2.next;
                tmp = tmp.next;
            }
        }
        if(l1 == null) {
            tmp.next = l2;
        }
        if(l2 == null) {
            tmp.next = l1;
        }
        return newHead.next;
    }
}
