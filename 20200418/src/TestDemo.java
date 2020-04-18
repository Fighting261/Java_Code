/**
 * @program: 20200418
 * @description
 * @author: Zhang Baolu
 * @create: 2020-04-18 21:24
 **/
class Person {
    public int age;//成员属性  实例变量    
    public String name;
    public String sex;
    public void eat() {
        //成员方法      
         System.out.println("吃饭!");
    }
    public void sleep() {
        System.out.println("睡觉!");
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Person person = new Person();//通过new实例化对象        
        person.eat();//成员方法调用需要通过对象的引用调用        
        person.sleep();
        // 产生对象     实例化对象        
        Person person2 = new Person();
        Person person3 = new Person();
    }
}
