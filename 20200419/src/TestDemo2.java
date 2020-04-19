/**
 * @program: 20200419
 * @description
 * @author: Zhang Baolu
 * @create: 2020-04-19 16:32
 **/
public class TestDemo2 {
    public static void main(String[] args) {
        MyArrayList myArrayList1 = new MyArrayList();
        for(int i = 0;i < 10; i++) {
            myArrayList1.add(i,i);
        }
        myArrayList1.display();
        myArrayList1.add(10,112);
        myArrayList1.display();
    }
}
