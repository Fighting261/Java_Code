/**
 * @program: 20200423
 * @description
 * @author: Zhang Baolu
 * @create: 2020-04-23 16:24
 **/
public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        /*myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(3);
        myLinkedList.display();*/
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        myLinkedList.addLast(5);
        myLinkedList.display();
        System.out.println(myLinkedList.contains(5));
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        myLinkedList.addLast(5);
        myLinkedList.removeAllKey(5);
        myLinkedList.display();

    }



}
