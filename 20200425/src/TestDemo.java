/**
 * @program: 20200425
 * @description
 * @author: Zhang Baolu
 * @create: 2020-04-25 10:37
 **/
public class TestDemo {

    public static int getLen(Node head) {
        int len = 0;
        Node cur = head;
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        return len;
    }

    // 输入两个链表，找出它们的第一个公共结点。
    public static Node getIntersectionNode(Node headA, Node headB) {
        Node pl = headA;
        Node ps = headB;
        int lenA = getLen(headA);
        int lenB = getLen(headB);
        int len = lenA - lenB;
        if(len < 0) {
            pl = headB;
            ps = headA;
            len = lenB - lenA;
        }
        for(int i = 0; i < len; i++) {
            pl = pl.next;
        }
        //pl和ps在同一点
        while(ps != pl && pl!= null && ps != null) {
            ps = ps.next;
            pl = pl.next;
        }
        if(pl == ps && pl != null) {
            return pl;
        }
        return null;
    }

    //将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
    public static Node mergeTwoLists(Node headA, Node headB) {
        Node newHead = new Node(-1);
        Node tmp = newHead;
        while (headA != null && headB != null) {
            if(headA.data < headB.data) {
                tmp.next = headA;
                headA = headA.next;
                tmp = tmp.next;
            }else {
                tmp.next = headB;
                headB = headB.next;
                tmp = tmp.next;
            }
        }
        if(headA != null) {
            tmp.next = headA;
        }
        if(headB != null) {
            tmp.next = headB;
        }
        return newHead.next;
    }
    public static void main(String[] args) {

    }
}
