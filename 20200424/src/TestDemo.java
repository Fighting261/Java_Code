/**
 * @program: 20200424
 * @description
 * @author: Zhang Baolu
 * @create: 2020-04-24 14:38
 **/
public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
       /* myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(3);
        myLinkedList.display();*/
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        myLinkedList.addLast(5);
        myLinkedList.display();
        System.out.println(myLinkedList.contains(5));
        System.out.println(myLinkedList.size());
    }
}
