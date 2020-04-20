/**
 * @program: 20200420
 * @description
 * @author: Zhang Baolu
 * @create: 2020-04-20 14:42
 **/
public class TestDemo {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        /*myArrayList.add(0,21);
        myArrayList.add(1,15);
        myArrayList.add(2,32);
        myArrayList.add(3,8);
        myArrayList.display();*/
       for(int i = 0; i < 10; i++) {
           myArrayList.add(i,i);
       }
        myArrayList.display();
        /*myArrayList.add(2,5);
        myArrayList.display();*/
        /*System.out.println(myArrayList.contains(5));
        System.out.println(myArrayList.contains(15));
        System.out.println(myArrayList.search(9));*/
       /* System.out.println(myArrayList.getPos(9));
        System.out.println(myArrayList.getPos(10));*/
        /*myArrayList.remove(5)
        myArrayList.display();*/
        /*myArrayList.clear();
        myArrayList.display();*/
        myArrayList.setPos(9,10);
        myArrayList.display();
    }
}
